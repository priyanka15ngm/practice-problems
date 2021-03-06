// Move all the negative elements to one side of the array 
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int[] arr = {-12, -13, -5, 
                   6, -7, 5, -3, 11};
        
        int j=0,k=0;
        
        ArrayList<Integer> neg = new ArrayList<Integer>();
        ArrayList<Integer> pos = new ArrayList<Integer>();
        for(int i =0 ; i<arr.length ; i++){
            
            if(arr[i]<0){
            
                neg.add(arr[i]);
            
            }
            else{
                
                
                pos.add(arr[i]);
                
                
            }
        }
        
        System.out.println(neg);
        System.out.println(pos);
        
        neg.addAll(pos);
        System.out.println(neg);
        
        
        }
}

//[-12, -13, -5, -7, -3, 6, 5, 11]