package homework13;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.get(3));
        numbers.set(0, 99);
        System.out.println(numbers);
        Integer oldVAlue = numbers.set(0, 1);
        System.out.println(numbers);
        numbers.add(0, 1111);
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("    ");

//        numbers.remove(1);
//        System.out.println(numbers);

//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
////            System.out.println(i);
//        }
//
//        for (int i = numbers.size() - 1; i >= i--; ) {
//            System.out.println(numbers.get(i));
//        }

        for (Integer v : numbers){
            System.out.println(v);
        }
    }
}

