package lesson13;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Pink");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.get(1));
        String oldValue = colors.set(1,"Yellow");
        System.out.println(colors);
//        System.out.println(oldValue);
        colors.add("Violet");
        colors.add("Magenta");
        colors.add("Orange");
        System.out.println(colors);
        System.out.println(colors.size());

        colors.add(1,"Gray");
        System.out.println(colors);
        System.out.println(colors.size());

        colors.remove("Red");

        System.out.println(colors);

//        for (int i = 0;i< colors.size();i++){
//            System.out.println(colors.get(i));
//        }

//        for (String color : colors){
//            System.out.println(color);
//        }

//        colors.forEach(x-> System.out.println(x));

//        colors.forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);

        List<Person> team = new ArrayList<>();
        Person anna = new Person("Anna");
        Person david = new Person("David");

        team.add(anna);
        team.add(david);
        team.add(new Person("Steve"));

        System.out.println(team.get(1).getName());

    }

}
