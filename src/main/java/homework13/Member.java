package homework13;

import java.util.Objects;

public class Member {
    public static Member jim;
    public String name;

    public Member(String name) {
        this.name = name;
    }

    public static Member getJim() {
        return jim;
    }

    public static void setJim(Member jim) {
        Member.jim = jim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return getName();
    }

}
