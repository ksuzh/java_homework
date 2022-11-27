// Написать метод, который определяет, 
// является ли год високосным, и возвращает 
// boolean (високосный - true, не високосный - false). 
// Каждый 4-й год является високосным, кроме каждого 100-го, 
// при этом каждый 400-й – високосный.
import java.util.Scanner;

public class task6 {
    private static boolean isLeapYear(int x) {
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input year: ");
        int year = scanner.nextInt();
        System.out.printf(" %d year. it is %s  leap.\n", year, (isLeapYear(year)) ? "\b" : "not");

    }
}
