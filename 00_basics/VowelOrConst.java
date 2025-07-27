import java.util.*;

public class VowelOrConst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u': //both case is correct you can write both ways.
            /* case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': */
                System.out.println("Vowel");
                break;
            
        
            default:
                System.out.println("Consonant");
        }
    }
    
}
