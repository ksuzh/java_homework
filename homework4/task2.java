// Написать метод, который принимает массив элементов, 
// помещает их в очередь и выводит на консоль содержимое очереди.

package homework4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class task2 {
    public static void main(String[] args) {
        Character[] myArray = new Character[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (char) (i + 65);
        }
        toQueue(myArray);
    }

    public static void toQueue(Character[] array) {
        Queue<Character> queueLst = new LinkedList<>(Arrays.asList(array));
        System.out.print(queueLst);
    }
}
