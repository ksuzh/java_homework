// Пусть дан произвольный список целых чисел, удалить из него четные числа

package homework3;
import java.util.ArrayList;
import java.util.Collections;

public class task1 {
    public static void main(String[] args){
                ArrayList<Integer> number = new ArrayList<>();
               
                number.add(1);
                number.add(2);
                number.add(3);
                number.add(4);
                number.add(5);
                System.out.println(number);
                
                 for (int i=0;i<number.size();i++){      
                    int even=number.get(i)%2;       
                     if (even==0){
                         System.out.println("This is Even Number:"+ number.get(i));
                         number.remove(i);
                     }    
                 }
                 System.out.println(number);
            }
}
