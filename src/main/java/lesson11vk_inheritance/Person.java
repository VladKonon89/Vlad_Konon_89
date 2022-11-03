package lesson11vk_inheritance;

public class Person {
    protected String name;
    protected String lastName;
    protected int year;
    // protected is seen in child classes


    public Person(String name, String lastName, int year){
        this.name=name;
        this.lastName=lastName;
        this.year=year;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName=lastName;
    }

    public int getYear(){
        return year;
    }
    public void setYear(){
        this.year=year;
    }

}
