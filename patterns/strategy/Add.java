public class Add implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println("Called Add's execute");
        return a + b;
    }
}