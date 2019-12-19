public class PairUtils {
    public static <A extends Number, B extends Number> double add(Pair<A, B> p) {
        return p.getFirst().doubleValue() + p.getSecond().doubleValue();
    }

    public static <A, B> Pair<B, A> swap(Pair<A, B> p) {
        return new Pair<B, A>(p.getSecond(), p.getFirst());
    }

    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<String, Integer>("Hello World", 5);
        Pair<Integer, String> swapped = PairUtils.swap(p);
        System.out.println(swapped.getFirst().toString());
        System.out.println(swapped.getSecond());

        Pair<Integer, Integer> p2 = new Pair<Integer, Integer>(1, 2);
        Double result = PairUtils.add(p2);
        System.out.println(result.toString());
    }
}