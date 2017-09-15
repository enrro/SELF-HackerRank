import java.awt.SystemTray;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class testHash {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        
        for(int i = 0; i<m;i++){
            if(ht.containsKey(magazine[i])){
                ht.put(magazine[i], ht.get(magazine[i])+1);
            }
            else{
                ht.put(magazine[i], (1));
            }
        }
        for(int j = 0; j<n; j++){
            if(ht.containsKey(ransom[j]) == false){
                System.out.println("No");
                return;
            }
            else if(ht.get(ransom[j]) == 1){
                ht.remove(ransom[j]);
            }
            else if(ht.get(ransom[j])>1){
                ht.put(ransom[j], (ht.get(ransom[j])-1));
                if(j ==n-1){
                }
            }
        }
        System.out.println("Yes");

    }
}
