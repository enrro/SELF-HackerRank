/*
*https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
* Not much to say, only useful to remember Integer.parseInt() and NumberFormatException as the exception raised by the 
* parse if the parse is not fulfilled
*/
import java.io.*;
import java.util.*;

public class stringToInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            System.out.println(Integer.parseInt(S));
        }catch(NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}