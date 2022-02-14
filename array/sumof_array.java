import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    
   int n1=scn.nextInt();
   int[]one = new int[n1];
   for(int i=0 ;i<one.length ;i++){
       one[i]=scn.nextInt();
   }
    int n2=scn.nextInt();
   int[]two = new int[n2];
   for(int i=0 ;i<two.length ;i++){
       two[i]=scn.nextInt();
   }


    int[] sum =new int[n2 > n1 ? n2 : n1];

    int i=one.length-1;
    int j=two.length-1;
    int k=sum.length-1;

    int c=0;
    //this is the condition of sum of arraya where we store the sum that is sum array.
    while(k>=0){
        int d=c;

        if(i>=0){
            d=d+one[i];
        }
        if(j>=0){
            d=d+two[j];

        }
        

        c=d/10;
        d=d%10;
        sum[k]=d;
        i--;
        j--;
        k--;

    }
    // if carry is 1 then also print carry
    if(c>0){
        System.out.println(c);
    }

    for(int x=0 ; x<sum.length ;x++){
        System.out.println(sum[x]);
    }




   
 }

}





            /*
            i
    7   8   3 
              sum = 
            j
    6   2   3

1   4   0   6
            k
            */