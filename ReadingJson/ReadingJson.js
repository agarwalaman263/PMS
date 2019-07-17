const fs = require('fs')

let ReadJSON = (Path) => {

    return new Promise((resolve, reject) => {

        fs.readFile(Path, 'utf8', (error, data) => {
            if (error != null) {
                reject('Unable to read a file.')
            } else {
                resolve(data);
            }
        });
    })
}

module.exports = {
    "main": ReadJSON
}