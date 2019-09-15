const ws = new WebSocket("ws://localhost:5001/")
const demoJSON = {

    type: 'Generator',
    patientId: "1123",
    features: {
        pulseRate: 108,
        insulinLevel: 63,
    }
}
ws.onopen = () => {
    ws.send(JSON.stringify({
        type: "GeneratorSetter",
        patientId:"1123"
    }))
}

setInterval(() => {
    ws.send(JSON.stringify(demoJSON))
    console.log("aman")
}, 1000)