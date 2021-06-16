"use strict";
exports.__esModule = true;
exports.isArmstrongNumber = exports.generateArmstrongNumbers = void 0;
function generateArmstrongNumbers(start, end) {
    var armstrongNumbers = [];
    for (var i = start; i < end + 1; i++) {
        if (isArmstrongNumber(i))
            armstrongNumbers.push(i);
    }
    return armstrongNumbers;
}
exports.generateArmstrongNumbers = generateArmstrongNumbers;
function isArmstrongNumber(input) {
    var numberOfDigits = getNumberOfDigits(input);
    var digitsArray = getDigits(input);
    var armstrongNumberCandidate = digitsArray.reduce(function (accumulator, currentValue) { return accumulator + (Math.pow(currentValue, numberOfDigits)); }, 0);
    return (input > -1 ? input === armstrongNumberCandidate : false);
}
exports.isArmstrongNumber = isArmstrongNumber;
function getNumberOfDigits(input) {
    return Math.floor(Math.log10(input) + 1);
}
function getDigits(input) {
    var nmbr = input;
    var digits = [];
    if (nmbr > 0) {
        while (nmbr > 0) {
            digits.push(Math.floor(nmbr % 10));
            nmbr = Math.floor(nmbr / 10);
        }
        digits = digits.reverse();
    }
    else if (nmbr === 0) {
        digits.push(0);
    }
    return digits;
}
var oneNumber = 370;
var result = isArmstrongNumber(oneNumber);
result ? console.log(oneNumber, "is an armstrong number.") : console.log(oneNumber, "is NOT an armstrong number.");
var start = 100;
var end = 999;
var armstrongnumbers = generateArmstrongNumbers(start, end);
console.log("3 digit armstrong numbers are", armstrongnumbers);
