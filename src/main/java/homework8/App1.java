package homework8;

public class App1 {
    public static void main(String[] args) {
        City prague = new City();
        prague.cityName = "Prague";
        prague.country = Country.Czech_Republik;
        prague.foundedYear = 950;
        prague.degrees = 20.1;
        prague.cityInfo();

        City vienna = new City();
        vienna.country = Country.AUSTRIA;
        vienna.cityName = "Vienna";
        vienna.foundedYear = 500;
        vienna.degrees = 18.9;
        vienna.cityInfo();

        City cityName = new City();
        cityName.cityName = "Calgary";
        cityName.country = Country.Canada;
        cityName.foundedYear = 1875;
        cityName.degrees = 25;
        cityName.cityInfo();

        City milan = new City();
        milan.cityName = "Milan";
        milan.country = Country.Italy;
        milan.foundedYear = 600;
        milan.degrees = 25.6;
        milan.cityInfo();


    }
}
