const fs=require('fs')



const pathToData=process.argv[2]




fs.readFile(pathToData, 'utf8', (error,data)=>{
	console.log(JSON.parse(data))
	console.log(typeof(JSON.parse(data)))
});