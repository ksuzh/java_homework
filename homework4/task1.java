// Написать метод, который принимает массив элементов, 
// помещает их в стэк и выводит на консоль содержимое стэка.
package homework4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }
        for (int i : myArray) {
            System.out.print(i);
        }
        toStack(myArray);
    }

    public static void toStack(Integer[] array) {
        List<Integer> linLst = new LinkedList<>(Arrays.asList(array));
        System.out.println(linLst);
    }
}
