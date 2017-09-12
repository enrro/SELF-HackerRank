/*
The way this works is making a list the size of the alphabet.
Then we examine the first string. with the toCharArray is easy to iterate
We plus one the place where every character in the first array is
and we minus one the place where every char in the second array is.
At the end this leave us with a trace of where is every character that is not
in bot arrays. As easy to iterate as a list we only add every absolute element
because if not we may end up with a 0 value due to the negative number in the second array
This was illustrative to me because how you can tag a certain array with the operator minus or plus.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class FindRepeatedCharacters {
    public static int numberNeeded(String first, String second) {
      int ans = 0;
        int [] arr1 = new int[26];
      for(char c : first.toCharArray()){

        arr1[c-'a']++;
      }
      for (char b : second.toCharArray()) {
        arr1[b-'a']--;
      }
      for ( int i : arr1) {
          ans = ans + Math.abs(i);
      }
      return ans;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
        in.close();
    }
}
