package lesson14vk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Plum");
        fruits.add("Peach");
        fruits.add("Kiwi");
        fruits.add("Apple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
//        while (iterator.hasNext()){   // the same that above
//            System.out.println(iterator.next());
//        }

    }
}
