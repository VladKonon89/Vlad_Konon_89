package homework14;

import java.util.*;

public class App2 {
    public static void main(String[] args) {
        Map<Integer,String> teammates = new HashMap<>();
        teammates.put(1,"Shawn");
        teammates.put(9,"Liam");
        teammates.put(26,"Joe");
        teammates.put(37,"Ken");
        System.out.println(teammates);
        teammates.put(9,"Kyle");
//        System.out.println(teammates);
//        teammates.replace(37,"Dan");
//        System.out.println(teammates);
//        teammates.remove(37,"Dan");
//        System.out.println(teammates);

        Set<Integer> numbers = teammates.keySet();
        System.out.println(numbers);

        for (Integer n : teammates.keySet()){
            System.out.println(n);
        }
//                Collection<String> names = teammates.values();
//        for (String v: names){
//            System.out.println(v);
//        }
//
//        for (String name : teammates.values()){
//            System.out.println(name);
//        }

        for (Map.Entry<Integer,String> pair : teammates.entrySet()){
            System.out.println(pair.getKey()+" ->>"+pair.getValue());
        }

    }
}
