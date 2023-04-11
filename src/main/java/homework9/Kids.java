package homework9;

public class Kids {
    private String name;
    private int age;

    public Kids (){}

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public Kids (String name,int age){
        this.age=age;
        this.name=name;
    }

    public void printKids(){
        System.out.println("My daughter's name is "+name+" she is "+age);
    }

}
