// Given an array of N integers. Your task is to print the sum of all of the integers.
 
 class Compute {
    
    public long getSum(long a[], long n)
    {
        // Your code goes here
        long sum = 0;
        for (int i = 0; i < n; i++)
         sum = sum + a[i];
         return sum;
        
    }
}