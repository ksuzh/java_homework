// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.

package homework3;

import java.util.ArrayList;
import java.util.Collections;

public class task2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(22);
        list.add(111);
        
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        
    }
}
