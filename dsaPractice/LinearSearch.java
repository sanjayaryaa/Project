package dsaPractice;

public class LinearSearch {

    public static void main(String args[]){
    int arr[] = new int[]{2,5,3,6,7,8,10};

    int targetValue = 6;

    for(int i=0; i<=arr.length-1; i++){

        if(arr[i] == targetValue){
            System.out.println("Value Found");
        }

    }

    }
    
}
