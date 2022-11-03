package homework11_inheritance;

public class Team extends Player {
    private String city;
    private String state;

    public Team(String name, int number, String city, String state) {
        super(name,number);
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
