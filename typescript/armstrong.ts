export function generateArmstrongNumbers(start: number, end: number): number[] {
    const armstrongNumbers:number[] = [];
    for(let i = start; i < end+1; i++){
        if (isArmstrongNumber(i)) armstrongNumbers.push(i);
    }
    return armstrongNumbers;
}

export function isArmstrongNumber(input: number): boolean {
    const numberOfDigits = getNumberOfDigits(input);
    const digitsArray = getDigits(input);
    const armstrongNumberCandidate = digitsArray.reduce((accumulator: number, currentValue: number) => accumulator + (Math.pow(currentValue, numberOfDigits)), 0);
    return (input > -1 ? input === armstrongNumberCandidate : false);
}

function  getNumberOfDigits(input: number): number {
    return Math.floor(Math.log10(input)+1);
}

function getDigits(input: number): number[] {
    let nmbr = input;
    let digits:number[] = []; 
    if(nmbr>0){
        while (nmbr > 0) {
            digits.push(Math.floor(nmbr % 10));
            nmbr = Math.floor(nmbr / 10);
        }
        digits = digits.reverse();
    } else if (nmbr === 0) {
        digits.push(0);
    }
    return digits;
}

const oneNumber = 370;
const result = isArmstrongNumber(oneNumber);
result ? console.log(oneNumber, "is an armstrong number.") : console.log(oneNumber, "is NOT an armstrong number.");

const start = 100;
const end = 999;
const armstrongnumbers = generateArmstrongNumbers(start, end);
console.log("3 digit armstrong numbers are", armstrongnumbers);