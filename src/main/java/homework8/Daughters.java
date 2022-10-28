package homework8;

public class Daughters {
    public String name;
    public int form;
    public double years;

    public void hi(){
        System.out.println("Hi, I am "+name+" I am "+years+" years old and I am in the "+form+" form.");
    }
    public void hello(String name, double years1){
        System.out.println("Hello "+this.name+" my name is "+name+" " +
                "and we are in the same "+form+" class and I am "+years1+" old.");
    }

}
