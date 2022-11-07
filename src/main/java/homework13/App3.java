package homework13;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Member> member = new ArrayList<>();
        Member jim = new Member("Jim");
        Member vlad = new Member("Vlad");
        Member jane = new Member("Jane");
        Member lucy = new Member("Lucy");

        member.add(jim);
        member.add(vlad);
        member.add(jane);
        member.add(lucy);
        member.add(new Member("Dan"));
        System.out.println(member);
        System.out.println(member.get(4).getName());
        System.out.println(member.get(0));
        System.out.println(member.size());

//        member.set(2,new Member("Art"));
//        Member oldValue = member.set(2, new Member("Jane"));
        System.out.println(member);

//        System.out.println(member.remove(lucy));


        for (int i = 0; i<member.size(); i++){
            System.out.println(member.get(i));
        }

        for (Member v : member){
            System.out.println(v);
        }

    }
}
