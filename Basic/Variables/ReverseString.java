package Basic.Variables;

import java.util.*;

public class ReverseString {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.next();
        char [] s = str.toCharArray();
        for(int i=str.length()-1; i>0; i--){
            System.out.print(s[i]);
        }
    }
}
