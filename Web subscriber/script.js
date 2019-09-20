var ws= new WebSocket('ws://localhost:5001',['Customer',13])
ws.onopen=()=>{
    ws.send(JSON.stringify({
        type:"SubscriberSetter",
        patientId:"1"
    }))
    ws.onmessage=(e)=>{
        document.getElementsByTagName("body")[0].innerHTML+=e.data+'<br>';
    }
    ws.onclose=()=>{
        document.getElementsByTagName("body")[0].innerHTML+='Closed<br>';
    }
}