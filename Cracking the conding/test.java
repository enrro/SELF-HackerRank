import java.util.*;
public class test {
    
        public ArrayList<String>  merge(String[] words, String[] more) {
            ArrayList<String> sentence = new ArrayList<String>();
            for (String var : words) {
                sentence.add(var);
            }
            for (String var : more) {
                sentence.add(var);
            }
            return sentence;
        }
        public static void main(String[] args) {
            // Prints "Hello, World" to the terminal window.
            char[] cr = {'r', 'r', 'r', 'a', 'b', 'c'};
            System.out.println(cr);
            Arrays.sort(cr);
            System.out.println(cr);
        }
    
    }
    