package lesson13vk;

import java.util.Objects;

public class Person extends Object {
    public static Person anna;
    private String name;

    public Person(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        return ((Person)o).getName().equals(this.name);
    }

}
