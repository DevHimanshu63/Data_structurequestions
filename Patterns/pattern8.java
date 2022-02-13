import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        // write ur code here
        
        int sp=n-1;
        
        for(int i=1;i<=n;i++){
        //     for(int j=1 ;j<=sp ;j++){
        //         System.out.print("\t");
        //     }
        //     System.out.print("*\t");
        //     sp--;
        //     System.out.println();
            // }
            for(int j=1 j<=sp ;j++){
                if(i+j==n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}