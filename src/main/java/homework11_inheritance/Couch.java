package homework11_inheritance;

public class Couch extends Player {
    private String state;
    private String team;

    public Couch(String name, String lastName, String state, String team) {
        super(name, lastName);
        this.state = state;
        this.team = team;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
