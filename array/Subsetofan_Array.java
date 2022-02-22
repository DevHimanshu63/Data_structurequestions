import java.io.*;
import java.util.*;

public class Main{


    public static int decimaltobinary(int n ,int b) {
        
        int ans=0;
        int p=1;

        while ( n>0 ) {
            int rem=n%b;
            n/=b;

            ans+=(rem*p);
            p*=10;
        }
        return ans;
    }
 
public static void main(String[] args) throws Exception {
    // write your code here

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int[]arr=new int[n];
        for( int i=0 ;i<arr.length  ;i++  ) {
            arr[i]=scn.nextInt();
        }

            int subset=(int)Math.pow(2,n);
            
        for(int i=0 ; i<subset ;i++  ) {
            int bn=decimaltobinary(i,2);
            // System.out.println(bn);
            int div=(int)Math.pow(10,n-1);
            for(int j=0 ; j<arr.length ;j++){
                int quo=bn/div;
                int rem=bn%div;

                if(quo==1){
                    System.out.print(arr[j]+"\t");
                }else{
                    System.out.print("-\t");
                }
                bn=rem;
                div/=10;
                
            }
            System.out.println();
        }





 }

}