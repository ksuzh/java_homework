package hm1;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("input the first number:");
        num1 = input.nextInt();

        System.out.println("input the second number:");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("choose operation: ");
        operation = op.next();

        if (operation == "+")
            ;
        {
            System.out.println("answer is" + (num1 + num2));
        }
        if (operation == "-")
            ;
        {
            System.out.println("answer is" + (num1 - num2));
        }

        if (operation == "/")
            ;
        {
            System.out.println("answer is" + (num1 / num2));
        }
        if (operation == "*") {
            System.out.println("answer is" + (num1 * num2));
        }

    }
}


