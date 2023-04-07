package homework8;

public class City {
        public String cityName;
        public String country;
        public int foundedYear;
        public double degrees;

        public void cityInfo() {
            System.out.println("The city of " + cityName + " is the capital of " + country + " was founded in " + foundedYear +
                    "\n, daily mean temperature is " + degrees);
        }
    }

