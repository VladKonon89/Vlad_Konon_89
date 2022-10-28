package homework8;

public class States {
    public String state;
    public String month;
    public int date;
    public int year;

    public void admitted(){
        System.out.println(state+" was admitted to the Union on "+month+" "+date+", "+year);
    }
    public void takenFrom(String state){
        System.out.println(this.state+" was taken from "+state);
    }


}
