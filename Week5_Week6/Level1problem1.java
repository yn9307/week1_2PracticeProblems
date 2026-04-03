package Week5_Week6;

import java.util.Scanner;

public class Level1problem1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Factorial
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int factorial = 1;

        for(int i = 1; i <= n; i++)
            factorial *= i;

        System.out.println("Factorial = " + factorial);

        // Reverse Number
        System.out.print("Enter number to reverse: ");
        int num = input.nextInt();
        int reverse = 0;

        while(num != 0){
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reverse = " + reverse);

        // Count Digits
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int count = 0;

        while(number != 0){
            number /= 10;
            count++;
        }

        System.out.println("Digits = " + count);

        input.close();
    }
}