// Write a program to reverse an array or string

public class{

    static void reverseArray(int arr[],int start,int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

    }



    static void printArray(int arr[],int size){
        for(int i=0; i<size  ; i++){
            System.out.println(arr[i]+" ");

        }

    }


    public static void main(String[] args){
        int arr[] = {9,7,4,2,1};
        printArray(arr,arr.length);
        reverseArray(arr,0,arr.length-1);
        System.out.println("Reversed arrayis\n");
        printArray(arr,arr.length);
    }
}