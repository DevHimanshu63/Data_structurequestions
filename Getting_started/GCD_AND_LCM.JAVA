import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn= new Scanner(System.in);
      int n1=scn.nextInt();
      int n2=scn.nextInt();
      
      int on1=n1;
      int on2=n2;
      while(n1%n2!=0){
        int r=n1%n2;
        n1=n2;
        n2=r;

      }
      int lcm=(on1*on2)/n2;
      System.out.println(n2);
      System.out.println(lcm);
     }
    }