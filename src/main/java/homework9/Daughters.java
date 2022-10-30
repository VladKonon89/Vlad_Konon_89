package homework9;

public class Daughters {
    private String name;
    private int form;
    private double years;

    public Daughters(){}  // default constructor for Sofia


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setForm(int form) {
        this.form = form;
    }
    public int getForm() {
        return form;
    }

    public void setYears(double years) {
        this.years = years;
    }
    public double getYears(){
         return years;
    }


    public Daughters(String name, int form, double years){  // full constructor for Nika
        this.name=name;
        this.form=form;
        this.years=years;
    }


    public void hi(){
        System.out.println("Hi, I am "+name+" I am "+years+" years old and I am in the "+form+" form.");
    }
    public void hello(String name, double years){
        System.out.println("Hello "+this.name+" my name is "+name+" " +
                "and we are in the same "+form+" class and I am "+years+" old.");
    }

    public void hello() {
    }
}
