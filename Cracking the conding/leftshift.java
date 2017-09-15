/**
 * Created by Enrro on 10/9/2017.
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class leftshift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int temp;
        for(int a_i=0; a_i < n; a_i++){
            /*
                it turns out that java is % is not a modulus is a remainder
                a work around is to add the modulus and use the remainder
                I could also have use the Math.floorMod(a,b);
                As it turns out that was easiers and should do next time.
            */
            temp = (((a_i-k)%n)+n)%n;
            a[temp] = in.nextInt();
            System.out.println(a[a_i]);
            System.out.println(temp);


        }
    }
}
