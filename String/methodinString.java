import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// String str = scn.next();
		// solution(str);
		StringBuilder sb= new StringBuilder("hello");

		// add a char in string

			sb.append('e');

		// find charcter in specific index

		char ch=sb.charAt(3);
		System.out.println(ch);

		// set the value of specific index(idx,'charcter')
		sb.setCharAt(2,'y');
		System.out.println(sb);

		// delete charcter in string 
		sb.deleteCharAt(2);

			// inseting value in specific index
				sb.insert(2,'y');
		
		System.out.println(sb.length());

		
	}

}