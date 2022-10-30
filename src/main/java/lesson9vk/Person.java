package lesson9vk;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public Person(String name, String lastName, int year){  //constructor
        this.name=name;
        this.year=year;
        this.lastName=lastName;
    }
    public Person(String name, String lastName){  //constructor
        this.name=name;
        this.lastName=lastName;
    }

    public Person(){}  //empty constructor (is a method), we use it when create an instance(object)



    public void setName(String name) {
        this.name = name;
//        if(name.trim().length()==0){
//            throw new IllegalArgumentException("Wrong name");
//        }
//        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int year1) {
//        year=year1;
        if (year1>2022 || year1<1900) {
            throw new IllegalArgumentException("Wrong year");
        }
        year=year1;
    }

    public void printMe(){
        System.out.println("Name: "+ name+"\nLast name: "+this.lastName+"\nYear of Birth: "+this.year);
    }
}


