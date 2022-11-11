console.log("Hola mundo desde JS");
const parrotSay = require('parrotsay-api')
 
parrotSay('Satoshi campeon mundial')
  .then(console.log)
  .catch(console.error)