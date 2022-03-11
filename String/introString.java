import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// String str = scn.next();
		String s1 = "pepcoding";
		String s2 = "pepcoding";

		String s3 = new String("pepcoding");
        
        // == this is comparing by address so output is bad

		if(s1==s3){
			System.out.println("good");
		}
		else{
			System.out.println("bad");
		}

		
        // .equals this is comparing by charcter by charcter so output is good

		if(s1.equals(s3)==true){
			System.out.println("good");
		}else{
			System.out.println("bad");
		}
	}

}