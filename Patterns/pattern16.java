import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     int st=1;
    //  nsp no. of coloumn 
    int nsp= 2*n-3;
     for(int i=1 ; i<=n ;i++){
         for(int j=1; j<=st ;j++){
             System.out.print(j+"\t");
         }
         for(int j=1; j<=nsp ;j++){
             System.out.print("\t");
         }
         if(i==n) st--;
         for(int j=st; j>=1 ;j--){
             System.out.print(j+"\t");
         }
         nsp-=2;
         st++;
         System.out.println();
     }
 }
}