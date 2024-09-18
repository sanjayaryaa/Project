package dsaPractice;
import java.util.*;
public class BinarySearch2 {
    public static int BinarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while (start <= end){
            int mid = (start + end) / 2;

            //comparisons
            if(numbers[mid] == key){//found
                return mid;
            }
            if(numbers[mid] < key){//right
                start = mid+1;
            } else{//left
                end = mid-1;
            }
        }
        return-1;
    }  
   
    
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                // Ask the user for the size of the array
                System.out.print("Enter the number of elements in the array: ");
                int n = scanner.nextInt();
        
                // Declare the array
                int[] array = new int[n];
        
                // Input elements in the array
                System.out.println("Enter " + n + " elements:");
                for (int i = 0; i < n; i++) {
                    array[i] = scanner.nextInt();
                }

                System.out.print("Enter the key: ");
                int key = scanner.nextInt();

                System.out.println("index for key is : "+ BinarySearch(array, key));



        
               
            }
        }
        
       

