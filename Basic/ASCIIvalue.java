package Basic;
import java.util.*;
public class ASCIIvalue {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = in.next().charAt(0);
        int c = ch;
        System.out.println("The ASCII value of "+ch+" is: "+c);
        in.close();
    }
    
}
