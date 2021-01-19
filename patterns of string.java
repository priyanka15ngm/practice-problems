// Given a string of length N, print the pattern of strings with first line with the given length of string and keep printing in new line the strings in decreasing order of length till you print the single first character of the given string. 

// Input: First line of the input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consist of only one line which contains a string of length N.

// Output: Corresponding to each test case, pattern is printed in a new line.

// Input:
// 2
// Geeks
// th%ik

// Output:
// Geeks
// Geek
// Gee
// Ge
// G
// th%ik
// th%i
// th%
// th


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t>0){
		    String str = sc.nextLine();
		    int n = str.length();
		    for(int j= n ; j>0 ; j--){
		        
	           for(int i =0 ; i<n ; i++){
    		        char c = str.charAt(i);
    		        System.out.print(c);
    		        
		    }
		    n=n-1;
		    System.out.println();
		        
		        
		    }
		    
		 
		    
		    
		   
		    
		    t--;
		}
		 
	}
}
Correct Answer
Execution Time:0.21