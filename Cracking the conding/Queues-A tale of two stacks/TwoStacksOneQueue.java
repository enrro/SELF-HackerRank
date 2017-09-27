import java.util.Scanner;
import java.util.Stack;
/*
*
* https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem
* I found the most useful to create a helper method to transfer the information from one stack to another so
* I could reuse the code in peek as well as dequeue
*/


public class TwoStacksOneQueue {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }
        
        public void transfer(Stack<T> stackNewestOnTop, Stack<T> stackOldestOnTop){
            if(stackOldestOnTop.empty()==true){
                while(stackNewestOnTop.empty()==false){
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }

        }
        
        public T peek() {
            transfer(stackNewestOnTop, stackOldestOnTop);
            return stackOldestOnTop.peek();
        }

        public T dequeue() {
            transfer(stackNewestOnTop, stackOldestOnTop);
            return stackOldestOnTop.pop();
        }
        
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
