package lesson10;

public class Address {
    private String street1;
    private String city;
    private int zip;
    private State state;

    public Address(String street1, String city, int zip, State state) {
        this.street1 = street1;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    public Address(String s, String calgary, String s1) {
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street1='" + street1 + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", state=" + state +
                '}';
    }
}
