package homework16;


import homework15.Address;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Address address = new Address("3820 Manchester Rd SE","Calgary","Alberta", 63000);

        Map<Cattle,Integer> cattle = new HashMap<>();
        cattle.put(Cattle.COWS, 55);
        cattle.put(Cattle.CHICKENS, 66);
        cattle.put(Cattle.PIGS, 77);
        cattle.put(Cattle.SHEEPS, 88);
        cattle.put(Cattle.TURKEYS, 99);

//        for (Integer n : cattle.values()){
//            System.out.println(n);
//        }
//        for (Cattle c : cattle.keySet())
//            System.out.println(c);


        List<AgreeCultural> agreeCultural = new ArrayList<>();
        AgreeCultural wheet = new AgreeCultural("Wheet", 011);
        agreeCultural.add(wheet);
        AgreeCultural soya = new AgreeCultural("Soya", 022);
        agreeCultural.add(soya);
        agreeCultural.add(new AgreeCultural("Pea", 033));

//        for (int i = 0; i<agreeCultural.size(); i++);
//        System.out.println(agreeCultural);

//        for (AgreeCultural a : agreeCultural) {
//            System.out.println(a);
//        }
//        System.out.println(agreeCultural);

        Farm StampedeCityFarming = new Farm("Stampede City Farming", address, cattle, agreeCultural);

//      System.out.println(StampedeCityFarming);
//        StampedeCityFarming.printAgreeCultural();

    }
}
