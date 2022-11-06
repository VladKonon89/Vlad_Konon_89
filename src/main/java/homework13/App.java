package homework13;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> player = new ArrayList<>();
        player.add("Wilson");
        player.add("Jones");
        player.add("Nunez");
        player.add("Smith");
        System.out.println(player);
        System.out.println(player.size());
        System.out.println(player.get(3));
        System.out.println(player.get(0));
        player.set(3,"Peterson");
//        String oldValue = player.set(3,"Smith");
        System.out.println(player);
//        System.out.println(oldValue);
        player.add(2,"Green");
        System.out.println(player);
        System.out.println(player.size());

//        player.remove("Wilson");
//        player.remove("Jones");
//        System.out.println(player);

//                for (int i = 0;i< player.size();i++){
//            System.out.println(player.get(i));
//        }
//
//        for (String color : player){
//            System.out.println(color);
//        }

        player.forEach(x-> System.out.println(x));


    }
}
