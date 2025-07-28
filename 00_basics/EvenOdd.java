import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String ans = x%2 == 0 ? "Even": "Odd";
        System.out.println(ans);
        // if(x % 2 == 0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }
        
    }
}