
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main {
    static int reverse(int n) {
        StringBuilder str = new StringBuilder(Integer.toString(n));
        str.reverse();
        return Integer.parseInt(str.toString());
    }

    static boolean isPalindrome(int n) {

        return n == reverse(n);

    }

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            n = n + reverse(n);
            if (isPalindrome(n)) {
                System.out.println(n);
                break;

            }

        }
    }
}
