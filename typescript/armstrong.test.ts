import {isArmstrongNumber, generateArmstrongNumbers} from './armstrong';

describe('Armstrong Numbers', () => {
    it('5,153,370,371,407 are Armstrong numbers', () => {
        expect(isArmstrongNumber(5)).toBeTruthy();
        expect(isArmstrongNumber(153)).toBeTruthy();
        expect(isArmstrongNumber(370)).toBeTruthy();
        expect(isArmstrongNumber(371)).toBeTruthy();
        expect(isArmstrongNumber(407)).toBeTruthy();
    });

    it('153,370,371,407 are Armstrong numbers between 100 and 999', () => {
        expect(generateArmstrongNumbers(100,999)).toEqual([ 153, 370, 371, 407 ]);
    });

    it('154,100,-100,-1 are _NOT_ Armstrong numbers', () => {
        expect(isArmstrongNumber(154)).toBeFalsy();
        expect(isArmstrongNumber(100)).toBeFalsy();
        expect(isArmstrongNumber(-100)).toBeFalsy();
        expect(isArmstrongNumber(-1)).toBeFalsy();
    });
});
