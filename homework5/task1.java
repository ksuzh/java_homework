/*
 * Написать метод, который переведет число из римского формата записи
 *  в арабский. Например, MMXXII = 2022
 */

package homework5;

import java.util.HashMap;
import java.util.Scanner;

public class task1 {
    // public int romeToArab(char rome){
    //     if('I' == rome) return 1;
    //     else if('V' == rome) return 5;
    //     else if('X' == rome) return 10;
    //     else if('L' == rome) return 50;
    //     else if('C' == rome) return 100;
    //     else if('D' == rome) return 500;
    //     else if('M' == rome) return 1000;
    //     return 0;
    // }

    

    public int romeToArab(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        int arab;
        int result = map.get(arr[end]);
        for (int i = end - 1; i >=0; i--){
            arab = map.get(arr[i + 1]);

            if(arab <map.get(arr[i + 1]))
            result -= arab;
        
        else 
            result += arab;
        }
        return result;
    }
    public static void main(String[] args) {
        task1 rome = new task1();
        System.out.println(rome.romeToArab("X"));
        
    }
}
