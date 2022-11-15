//const calculadora = require("../calculadora");
//const indexTest=require("../calculadora")
import { indexTest } from "../calculadora";
test ("test suma",()=>{
    const r=indexTest.suma(1,5)
    expect(r).toBe(6)
})
test.todo('test de resta');
test.todo('test de multiplicacion');
test.todo('test de división');