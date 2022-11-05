package lesson14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App1 {
    public static void main(String[] args) {
        Map<String,String> capitals = new HashMap<>();
        capitals.put("New Zealand","Wellington");
        capitals.put("China","Beijing");
        capitals.put("Austria","Vienna");
        capitals.put("India","New Delhi");
        System.out.println(capitals);
        capitals.put("Germany","Bonn");
        System.out.println(capitals);
        capitals.put("Germany","Berlin");
        System.out.println(capitals);
        capitals.put("England","London");
        capitals.put("UK","London");
        System.out.println(capitals);

        System.out.println(capitals.get("Austria"));

        Map<Integer,String> colors = new HashMap<>();
        colors.put(0,"Red");
        colors.put(1,"Green");
        colors.put(2,"Blue");
        colors.put(3,"Red");
        colors.put(100,"Pink");

        System.out.println(colors.get(0));

        capitals.replace("China","Pekin");
        System.out.println(capitals);

        capitals.remove("China");
        System.out.println(capitals);

//        Set<String> countries = capitals.keySet();
//        for (String country : countries){
//            System.out.println(country);
//        }
//        for (String country : capitals.keySet()){
//            System.out.println(country);
//        }
//        Collection<String> cities = capitals.values();
//        for (String city : cities){
//            System.out.println(city);
//        }
//        for (String city : capitals.values()){
//            System.out.println(city);
//        }
//        for (Map.Entry<String,String> pair : capitals.entrySet()){
//            System.out.println(pair.getKey()+" ->> "+pair.getValue());
//        }
    }
}
