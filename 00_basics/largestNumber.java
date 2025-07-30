import java.util.*;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        // Fill the array with user input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i< size; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);
    }
    
    
}
