// Задать пустой целочисленный массив длиной 100. 
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
import java.util.Arrays;

public class task8 {
    public static void createArray(int[] array, int step, int start){
        for(int i = 0; i < 100; i ++){
            array[i] = start + i * step;
        }
    }
    public static void main(String[] args) {
        int[] myArray = new int[100];
        System.out.println("before" + Arrays.toString(myArray));
        createArray(myArray, 1, 1);
        System.out.println("after: " + Arrays.toString(myArray));

    }
}
