
package JavaPrograms;
import java.util.Scanner;

public class PallindromeNumber {
    static int rev=0;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first palindrome number: ");
        int num = sc.nextInt();

        int temp =num;
        int i =0;

        while(num>0){
            int a=num%10;
            rev =rev*10+a;
            num =num/10;
            i++;
        }
        if(temp==rev){
            System.out.println("palindromeNumber");
        }
             else{
            System.out.println("not a palindromeNumber");
            }
         
    
    }
  }

    

