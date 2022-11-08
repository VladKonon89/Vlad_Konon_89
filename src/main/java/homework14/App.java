package homework14;

import lesson14.Friends;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
//        Set<String> players = new HashSet<>();
//        players.add("Fast");
//        players.add("Jones");
//        players.add("Bonds");
//        players.add("Wilson");
//        System.out.println(players);
//        players.add("Peters");
//        System.out.println(players);
//        System.out.println(players.contains("Jones"));
//        players.remove("Wilson");
//        System.out.println(players);
//        System.out.println(players.contains("Wilson"));
//
//        for (String player : players){
//            System.out.println(player);
//        }

        Set<Friends> name = new HashSet<>();
        Friends vlad = new Friends("Vlad");
        Friends jim = new Friends("Jim");
        Friends alex = new Friends("Alex");
        Friends art = new Friends("Art");

        name.add(vlad);
        name.add(jim);
        name.add(alex);
        name.add(art);
        System.out.println(name);
        name.add(new Friends("Igor"));
        System.out.println(name);
        System.out.println(name.contains("Vlad"));
        name.remove("Jim");
        System.out.println(name);
        System.out.println(name.contains("Jim"));

        for (Friends names : name){
            System.out.println(names);
        }
//        for (int i = 0; i<name.size(); i++){
//            System.out.println(name);
//        }

    }
}
