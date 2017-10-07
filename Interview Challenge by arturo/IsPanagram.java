import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IsPanagram {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> dictionary = new HashMap<>();
        StringBuilder sb = new StringBuilder(); 
        while(in.hasNext()){
            sb.append(in.next());
        }
        for(int i =0; i<sb.length();i++){
            dictionary.putIfAbsent(Character.toLowerCase(sb.charAt(i)), 1);
        }
        for(int i =97; i<123;i++){
            if(dictionary.containsKey((char)i)==false){
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
}
