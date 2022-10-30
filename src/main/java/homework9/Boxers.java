package homework9;

public class Boxers {
    private String lastname;
    private  String weight;
    private int year;

    public Boxers(){}  // default constructor for Tyson

    public void setLastname (String lastname){
        this.lastname=lastname;
    }
    public String getLastname(){
        return lastname;
    }

    public void setWeight(String weight){
        this.weight=weight;
    }
    public String getWeight(){
        return weight;
    }

    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }


    public Boxers(String lastname,String weight,int year){   // full constructor for Canelo
        this.lastname=lastname;
        this.weight=weight;
        this.year=year;
    }

    public void print() {
        System.out.println(lastname + " became a champ in " + weight + " in " + year);
    }

    public void printMe(){
        System.out.println("Name: "+ lastname+"\nLast name: "+lastname+"\nYear of Birth: "+this.year);
    }


}
