package homework9;

public class Provinces {
    private String province;
    private String capital;
    private double income;
    private int year;

    public Provinces(){}

    public void setProvince(String province){
        this.province=province;
    }
    public String getProvince(){
        return province;
    }
    public void setCapital(String capital){
        this.capital=capital;
    }
    public String getCapital(){
        return capital;
    }
    public void setIncome(double income){
        this.income=income;
    }
    public double getIncome(){
        return income;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }

    public Provinces(String province,String capital,double income,int year){
        this.province=province;
        this.capital=capital;
        this.income=income;
        this.year=year;
    }

    public void printInfo2(){
        System.out.println(capital+" is the capital of province "+province+", family income is about $"+income+
                " CAD in "+year);
    }

}
