// Given a string containing only lowercase letters, generate a string with the same letters, but in uppercase.

// Input:
// The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of one line. The first line of each test case consists of a string.

// Output:
// Corresponding to each test case, in a new line, print the string in uppercase.

// Constraints:
// 1 ≤ T ≤ 100
// 1 ≤ string length ≤ 50

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while( t>0 ){
		    
		    
		    String str = sc.nextLine();
		    System.out.println(str.toUpperCase());
		    t--;
		     
		 
		   
		    
		}
		
		
		
	}
}

// Correct Answer
// Execution Time:0.31
