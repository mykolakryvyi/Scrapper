package scrapper;

public class Home {
    private int price;
    private double beds;
    private double baths;
    private double garages;

    public Home(int price, double beds, double baths, double garages) {
        this.price = price;
        this.beds = beds;
        this.baths = baths;
        this.garages = garages;
    }

    @Override
    public String toString() {
        return "Home{" +
                "price=" + price +
                ", beds=" + beds +
                ", baths=" + baths +
                ", garages=" + garages +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public double getBeds() {
        return beds;
    }

    public double getBaths() {
        return baths;
    }

    public double getGarages() {
        return garages;
    }
}