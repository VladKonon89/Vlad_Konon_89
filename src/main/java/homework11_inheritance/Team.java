package homework11_inheritance;

public class Team extends Player{
    private String city;
    private int quantityofPlayers;

    public Team(String name, String city, int quantityofPlayers) {
        super(name);
        this.city = city;
        this.quantityofPlayers = quantityofPlayers;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getQuantityofPlayers() {
        return quantityofPlayers;
    }

    public void setQuantityofPlayers(int quantityofPlayers) {
        this.quantityofPlayers = quantityofPlayers;
    }
}
