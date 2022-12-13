// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

package homework4;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;


public class task3 {
    public static void main(String[] args) {
        List<Character> lstOfChars = new LinkedList<Character>();
        for (int i = 65; i < 75; i++) {
            lstOfChars.add((char) i);
        }
        System.out.println(lstOfChars);
        System.out.print(reverseList(lstOfChars));
    }

    public static <T> List<T> reverseList(List<T> linLst) {
        List<T> reverse = new ArrayList<>(linLst);
        Collections.reverse(reverse);
        return reverse;
    }
}
