import java.util.Scanner;

public class Level2_Programs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Program 1: Odd and Even
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for(int i = 1; i <= number; i++)
        {
            if(i % 2 == 0)
                System.out.println(i + " Even");
            else
                System.out.println(i + " Odd");
        }


        // Program 2: Bonus Calculation
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if(years > 5)
            System.out.println("Bonus = " + salary * 0.05);
        else
            System.out.println("No bonus");


        // Program 3: Multiplication Table
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for(int i = 6; i <= 9; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}