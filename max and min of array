// 

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
    static int getMax(int arr[], int n){
       
         int res = arr[0];
        for(int i=1 ; i<n ; i++){
            res = Math.max(res,arr[i]);
            
            
        }
        return res;
    }
    
    static int getMin(int arr[], int n)
    {
        int res = arr[0];
         
        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
    }
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);  
		int t = sc.nextInt();
		
		
	
		while(t>0){
		   
		    int n=sc.nextInt(); 
		    int[] arr = new int[n]; 
		    for(int i=0; i<n; i++)  
            {  
            //reading array elements from the user   
            arr[i]=sc.nextInt();  
            }  
            System.out.println(getMax(arr,n) +" "+ getMin(arr,n));		   
		    
		    t--;
		}
	}
}

// Correct Answer
// Execution Time:0.42