//tcp
/*
var client = net.connect(8000, 'localhost');//127.0.0.1
client.setEncoding('utf8');
setInterval(function() {
  console.log("Writing....")
  client.write('Hello from node.js\n');
}, 1000);

client.on('data', function(data) {
  console.log("Received:", arguments)
})
*/
var dgram = require('dgram');
var message = new Buffer.from("Hola!");
var client = dgram.createSocket("udp4");

client.on("menssage", function(msg, info){
	console.log("recibido: " + msg + "de" + rinfo.address);	
});

client.on("listening", function(){
	console.log("cliente escuchando" + client.address().address);
	client.send(message, 0, message.length, 8000, "127.0.0.1");
});


client.bind(8000);