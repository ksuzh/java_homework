// Написать метод, которому в качестве параметра передается целое число, 
// метод должен напечатать в консоль, положительное ли число передали 
// или отрицательное. Замечание: ноль считаем положительным числом.
import java.util.Scanner;

public class task3 {
    public static boolean positiveNegative (int a) {
        return a>=0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input a: ");
        int a = scanner.nextInt();
        System.out.printf("number %s.\n\n", positiveNegative(a) ? "positive" : "negative");
    }
}
