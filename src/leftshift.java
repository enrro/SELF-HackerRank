/**
 * Created by Enrro on 10/9/2017.
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
            temp = (((a_i-k)%n)+n)%n;
            a[temp] = in.nextInt();
            System.out.println(a[a_i]);
            System.out.println(temp);


        }
    }
}
