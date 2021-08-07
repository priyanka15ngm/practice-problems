//input = "mabacdaba"
//output = 2



import java.util.*;
public class Main
{
  public static void main (String[]args)
  {

    String s = "mabacdaba";
     String m = s.substring (1, 4); //substring is "aba"
    // String m = "jk";
    int pos = s.indexOf(m);
    int c=0;
    while(pos !=-1){
        
        
        pos = s.indexOf(m,pos+1);
        c++;
    }
    
    
    
    System.out.println(c);






  }
}
