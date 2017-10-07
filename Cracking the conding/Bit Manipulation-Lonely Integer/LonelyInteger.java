import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }
        scan.close();
        
        System.out.println(lonelyInteger(array));
    }
    
    /* XORs all numbers in array together */
    public static int lonelyInteger(int [] array) {
        int val = 0;
        for (int num : array) {
            val = val ^ num; // ^ is XOR operator
        }
        return val;
    }
}
