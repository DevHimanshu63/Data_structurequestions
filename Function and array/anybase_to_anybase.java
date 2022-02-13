import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
      int b2 = scn.nextInt();
      int d = getValueIndecimal(n, b1 ,b2);
      System.out.println(d);
   }

 public static int decimaltoanybase(int n ,int b){

    int ans=0;
    int p=1;

    while(n>0){
      int rem=n%b;
      n=n/b;
      ans+=(rem*p);
      p=p*10;
    }
    return ans;
  }
  public static int anybasetodecimal(int n,int b){
    int ans=0;
    int p=1;
    while(n>0){
      int rem=n%10;
      n=n/10;
      ans+=(rem*p);
      p*=b;
    }
    return ans;
  }
  public static int getValueIndecimal(int n, int b1 ,int b2){
      // write your code here
     
int dec=anybasetodecimal(n,b1);
int aba=decimaltoanybase(dec,b2);
return aba;

    
  
  }

 
  }