
import java.util.Scanner;

public class level2programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Odd Even Numbers");
        System.out.println("2. Employee Bonus");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Odd Even Numbers
                System.out.print("Enter a number: ");
                int n = sc.nextInt();

                if (n <= 0) {
                    System.out.println("Please enter a positive number.");
                } else {
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i + " is Even");
                        } else {
                            System.out.println(i + " is Odd");
                        }
                    }
                }
                break;

            case 2:
                // Employee Bonus
                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();

                System.out.print("Enter years of service: ");
                int years = sc.nextInt();

                double bonus = 0;

                if (years > 5) {
                    bonus = salary * 0.05;
                }

                System.out.println("Bonus amount: " + bonus);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Odd Even Numbers");
        System.out.println("2. Employee Bonus");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Odd Even Numbers
                System.out.print("Enter a number: ");
                int n = sc.nextInt();

                if (n <= 0) {
                    System.out.println("Please enter a positive number.");
                } else {
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i + " is Even");
                        } else {
                            System.out.println(i + " is Odd");
                        }
                    }
                }
                break;

            case 2:
                // Employee Bonus
                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();

                System.out.print("Enter years of service: ");
                int years = sc.nextInt();

                double bonus = 0;

                if (years > 5) {
                    bonus = salary * 0.05;
                }

                System.out.println("Bonus amount: " + bonus);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
