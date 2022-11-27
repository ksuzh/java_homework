
// Написать метод, принимающий на вход два целых числа и проверяющий, 
// что их сумма лежит в пределах от 10 до 20 (включительно), 
// если да – вернуть true, в противном случае – false.


import java.util.Scanner;

public class task2 {

    private static boolean betweenCheck(int a, int b) {
        return (10 <= a + b) && (a + b <= 20);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input a: ");
        int a = scanner.nextInt();

        System.out.print("input b: ");
        int b = scanner.nextInt();

        System.out.printf("sum is %d. ", a + b);
        System.out.printf("returns %s.\n\n", betweenCheck(a, b));
    }

}
