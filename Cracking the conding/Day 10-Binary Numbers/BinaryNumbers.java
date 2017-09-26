/**
 * BinaryNumbers
 * Task 
 * https://www.hackerrank.com/challenges/30-binary-numbers/problem
 * Given a base-10 integer, n , convert it to binary (base-2). Then find and print the base- integer denoting the maximum
 *  number of consecutive 1's in n's binary representation.
 */
import java.io.*;
import java.util.*;

public class BinaryNumbers {

    public int consecutiveOnes(int n){
        int max = 0;
        int current = 0;
        //divide n until it reaches 0. At each iteration check if there is a remainder
        // the count the reminders and if there is no reminder the reset the counter.
        // remember to keep track of the max value everytime you add a reminder. 
        while (0<n) {
            if (n%2==1) {
                current++;
                if(current>max){
                    max = current;
                }
            }
            else{
                current = 0;
            }
            //System.out.println("n: " + n + " current: " + current + " max: " + max);
            n = n/2;
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BinaryNumbers bN = new BinaryNumbers();
        System.out.println(bN.consecutiveOnes(n));
    }
}