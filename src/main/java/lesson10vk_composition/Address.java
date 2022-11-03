package lesson10vk_composition;

public class Address {
    private String street;
    private String city;
    private int zip;
    private State state;

    public Address(String street, String city, int zip, State state) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String toString(){
        return "Street"+this.street+"\nCity: "+city+"\nzip: "+zip+" state: "+state;
    }
}
