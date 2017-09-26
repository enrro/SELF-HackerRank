/**
 * BinaryNumbers
 * Task 
 * https://www.hackerrank.com/challenges/30-binary-numbers/problem
 * Given a base-10 integer, n , convert it to binary (base-2). Then find and print the base- integer denoting the maximum
 *  number of consecutive 1's in n's binary representation.
 */
public class BinaryNumbers {

    
    public static void main(String[] args) {
        int round = 13;
        int max = 0;
        int current = 0;
        while (0<round) {
            if (round%2==1) {
                current++;
                if(current>max){
                    max = current;
                }
            }
            else{
                current = 0;
            }
            System.out.println("round: " + round + " current: " + current + " max: " + max);
            round = round/2;
        }

    }
}