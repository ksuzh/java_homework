// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
// (произведение чисел от 1 до n)

package hm1;
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("input n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int fact = 1;
        for(int i = 1; i < n; i++) {
          System.out.print(i + "+");
          
          sum += i;
          fact *=i;
        }
        sum += n;
        fact *=n;
        System.out.print(n + "=" + sum);
        System.out.println();
        System.out.print(fact);
      }
}
