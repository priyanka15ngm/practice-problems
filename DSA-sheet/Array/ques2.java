import java.util.*;
import java.lang.*;
import java.io.*;

public class solution{

        static int getMax(int[] arr,int n){
            int res=arr[0];
            for(int i=1;i<n;i++){
                res= Math.max(res,arr[i]);


            }
            return res;

        }
        static int getMin(int[] arr,int n){
           int  res = arr[0];
            for(int i=1;i<n;i++){
                res= Math.min(res,arr[i]);

            }
            return res;

        }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int maxans = getMax(arr,arr.length);
        int minans = getMin(arr,arr.length);
        System.out.println(maxans+" "+minans);
    }
}