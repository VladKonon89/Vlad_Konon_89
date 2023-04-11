package homework9;

import java.security.PublicKey;

public class City {
    private String cityName;
    private String country;
    private int yearFounded;
    private double temp;

    public City (){}   // default constructor

    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry(){
        return country;
    }
    public void setYearFounded(int yearFounded){
        this.yearFounded=yearFounded;
    }
    public int getYearFounded(){
        return yearFounded;
    }
    public void setTemp(double temp){
        this.temp=temp;
    }
    public double getTemp(){
        return temp;
    }

    public City (String cityName, String country, int yearFounded, double temp){   // full constructor
        this.cityName=cityName;
        this.country=country;
        this.yearFounded=yearFounded;
        this.temp=temp;
    }

    public void printInfo(){
        System.out.println(cityName+" is the capital of "+country+", was founed in 950" +
                "\nand the average daily temp is "+25.5+" degrees.");
    }


}
