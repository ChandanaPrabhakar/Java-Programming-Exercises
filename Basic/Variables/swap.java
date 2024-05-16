package Basic.Variables;
import java.util.*;

public class swap {
    public static void main(String args[]){
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter the numerical value for variable a: ");
        int a = in.nextInt();
        System.out.print("Enter the numerical value for variable b: ");
        int b = in.nextInt();
        System.out.println("Before swapping a: "+a+" and b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a: "+a+" and b: "+b);

    }
}
