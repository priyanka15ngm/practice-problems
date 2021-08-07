//replacing a with b. b with c , c with d 
// input = abcd
//output = bcde



import java.util.*;
public class Main
{
	public static void main(String[] args) {


        StringBuffer s = new StringBuffer("abcd");
        
        int n = s.length();
        for(int i=0 ; i< n ; i++){
            s.replace(   i,i+1,  Character.toString(   (char)(s.charAt(i) + 1) )  );
        }
        
        System.out.println(s.toString());
        
       
        
        

	}
}
