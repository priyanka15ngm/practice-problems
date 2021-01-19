// Given a string, print the number of alphabets present in the string.

// Input:

// The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.Each test case contains a single string. 


// Output:

// Print the number of alphabets present in the string.

// Constraints:

// 1<=T<=30

// 1<=size of string <=100


// Example:

// Input:

// 2
// adjfjh23
// njnfn_+-jf

// Output:

// 6
// 7


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
	
		while(t>0){
		    String str = sc.nextLine();
		    int n = str.length();
		    	int c=0;
		    for(int i = 0 ; i<n ; i++){
		         if (str.charAt(i)>='a' && str.charAt(i)<='z' ||str.charAt(i)<='Z' && str.charAt(i)>='A')
		         {
		             c=c+1;
		         }
		        
		    }
		    System.out.println(c);
		    
		    t--;
		}
	}
}


// Execution Time:0.17