package lesson6;

import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Integer[] numbers = {1,45,32,45,56,5,5,34,56,0,7,88,-8977,989,870,98090,};
        printSortedArray(numbers);
    }

    public static void printSortedArray(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
//        Arrays.sort(arr);
//        for (int v: arr){
//            System.out.println(v);
//        }
        for (int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
