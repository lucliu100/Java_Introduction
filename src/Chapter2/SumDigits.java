package Chapter2;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int number = (int) input.nextDouble();
        int A = number % 10;
        int B = (number % 100)/ 10;
        int C = number / 100;
        System.out.println(A + B + C);
    }
}
