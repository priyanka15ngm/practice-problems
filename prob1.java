// Given an array A[] of size N. The task is to find the largest element in it.
//  Your Task:  
// You don't need to read input or print anything. Your task is to complete the function largest() which takes the array A[] and its size N as inputs and returns the maximum element in the array.

 

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)


class Compute {
    
    public long largest(long arr[], long n)
    {
         long max = arr[0];
         for (int i = 1; i <arr.length ; i++){
             if(arr[i]>max){
                 max= arr[i];
             }
             
         }
         return max;
    }
}

 