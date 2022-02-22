import java.io.*;
import java.util.*;

public class Main{

    public static int binary_search(int[]arr , int n ,int data) {
         int low=0;
        int high=arr.length-1;

        while ( low<=high ) {
        int mid=(low+high)/2;

        if(arr[mid]==data){
            return mid;
        }
        else if(arr[mid]>data){
            high=mid-1;
        }else{
            low=mid+1;
        }
    }
    return -1;
        
    }

public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();

    int[]arr=new int [n];
    for(int i=0 ;i<arr.length ;i++){
        arr[i]=scn.nextInt();
    }

    int data=scn.nextInt();

    int idx=binary_search(arr ,n ,data);
    System.out.println(idx);
    
    // Here is code without function
    // int low=0;
    // int high=arr.length-1;
    // while ( low<=high ) {
    //     int mid=(low+high)/2;

    //     if(arr[mid]==data){
    //         System.out.println(mid);
    //         return ;
    //     }
    //     else if(arr[mid]>data){
    //         high=mid-1;
    //     }else{
    //         low=mid+1;
    //     }
    // }
    // System.out.println(-1);

 }

}