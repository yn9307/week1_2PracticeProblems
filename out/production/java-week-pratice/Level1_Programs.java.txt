import java.util.Scanner;

public class Level1_Programs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Program 1: Check divisible by 5
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 5 == 0)
            System.out.println("Number is divisible by 5");
        else
            System.out.println("Number is not divisible by 5");


        // Program 2: Smallest among three numbers
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a < b && a < c)
            System.out.println("A is smallest");
        else if(b < a && b < c)
            System.out.println("B is smallest");
        else
            System.out.println("C is smallest");


        // Program 3: Largest number
        if(a > b && a > c)
            System.out.println("A is largest");
        else if(b > a && b > c)
            System.out.println("B is largest");
        else
            System.out.println("C is largest");


        // Program 4: Sum of Natural Numbers
        System.out.print("Enter natural number: ");
        int n = sc.nextInt();

        if(n > 0)
        {
            int sum = n * (n + 1) / 2;
            System.out.println("Sum = " + sum);
        }
        else
        {
            System.out.println("Invalid natural number");
        }

        sc.close();
    }
}