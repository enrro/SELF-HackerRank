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
      for (char c : second.toCharArray()) {
        arr1[c-'a']--;
      }
      for ( int c : arr1) {
        System.out.println(c);
          ans = ans + c;
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
