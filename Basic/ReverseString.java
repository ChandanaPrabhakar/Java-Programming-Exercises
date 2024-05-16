package Basic;

import java.util.*;

public class ReverseString {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        char [] s = str.toCharArray();
        System.out.println("The reversed string: ");
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(s[i]);
        }
    }
}
