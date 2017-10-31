/**
 * Unique
 * implement an algorith to determinate if a string has all unique characters. Without aditional data structures.
 */

import java.util.Scanner;

public class Unique {

    public static boolean findUnique(String word){
        int flag = 0;
        
        for (int i=0;i<word.length();i++) {
            int val = word.charAt(i) -'a';
            if ((flag & (1<<val))>0) {
                return false;
            }
            flag |= (1<<val);
            // System.out.println("the flag value: " + flag + " the char value: " + val + " the bitwize operation value is: " + (1<<val));
            // System.out.println("flag bitwise value: " + Integer.toBinaryString((flag)) + " char value bitwise " + Integer.toBinaryString((1<<val)));
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String holder = in.next();        
        System.out.println(findUnique(holder));


        in.close();
    }
}