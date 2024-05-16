package Basic;

import java.util.*;

public class sumIntegerDigits {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int a = in.nextInt();
        int sum = 0;
        while( a !=0){
            int rem = a % 10;
            sum += rem;
            a = a/10;
        }
        System.out.println("The sum of digits in the integer is: "+sum);
    }
}
