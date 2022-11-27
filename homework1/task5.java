// Написать метод, которому в качестве аргументов передается строка и число, 
// метод должен отпечатать в консоль указанную строку, указанное количество раз;
import java.text.Format;
import java.util.Scanner;

public class task5 {
    static void printLine(String line, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(line);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myStr = "whatever";
        System.out.print("input n: ");
        int n = scanner.nextInt();
        printLine(myStr, n);
        
    }
}
