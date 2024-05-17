package Basic;
import java.util.*;

public class CompareIntegers {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer a: ");
        int a = in.nextInt();
        System.out.print("Enter second integer b: ");
        int b = in.nextInt();
        if(a>b){
            System.out.println(a+" > "+b);
        }
        else{
            System.out.println(b+" > "+a);
        }
        in.close();
    }
}
