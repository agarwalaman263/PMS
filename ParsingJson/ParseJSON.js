let ParseJSON=(data)=>{
	return new Promise((resolve,reject)=>{
		try{
			console.log(JSON.parse(data))
			resolve(JSON.parse(data))
		}
		catch(e){
			reject('Unable to parse the JSON')
		}
	})
}
module.exports={
	"main": ParseJSON
}