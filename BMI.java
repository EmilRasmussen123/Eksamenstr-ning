public class BMI {

    // BMI class with attributes for height and weight
    private double height; // Height in meters
    private double weight; // Weight in kilograms

    // Constructor
    public BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // Method to calculate BMI
    public double calculate() {
        return weight / (height * height);
    }

    // Method to check if BMI is under 18.5
    public boolean isUnderWeight() {
        return calculate() < 18.5;
    }

    // Method to check if BMI is over 25
    public boolean isOverWeight() {
        return calculate() > 25;
    }

    // Method to check if BMI is normal (between 18.5 and 25)
    public boolean isNormalWeight() {
        double bmi = calculate();
        return bmi >= 18.5 && bmi <= 25;
    }

    public static void main(String[] args) {
        // Example usage of the BMI class
        BMI bmi1 = new BMI(1.75, 70); // Height: 1.75 m, Weight: 70 kg

        System.out.println("BMI: " + bmi1.calculate());
        System.out.println("Under weight: " + bmi1.isUnderWeight());
        System.out.println("Normal weight: " + bmi1.isNormalWeight());
        System.out.println("Over weight: " + bmi1.isOverWeight());
    }
}
