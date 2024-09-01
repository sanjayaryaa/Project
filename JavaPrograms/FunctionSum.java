package JavaPrograms;
import java.util.*;
public class FunctionSum {

    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = in.nextInt();
        sum(num1, num2);
    }

    public static void sum(int x, int y){
        int sum = x+y;
        System.out.println("Sum of "+x+" and "+y+" = "+sum);
    }
    
}
