const fs = require('fs')
const ReadJson = require('./ReadingJson/ReadingJson')
const ParsingJSON = require('./ParsingJSON/ParseJSON')

if (process.argv.length != 3) {
    console.log("The parameter is incorrectly passed. Kindly Check into it. ")
} else {
    let PathToData = process.argv[2];
    let DataStored = null;
    let FeatureStored = null;
    ReadJson.main(PathToData)
        .then(data => ParsingJSON.main(data))
        .then(data => {
        	DataStored=data;
        	return ReadJson.main("./Database/feature.json")
        })
        .then(data=>ParsingJSON.main(data))
        .then(data=>{FeatureStored=data})

        .catch(error => console.log(error))

}
