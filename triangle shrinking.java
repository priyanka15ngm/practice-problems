// 

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
		    for(int i= 0 ; i<n ; i++){
		        int k=i;
	               while (k>0){
	                   System.out.print('.');
	                   k--;
	               }
	           for(int j =i ; j<n ; j++){
	               
    		        char c = str.charAt(j);
    		        
    		        System.out.print(c);
    		        
		    }
		    //n=n-1;
		    System.out.println();
		        
		        
		    }
		    
		 
		    
		    
		   
		    
		    t--;
		}
	
	}
}