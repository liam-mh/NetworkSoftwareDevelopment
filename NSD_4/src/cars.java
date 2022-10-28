public class cars {

    private String registration, make;
    private double manufactureDate, price;

    cars() {}
    cars(String registration, String make, double price) {

        this.registration = registration;
        this.make = make;
        this.price = price;
    }

    public void addCar(String registration, String make, double price) {

        this.registration = registration;
        this.make = make;
        this.price = price;
    }

}




