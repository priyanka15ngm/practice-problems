//input  = "ga^jku"
//output = "hB^ksV"



import java.util.*;
public class Main
{
	public static void main(String[] args) {


        StringBuffer s = new StringBuffer("xobi^^nbootcamp");
        
        int n = s.length();
        
            for(int i=0 ; i< n ; i++){
                
                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                    
                    s.replace(   i,i+1,  Character.toString(   (char)(s.charAt(i) + 1) )  );
            
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||
                s.charAt(i)=='o' ||  s.charAt(i)=='u'){
                    s.replace(   i,i+1,Character.toString(Character.toUpperCase(s.charAt(i))));
                    
                }
                }
            
        }
      
        
        System.out.println(s.toString());
        
       
        
        

	}
}
