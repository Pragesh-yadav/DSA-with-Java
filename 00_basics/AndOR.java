/* Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.

You have to print if the traingle is "equilateral", "scalene" or "isosceles". */

import java.util.Scanner;

public class AndOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();

        if(A == B && B==C){
            System.out.println("equilateral");
        }
        else if(A == B || B == C || C == A){
            System.out.println("isosceles");

        }
        else{
            System.out.println("scalene");
        }
    }
}