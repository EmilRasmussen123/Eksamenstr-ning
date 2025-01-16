public class Beer {
    private String name;
    private double alcoholPercentage;
    private double price;

    // Constructor
    public Beer(String name, double alcoholPercentage, double price) {
        this.name = name;
        setAlcoholPercentage(alcoholPercentage); // Use setter to validate
        setPrice(price); // Use setter to validate
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setAlcoholPercentage(double alcoholPercentage) {
        if (alcoholPercentage < 0 || alcoholPercentage > 100) {
            throw new IllegalArgumentException("Alcohol percentage must be between 0 and 100.");
        }
        this.alcoholPercentage = alcoholPercentage;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public static void main(String[] args) {
        // Create a list of beers
        Beer[] beers = {
                new Beer("Beer1", 5.0, 25.0),
                new Beer("Beer2", 4.5, 20.0),
                new Beer("Beer3", 6.0, 30.0)
        };

        // Calculate average price
        double totalPrice = 0;
        for (Beer beer : beers) {
            totalPrice += beer.getPrice();
        }
        double averagePrice = totalPrice / beers.length;

        System.out.println("The average price of the beers is: " + averagePrice + " Kr.");
    }
}
