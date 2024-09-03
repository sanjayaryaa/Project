package dsaPractice;
import java.util.Scanner;
public class LinearSearch {

    public static void main(String args[]){

    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 5 values in the array: ");
    for(int j=0; j<=arr.length-1; j++){
        arr[j] = sc.nextInt();
    }

    System.out.println("Enter your target value: ");
    int targetValue = sc.nextInt();
    
    for(int i=0; i<=arr.length-1; i++){

        if(arr[i] == targetValue){
            System.out.println("Target Value i.e. "+targetValue+" Found at Index "+i);
        }
    }
  }  
}
