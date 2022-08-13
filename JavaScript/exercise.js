
function hello() {
    console.log('Hello World');
}


console.log(typeof hello);

console.log("/////////////////////////////");

console.log(hello == hello);

console.log("/////////////////////////////");

console.log(hello instanceof Function);

console.log("/////////////////////////////");

console.log(hello.length)

console.log("/////////////////////////////");

function helloWorld(name) {
    console.log('Hello ' + name);
}

console.log("/////////////////////////////");


console.log(helloWorld.length);

console.log("/////////////////////////////");

console.log(helloWorld.name);

console.log("/////////////////////////////");

console.log(helloWorld.toString());

console.log("/////////////////////////////");

console.log(helloWorld.call(null, 'World'));

console.log("/////////////////////////////");

console.log(helloWorld.arguments)

console.log("/////////////////////////////");

const bolme = ({ sayi1 }) => {
    // dikkat sayi2 unutuldureturn sayi1 / sayi2;
    return sayi1;
}
const sayilar = {
    sayi1: 8,
    sayi2: 4
    // ama sayi2 gonderdik
}

console.log(bolme(sayilar));


console.log("/////////////////////////////");

const cikarma = ({ sayi1, sayi2 }) => {
    // Bu satira dikkat
    return sayi1 - sayi2;
}
const sayilar2 = {
    sayi2: 3,
    sayi1: 5
}
console.log(cikarma(sayilar2))
// sonuc 2



console.log("/////////////////////////////");
let [,pronoun,,name]=["Merhaba","benim","adım","Mehmet"]; console.log(pronoun) ; console.log(name)