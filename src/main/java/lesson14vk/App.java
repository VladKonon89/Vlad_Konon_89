package lesson14vk;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);
        colors.add("Red");
        System.out.println(colors);
        colors.add("Yellow");
        System.out.println(colors.contains("Yellow"));

        for(String color: colors)
            System.out.println(color);
    }
}
