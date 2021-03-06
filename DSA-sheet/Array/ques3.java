import java.util.*;
public class Main
{
	public static int met2(int arr[],int k){
        Arrays.sort(arr);
        return (arr[k-1]);
    }
    
public static int met1(int arr[],int k){
        Arrays.sort(arr);
        return (arr[arr.length-k]);
    }
        public static void main(String[] args){
            int arr[] = {4,5,6,9,12};
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
             
            System.out.println("kth largest "+met1(arr,k));
            System.out.println("kth smallest "+met2(arr,k));
            
        }

}