package homework9;

public class Teams {
    private String name;
    private String league;
    private double money;

    public Teams(){}  // default constructor for Shakhtar


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setLeague(String league) {
        this.league = league;
    }
    public String getLeague() {
        return league;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public double getYears(){
        return money;
    }


    public Teams(String name, String league, double money){  // full constructor for Nika
        this.name=name;
        this.league=league;
        this.money=money;
    }


    public void cost(){
        System.out.println("The best team "+name+" which plays in "+league+" earned "+money+" this year.");
    }

}
