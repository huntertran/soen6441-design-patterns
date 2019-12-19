public class Pair<X, Y> {
    private final X a;
    private final Y b;

    public Pair(X a, Y b) {
        this.a = a;
        this.b = b;
    }

    public X getFirst() {
        return this.a;
    }

    public Y getSecond() {
        return this.b;
    }
}