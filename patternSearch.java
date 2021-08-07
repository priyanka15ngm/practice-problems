

//pattern search using string
import java.util.*;
public class Main
{
    
    static void fun(String st , String pat){
        
        int pos = st.indexOf(pat);
        while(pos >= 0){
             System.out.println(pos +" ");
             pos = st.indexOf(pat,pos+1);
            
        }
       
        
        
        
    }
	public static void main(String[] args) {
	    
// 		System.out.println("Hello World");

        String s = "abparicdpariefpopopopari";
        String pat = "pari";
       fun(s,pat);
        
        
	}
}
