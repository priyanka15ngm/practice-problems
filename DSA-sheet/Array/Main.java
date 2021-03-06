// Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {0,1,1,0,1,2,2,2,1,0,1};
		int c0=0;
		int c1=0;
		int c2=0;
		for(int i =0 ; i<arr.length ; i++){
		    if(arr[i] == 0){
		        c0++;
		    }
		    if(arr[i] == 1){
		        c1++;
		    }
		    if(arr[i] == 2){
		        c2++;
		    }
		    
		}
		System.out.println(c0+" "+c1+" "+c2); // 3 5 3
		for(int i = 0 ; i < c0 ; i++){
		    System.out.print("0"+" ");
		}
		for(int i = c0 ; i < c0+c1 ; i++){
		    System.out.print("1"+" ");
		}
		for(int i = c1+c0 ; i < c0+c1+c2 ; i++){
		    System.out.print("2"+" ");
		}
		
	}
}