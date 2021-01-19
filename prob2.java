// Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array. Task is to find the sum of the left diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between.

// Your Task:
// This is a function problem. The input is already taken care of by the driver code. You only need to complete the function array() that takes a two-dimension array (a), another one dimension array (b), sizeOfArray (n), and return the ArrayList which is having the sum of the diagonal elements of the array a and the maximum number of the array b. The driver code takes care of the printing.

// Expected Time Complexity: O(N2).
// Expected Auxiliary Space: O(1).

class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
        
        int p =0;
        for(int i =0 ; i < n ; i++){
            for(int j=0 ; j <n ; j++){
                if(i==j){
                    p += a[i][j];
                }
            }
        }
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(p);
        int max = b[0];
        for(int i =1 ; i < n ; i++){
            
            if(b[i] > max){
                max = b[i];
            }
        }
        numbers.add(max);
    return(numbers);
    }
    
}


// Correct Answer.Correct Answer
// Execution Time:0.76

