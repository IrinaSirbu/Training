import java.util.LinkedList;
import java.util.List;

/**
 * Created by isirbu on 10/27/2016.
 */

public class Main extends Exception{

    /* EXERCISE 1 */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
            return true;
        } else {
            return false;
        }
    }

    /* EXERCISE 2 */
    public static boolean parrotTrouble(boolean talking, int hour) {

        if(talking) {
            if ((hour < 7) || (hour > 20)) {
                return true;
            }
        }

        return false;
    }

    /* EXERCISE 3 */
    public static boolean posNeg(int a, int b, boolean negative) {

        if(negative){
            if(a < 0 && b < 0){
                return true;
            }
        } else{
            if((a < 0 && b > 0) || (a > 0 && b < 0)){
                return true;
            }
        }

        return false;
    }

    /* EXERCISE 4 */
    public static String backAround(String str) {

        char lastChar = str.charAt(str.length() - 1);

        String newStr;
        newStr = lastChar + str + lastChar;

        return newStr;
    }

    /* EXERCISE 5 */
    public static String everyNth(String str, int n) {

        String newStr = new String();
        int nr = n;
        
        if(n >= str.length()){
            return newStr + str.charAt(0);
        }else{
            newStr = newStr +  str.charAt(0) + str.charAt(nr);
            nr += n;
            while(nr < str.length()){
                newStr = newStr + str.charAt(nr);
                nr += n;
            }
        }

        return newStr;

    }

    /* EXERCISE 6 */
    public static boolean scoresIncreasing(int[] scores) {

        boolean ok = true;

        for(int i = 1; i < scores.length; i++){
            if(scores[i] < scores[i - 1]){
                ok = false;
                break;
            }
        }

        return ok;
    }

    /* EXERCISE 7 */
    public static int sumHeights(int[] heights, int start, int end) {

        int sum = 0;

        for(int i = start + 1; i <= end; i++){
            sum += Math.abs(heights[i - 1] - heights[i]);
        }

        return sum;
    }

    /* EXERCISE 8 */
    public static int OutOfMemory(){

     int[] array = new int[9999999 * 999999];
        array[9999*9999] = 1;
        return array[9999*9999];
    }

    public static void StackOverflow(){

        StackOverflow();

    }

    public static void main(String args[]) {

        /* EXERCISE 1 */
        System.out.println("EXERCISE 1");
        System.out.println("Monkey a-true and monkey b-true => " + monkeyTrouble(true, true));
        System.out.println("Monkey a-true and monkey b-false => " +monkeyTrouble(true, false));
        System.out.println("Monkey a-false and monkey b-false => " +monkeyTrouble(false, false));
        System.out.println();

        /* EXERCISE 2 */
        System.out.println("EXERCISE 2");
        System.out.println("The parrot is talking and hour is 6 => " + parrotTrouble(true, 6) );
        System.out.println("The parrot is talking and hour is 7 => " + parrotTrouble(true, 7) );
        System.out.println("The parrot is not talking and hour is 6 => " + parrotTrouble(false, 6) );
        System.out.println();

        /* EXERCISE 3 */
        System.out.println("EXERCISE 3");
        System.out.println("First value = 1, second value = -1 and negative = false => " + posNeg(1, -1, false));
        System.out.println("First value = -1, second value = 1 and negative = false => " + posNeg(-1, 1, false));
        System.out.println("First value = -4, second value = -5 and negative = true => " + posNeg(-4, -5, true));
        System.out.println();

        /* EXERCISE 4 */
        System.out.println("EXERCISE 4");
        System.out.println("String = cat => " + backAround("cat"));
        System.out.println("String = Hello => " + backAround("Hello"));
        System.out.println("String = a => " + backAround("a"));
        System.out.println();

        /* EXERCISE 5 */
        System.out.println("EXERCISE 5");
        System.out.println(" String = Miracle and n = 2 => " + everyNth("Miracle", 2));
        System.out.println(" String = abcdefg and n = 2 => " + everyNth("abcdefg", 2));
        System.out.println(" String = abcdefg and n = 3 => " + everyNth("abcdefg", 3));
        System.out.println();

        /* EXERCISE 6 */
        System.out.println("EXERCISE 6");
        System.out.println(" Array = [1 3 4] => " + scoresIncreasing(new int[]{1, 3, 4}));
        System.out.println(" Array = [1 3 2] => " + scoresIncreasing(new int[]{1, 3, 2}));
        System.out.println(" Array = [1 1 4] => " + scoresIncreasing(new int[]{1, 1, 4}));
        System.out.println();

        /* EXERCISE 7 */
        System.out.println("EXERCISE 7");
        System.out.println("Array = [5 3 6 7 2], start = 2 and end = 4 => " + sumHeights(new int[]{5,3,6,7,2}, 2, 4));
        System.out.println("Array = [5 3 6 7 2], start = 0 and end = 1 => " + sumHeights(new int[]{5,3,6,7,2}, 0, 1));
        System.out.println("Array = [5 3 6 7 2], start = 0 and end = 4 => " + sumHeights(new int[]{5,3,6,7,2}, 0, 4));
        System.out.println();

        /* EXERCISE 8 */
        System.out.println("EXERCISE 8");
        try{
            int c = OutOfMemory();
        } catch (OutOfMemoryError a){
            System.out.println("OutOfMemoryError");
        }

        try{
            StackOverflow();
        }
        catch (StackOverflowError b){
            System.out.println("StackOverflowError");
        }
        System.out.println();

        /* EXERCISE 9 */
        System.out.println("EXERCISE 9");
        Calculator c = new Calculator();
        List<Integer> l = new LinkedList<Integer>();

        l.add(1);
        l.add(2);
        l.add(6);
        System.out.println("Average for 1,2,6 => " + c.average(l));
        System.out.println();

        /* EXERCISE 10 */
        System.out.println("EXERCISE 10");
         try{
             System.out.println("Try");
             return;
         } finally {
             System.out.println("Finally");
         }
    }
}