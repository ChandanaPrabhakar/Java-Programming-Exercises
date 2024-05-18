package Basic;
import java.util.*;
public class PrintOddNumbers {
    public static void main(String argds[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            if(i%2 != 0){
                System.out.println(i);
            }             
        }
        in.close();
    }
    
}
