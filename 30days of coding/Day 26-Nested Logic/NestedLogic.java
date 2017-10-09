/*
https://www.hackerrank.com/challenges/30-nested-logic/problem
*/
import java.io.*;
import java.util.*;

public class NestedLogic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dR = scan.nextInt();
        int mR = scan.nextInt();
        int yR = scan.nextInt();
        
        int dE = scan.nextInt();
        int mE = scan.nextInt();
        int yE = scan.nextInt();
        
        int fine=0;
        
        if(yR<=yE&&mR<=mE&&dR<=dE){
            fine=0;
        } 
        else if(yR==yE&&mR==mE&&dR>dE){
            fine+=15*(dR-dE);
        }
        else if(yR==yE&&mR>=mE){
            fine+=500*(mR-mE);
        }
        else if(yR>=yE){
            fine+=10000;

        }

        System.out.println(fine);
    }
}