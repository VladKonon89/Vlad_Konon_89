package homework14;

import lesson11vk_inheritance.Person;
import lesson11vk_inheritance.Student;

import javax.lang.model.element.Name;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App3 {
    public static void main(String[] args) {
        Map<Age,Gentleman> mister = new HashMap<>();
        Age a1 = new Age(33);
        Gentleman g1 = new Gentleman("Vlad","Jones");
        Age a2 = new Age(30);
        Gentleman g2 = new Gentleman("Joe","Black");
        Age a3 = new Age(40);
        Gentleman g3 = new Gentleman("Dan","Tyler");
        Age a4 = new Age(25);
        Gentleman g4 = new Gentleman("Robert","Newman");

        mister.put(a1,g1);
        mister.put(a2,g2);
        mister.put(a3,g3);
        mister.put(a4,g4);
        System.out.println(mister);
        mister.put(new Age(55), new Gentleman("Art","Green"));
        System.out.println(mister);
        System.out.println(mister.size());
//        mister.replace(a3,g4);
//        System.out.println(mister);
//        mister.remove(a1,g2);
//        System.out.println(mister);

//        Set<Age> years = mister.keySet();
//        System.out.println(years);
//
//        for (Age g: mister.keySet() ){
//            System.out.println(g);
//        }
//        for (Gentleman g : mister.values()){
//            System.out.println(g);
//        }

        for (Map.Entry<Age,Gentleman> pair : mister.entrySet()){
            System.out.println(pair.getKey()+" & "+pair.getValue());
        }

    }
}
