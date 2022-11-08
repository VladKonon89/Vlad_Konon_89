package homework14;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<String, String> teams = new HashMap<>();
        teams.put("NY", "Rangers");
        teams.put("LA", "Kings");
        teams.put("Calgary", "Flames");
        teams.put("NJ", "Devils");
        System.out.println(teams);
        teams.put("NY", "Islanders");
//        System.out.println(teams);
        teams.replace("NY", "Rangers");
//        System.out.println(teams);
//        teams.remove("NJ");
//        System.out.println(teams);

//        Set<String> cities = teams.keySet();
//            System.out.println(cities);
//        }

//        for (String city : teams.keySet()) {
//            System.out.println(city);
//        }

//        Collection<String> team = teams.values();
//        for (String v: team){
//            System.out.println(v);
//        }
//        for (String team : teams.values()){
//            System.out.println(team);
//        }

        for (Map.Entry<String,String> pair : teams.entrySet()){
            System.out.println(pair.getKey()+" ->>"+pair.getValue());
        }

    }

}


