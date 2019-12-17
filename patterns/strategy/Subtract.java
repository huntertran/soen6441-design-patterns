public class Subtract implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Called from Subtract's execute");
        return a - b;
    }
}