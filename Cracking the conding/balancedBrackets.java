/**
 * balancedBrackets
 * https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem
 */
import java.util.*;
public class balancedBrackets {
    public static boolean isBalanced(String expression) {
        Hashtable<Character, Character> punctuation = new Hashtable<Character,Character>();
        Deque<Character> queue = new LinkedList<Character>();

        punctuation.put('(',')');
        punctuation.put('[',']');
        punctuation.put('{','}');

        for (char c : expression.toCharArray()){
            if (punctuation.containsKey(c)) {
                queue.push(c);
            }
            else if(queue.peek()==null){
                return false;
            }
            else if(c==punctuation.get(queue.peek())) {
                queue.pop();
            }
            else if(c!=punctuation.get(queue.peek())) {
                return false;
            }
        }
        
        return queue.peek()==null? true:false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            String expression = sc.next();
            System.out.println((isBalanced(expression))? "YES":"NO");
        }
    }
}