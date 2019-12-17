import coffee.Coffee;
import coffee.Espresso;
import coffee.SimpleCoffee;
import coffee.decorators.Milk;
import coffee.decorators.Sprinkles;
import coffee.decorators.Whip;

public class DecoratorDriver {
    public static void main(String[] args) {
        Coffee c = new SimpleCoffee();

        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        c = new Milk(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        c = new Sprinkles(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        c = new Whip(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        c = new Sprinkles(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        c = new Espresso();
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        c = new Milk(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
    }
}