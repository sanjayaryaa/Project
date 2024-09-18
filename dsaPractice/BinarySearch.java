package dsaPractice;
public class BinarySearch {
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
    public static void main(String args[]){
        int numbers[] = {3, 5, 7, 8, 9, 11, 21, 25};
        int key = 9;

        System.out.println("index for key is : "+ BinarySearch(numbers, key));
    } 
        
    }    

