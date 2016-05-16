package info.lotharschulz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppTest {
    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){

    }

    @Test
    public void testGetArmstrongNumbers(){
        //App.getArmstrongNumbers(300,310);
        ArrayList<Integer> threeDigitArmstrongNumbers = new ArrayList<Integer>();
        threeDigitArmstrongNumbers.add(153);
        threeDigitArmstrongNumbers.add(370);
        threeDigitArmstrongNumbers.add(371);
        threeDigitArmstrongNumbers.add(407);
        assertEquals(threeDigitArmstrongNumbers, App.getArmstrongNumbers(100,999));
        threeDigitArmstrongNumbers.add(1);
        assertNotEquals(threeDigitArmstrongNumbers, App.getArmstrongNumbers(100,999));
    }

    @Test
    public void testGetArmstrongNumbersAlt(){
        //App.getArmstrongNumbers(300,310);
        ArrayList<Integer> threeDigitArmstrongNumbers = new ArrayList<Integer>();
        threeDigitArmstrongNumbers.add(153);
        threeDigitArmstrongNumbers.add(370);
        threeDigitArmstrongNumbers.add(371);
        threeDigitArmstrongNumbers.add(407);
        assertEquals(threeDigitArmstrongNumbers, App.getArmstrongNumbersAlt(100,999));
        threeDigitArmstrongNumbers.add(1);
        assertNotEquals(threeDigitArmstrongNumbers, App.getArmstrongNumbersAlt(100,999));
    }

    @Test
    public void testIsArmstrongNumber(){
        assertTrue(App.isArmstrongNumber(153));
        assertFalse(App.isArmstrongNumber(154));
    }

    @Test
    public void testIsArmstrongNumberAlt(){
        assertTrue(App.isArmstrongNumberAlt(153));
        assertFalse(App.isArmstrongNumberAlt(154));
    }

    @Test
    public void testGetDigits(){
        ArrayList<Integer> digits = new ArrayList<Integer>();
        digits.add(1);
        digits.add(0);
        assertEquals(digits, App.getDigits(10));
        digits = new ArrayList<Integer>();
        digits.add(0);
        assertEquals(digits, App.getDigits(0));
        digits = new ArrayList<Integer>();
        assertEquals(digits, App.getDigits(-1));
    }

    @Test
    public void testGetDigitsAlt(){
        ArrayList<Integer> digits = new ArrayList<Integer>();
        digits.add(1);
        digits.add(0);
        assertEquals(digits, App.getDigitsAlt(10));
        digits = new ArrayList<Integer>();
        digits.add(0);
        assertEquals(digits, App.getDigitsAlt(0));
        digits = new ArrayList<Integer>();
        assertEquals(digits, App.getDigitsAlt(-1));
    }

    @Test
    public void testGetNumberOfDigits(){
        assertEquals(1, App.getNumberOfDigits(0));
        assertEquals(1, App.getNumberOfDigits(1));
        assertEquals(1, App.getNumberOfDigits(-1));
        assertEquals(6, App.getNumberOfDigits(100000));
    }

    @Test
    public void testGetNumberOfDigitsAlt(){
        assertEquals(1, App.getNumberofDigitsAlt(0));
        assertEquals(1, App.getNumberofDigitsAlt(1));
        assertEquals(1, App.getNumberofDigitsAlt(-1));
        assertEquals(6, App.getNumberofDigitsAlt(100000));
    }
    
    @Test
    public void testArrayList2String(){
        ArrayList<Integer> digits = new ArrayList<Integer>();
        digits.add(1);
        digits.add(0);
        assertEquals("1, 0", App.arrayList2String(digits));
        digits = new ArrayList<Integer>();
        assertEquals("", App.arrayList2String(digits));
        assertEquals("", App.arrayList2String(null));
    }

    @Test
    public void testIntArrayToArrayListInteger(){
        int[] ints = {-3, 0, 100};
        ArrayList<Integer> Ints = new ArrayList<Integer>();
        Ints.add(-3);
        Ints.add(0);
        Ints.add(100);
        assertEquals(Ints, App.intArrayToArrayListInteger(ints));
        assertEquals(null, App.intArrayToArrayListInteger(null));
    }

}
