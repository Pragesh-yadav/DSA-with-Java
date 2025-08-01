// Given an interger N, count and print its number of digits.
import java.util.*;

public class CountDigitOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digits = 0;
        while(num >0){ 
            num /= 10;
            digits++;


        }
        System.out.print(digits);
    }
}
