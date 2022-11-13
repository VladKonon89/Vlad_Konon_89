package homework15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address address = new Address("1 Mcleod street", "Calgary","Alberta", 61000);

        List<Doctor> doctors = new ArrayList<>();
        Doctor jim = new Doctor("Jim","Wilson", Position.PHYSICIAN);
        doctors.add(jim);
        Doctor vlad = new Doctor("Vlad","Jones",Position.CARDIOLOGIST);
        doctors.add(vlad);
        doctors.add(new Doctor("Alexis","Bonds", Position.PEDIATRICIAN));
        doctors.add(new Doctor("Art","Green", Position.ONCOLOGIST));
        doctors.add(new Doctor("Liam","Black", Position.SURGEON));

//        System.out.println(doctors);
//        for (Doctor position : doctors){
//            System.out.println(position);
//        }


//        Map<Integer,Position> rooms = new HashMap<>();
//        rooms.put(17,Position.PHYSICIAN);
//        System.out.println(rooms);
        Map<Integer,String> rooms = new HashMap<>();
        rooms.put(17,"Physician");
        rooms.put(31,"Cardiologist");
        rooms.put(06,"Pediatrician");
        rooms.put(8,"Oncologist");
        rooms.put(18,"Surgeon");

//        for(Integer room : rooms.keySet()){
//            System.out.println(room);
//        }

        List<InsuranceCompanies> acceptedInsurances = new ArrayList<>();
        InsuranceCompanies humana = InsuranceCompanies.Humana;
        acceptedInsurances.add(humana);
        InsuranceCompanies cigna = InsuranceCompanies.CIGNA;
        acceptedInsurances.add(InsuranceCompanies.KAISERFOUNDATION);
        acceptedInsurances.add(InsuranceCompanies.UNITEDHEALTH);
        acceptedInsurances.add(InsuranceCompanies.BLUECROSS);


        Hospital calgaryHospital = new Hospital("Calgary Hospital",address,doctors,rooms, acceptedInsurances);

        System.out.println(calgaryHospital);
        calgaryHospital.printDoctors();

    }


}
