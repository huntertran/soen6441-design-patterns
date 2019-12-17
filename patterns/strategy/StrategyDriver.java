public class StrategyDriver {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setStrategy(new Add());
        int addResult = calc.getStrategy().execute(3, 4);
        System.out.println("Add result: " + addResult);

        calc.setStrategy(new Subtract());
        int subtractResult = calc.getStrategy().execute(3, 4);
        System.out.println("Subtract result: " + subtractResult);
    }
}