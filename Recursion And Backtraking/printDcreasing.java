import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();

         printDecreasing(n);

    } 
        
    public static void printDecreasing(int n){
        

        if(n==0){
            return;
        }

        System.out.println(n);

        //function calls itself.....

        printDecreasing(n-1);
       
       
    }

}