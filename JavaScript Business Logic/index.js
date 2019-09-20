var server = require('ws').Server
const fs = require('fs')
var client = require('ws')
const generatorValidator = require('./generatorValidator/index')
const LogPrinter = require('./LogPrinter/index')
let ListOffeatures = [];
let dataReceiver = new client('ws://localhost:8098/generator');
var serverInstance = new server({
    port: 5001
}, () => {
    fs.readFile('./features/Feature.json', 'utf8', (error, data) => {
        ListOffeatures = JSON.parse(data)
    })
})
let SetOfPatients = new Set([]);
serverInstance.on('connection', (ws) => {
    dataReceiver.send('aman')
    dataReceiver.on('message', (message) => {

        message = JSON.parse(message)
        if (message["patientDemographics"]['type'] == 'GeneratorSetter') {
            generatorValidator.main(ws._socket.remoteAddress).then(() => {
                SetOfPatients.add(message['patientDemographics']['patientId'])
            })
                .catch(err => {
                    ws.send('Not A valid generator')
                    console.log('not a valid generator', err)
                    ws.close();
                })
        }
        else if (message["patientDemographics"]['type'] == 'Generator') {
            generatorValidator.main(ws._socket.remoteAddress).then(() => {
                serverInstance.clients.forEach((client) => {
                    if (client != ws && client.type == 'Subscriber' && client.patientId == message["patientDemographics"].patientId) {
                            console.log(LogPrinter.main(message["patientVitals"], ListOffeatures))
                        client.send(JSON.stringify(LogPrinter.main(message["patientVitals"], ListOffeatures)))
                    }
                })
            })
                .catch(err => {
                    ws.send('Error Occured')
                    console.log('Error occured', err)
                    ws.close();
                })
        }

        else {
            ws.send('Invalid Type1');
            ws.close();
        }
    })

    ws.on('message', (message) => {
        message = JSON.parse(message)
        if (message["type"] == 'SubscriberSetter') {
            if (SetOfPatients.has(message['patientId'])) {

                ws['type'] = 'Subscriber'
                ws['patientId'] = message['patientId']
            }
            else {
                ws.emit("The patient monitorring is switched off. Contact the PMS manager")
                ws.close();
            }
        }
        else if (message.type == 'Subscriber') {
            ws.send('Subscriber is not allowed to send Data');
            ws.close();
            console.log('Subscriber is not allowed to send Data');
        }
        else {
            ws.send('Invalid Type');
            ws.close();
        }
    }
    )
    ws.on('error', (error) => {
        console.log(JSON.stringify(error))
        ws.close();
    })
    ws.on('close', () => {
        console.log('Closed')
    })
})
