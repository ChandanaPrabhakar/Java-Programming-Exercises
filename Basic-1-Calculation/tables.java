import java.util.*;


public class tables {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of which table is to be printed: ");
        int a =in.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(a+" x "+i+" = "+ (a*i));
        }
    }
}
