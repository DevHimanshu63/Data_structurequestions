import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n1= scn.nextInt();
    int[] one= new int[n1];
    for(int i=0 ;i<one.length ;i++){
        one[i]=scn.nextInt();
    }

    int n2= scn.nextInt();
    int[] two= new int[n2];
    for(int i=0 ;i<two.length ;i++){
        two[i]=scn.nextInt();
    }

    int[] diff= new int [n2];

    int i=one.length-1;
    int j=two.length-1;
    int k=diff.length-1;


    int borrow=0;
    while(k>=0){

        int d= two[j]-borrow;
        if(i>=0){
            d=d-one[i];
    
        }
         
        if(d<0){
            d=d+10;
            borrow=1;
        }else{
            borrow=0;
        }

        diff[k]=d;
        i--;
        j--;
        k--;
    }
    //for 0 is not printing
    int idx=0;
    while(idx<diff.length){
        if(diff[idx]!=0){
            break;
        }else{
            idx++;
        }
    }
    while(idx<diff.length){
        System.out.println(diff[idx]);
        idx++;
    }

    // for(int x=0 ;x<diff.length; x++){
    //     System.out.println(diff[x]);
    // }


    

 }

}