// Задать целочисленный массив, состоящий из элементов 0 и 1. 
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
import java.util.Arrays;

public class task7 {
    public static int[] switchingNumbers(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
    System.out.println(Arrays.toString(switchingNumbers(array01)));

    }
}
