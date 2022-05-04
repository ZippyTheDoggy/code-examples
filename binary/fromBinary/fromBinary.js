function fromBinary(str) {
    let i = 1;
    return str.split("").reverse().map(e => {
        e = parseInt(e) * i;
        i *= 2
        return e;
    }).reduce((a, b) => a + b);
}

console.log(`0110: ${fromBinary("0110")};  expected 6`);
console.log(`1111: ${fromBinary("1111")};  expected 15`);
console.log(`00111100: ${fromBinary("00111100")};  expected 60`)
