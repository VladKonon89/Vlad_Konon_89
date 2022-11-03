package homework11_inheritance;

public class Player {
    protected String name;
    protected String lastName;
    protected int number;

    public Player(String name,int number, String lastName){
        this.name=name;
        this.lastName=lastName;
        this.number=number;
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

    public int getNumber(){
        return number;
    }

    public void setNumber(){
        this.number=number;
    }
}
