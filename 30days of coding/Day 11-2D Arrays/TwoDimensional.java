/**
 * TwoDimensional
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 */

 import java.io.*;
 import java.util.Scanner;
 
public class TwoDimensional {

    /* integer MIN_VALUE prevents every case in which the sum of the the max values in the matrix still less than 0
    * this way we always have the negative value of the matrix instead of the one we predefined.
    * 0 <= columns< columns.length-2
    * 0 <= rows   < rows.length-2
    */
    public int calculateMaxHourglass(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int row =0; row<4;row++){
            for(int col=0;col<4;col++){
                max = Math.max(max, sumMaxHourglass(arr, row, col));
            }
        }
        return max;
    }

    // This is where we calculate the current value for this row and column pair
    public int sumMaxHourglass(int arr[][], int row, int col){
        int sum = arr[row][col] + arr[row][col+1] + arr[row][col+2]
                                + arr[row+1][col+1]
                 + arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
        return sum;
    }

    // it was probably a better idea to use static methods because they are independant of the instances.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        TwoDimensional td = new TwoDimensional();
        for(int row=0; row < 6; row++){
            for(int column=0; column < 6; column++){
                arr[row][column] = in.nextInt();
            }
        }
        System.out.println(td.calculateMaxHourglass(arr));

    }
}