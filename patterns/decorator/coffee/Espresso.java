package coffee;

public class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 1.25;
    }

    @Override
    public String getIngredients() {
        return "Strong coffee";
    }
}