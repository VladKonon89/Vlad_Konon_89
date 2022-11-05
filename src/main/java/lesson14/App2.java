package lesson14;

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

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
