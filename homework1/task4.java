// Написать метод, которому в качестве параметра передается целое число. 
// Метод должен вернуть true, если число отрицательное, и вернуть false 
// если положительное.

import java.util.Scanner;

public class task4 {
    private static boolean negativePositive(int num) {
        return num < 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input number: ");
        int number = scanner.nextInt();
        System.out.printf("returns %s.\n\n", negativePositive(number));
    }

}
