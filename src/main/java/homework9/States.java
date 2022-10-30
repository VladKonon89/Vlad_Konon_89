package homework9;

public class States {
    private String state;
    private String month;
    private int date;
    private int year;


    public States(){}  //default constructor

    public void setState(String state){
        this.state=state;
    }
    public String getState(){
        return state;
    }

    public void setMonth(String month){
        this.month=month;
    }
    public String getMonth(){
        return month;
    }

    public void setDate(int date){
        this.date=date;
    }
    public int getDate(){
        return date;
    }

    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }


    public States(String state, String month, int date, int year){
        this.state=state;
        this.month=month;
        this.date=date;
        this.year=year;
    }


    public void admitted(){
        System.out.println(state+" was admitted to the Union on "+month+" "+date+", "+year);
    }
    public void takenFrom(String state){
        System.out.println(this.state+" was taken from "+state);
    }


}
