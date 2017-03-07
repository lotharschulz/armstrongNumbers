package info.lotharschulz;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class App
{
    public static void main( String[] args ){
        System.out.println(
            MessageFormat.format("armstrong numbers between 100 & 999 are: \"{0}\"",
                    array2String(getArmstrongNumbers(100, 999))));
    }

    public static int[] getArmstrongNumbers(final int start, final int end){
        if (start < 1) throw new IllegalArgumentException("start has to be at least 0");
        if (end < start) throw new IllegalArgumentException("end has to be greater than start");

        return IntStream.range(start, end+1).filter(number -> App.isArmstrongNumber(number)).toArray();
    }

    public static ArrayList<Integer> getArmstrongNumbersAlt(final int start, final int end){
        if (start < 1) throw new IllegalArgumentException("start has to be at least 0");
        if (end < start) throw new IllegalArgumentException("end has to be greater than start");

        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i = start; i < end+1; i++){
            if (isArmstrongNumber(i)) results.add(i);
        }
        return results;
    }

    public static boolean isArmstrongNumber(final int i){
        if(i > -1) return i == getDigits(i).stream().mapToInt(val -> (int)Math.pow(val.intValue(),getNumberOfDigits(i))).sum();
        else return false;
    }

    public static boolean isArmstrongNumberAlt(final int i){
        int result = 0;
        int numberOfDigits = getNumberOfDigits(i);
        //int numberOfDigits = getNumberofDigitsAlt(i);
        ArrayList<Integer> digits = getDigits(i);
        //ArrayList<Integer> digitsAlt = getDigitsAlt(i);
        for (Integer digit: digits){
        //for (Integer digit: digitsAlt){
            result += (int)Math.pow(digit,numberOfDigits);
        }
        return result == i;
    }

    public static int getNumberOfDigits(final int number){
        if (number == 0) return 1;
        return (int)Math.log10(number) + 1;
    }

    public static int getNumberofDigitsAlt(final int number){
        if (number < 0) return new Integer(number).toString().length()-1;
        return new Integer(number).toString().length();
    }

    public static ArrayList<Integer> getDigits(final int number){
        int nmbr = number;
        ArrayList<Integer> digits = new ArrayList<Integer>();
        if(nmbr>0){
            while (nmbr > 0) {
                digits.add(nmbr % 10);
                nmbr = nmbr / 10;
            }
            Collections.reverse(digits);
        } else if (nmbr == 0) {
            digits.add(0);
        }
        return digits;
    }

    public static ArrayList<Integer> getDigitsAlt(final int number) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        if(number >= 0) {
            final String iAsString = new Integer(number).toString();
            for (int k = 0; k < iAsString.length(); k++) {
                digits.add(Integer.parseInt(iAsString.substring(k, k + 1)));
            }
        }
        return digits;
    }

    public static String arrayList2String(final ArrayList<Integer> list){
        if (null == list) return "";
        StringBuilder sb = new StringBuilder();
        list.forEach( o -> sb.append(o.toString()).append(", ") );
        if(sb.toString().length() < 2)  return sb.toString();
        return sb.toString().substring(0, sb.toString().length()-2);
    }

    public static String array2String(final int[] ints){
        if (null == ints) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ints.length; i++){
            sb.append(ints[i]).append(", ");
        }
        if(sb.toString().length() < 2){
            return sb.toString();
        }
        return sb.toString().substring(0, sb.toString().length()-2);
    }

    public static ArrayList<Integer> intArrayToArrayListInteger(final int[] i){
        if (null == i) return null;
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int a = 0; a < i.length; a++) results.add(i[a]);
        return results;
    }

}
