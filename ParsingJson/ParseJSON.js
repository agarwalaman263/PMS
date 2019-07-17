let ParseJSON=(data)=>{
	return new Promise((resolve,reject)=>{
		try{
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