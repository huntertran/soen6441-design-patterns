public class Box<T extends Number> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public void inspect() {
        System.out.println("T: " + t.getClass().getName());
    }

    public <U> void inspectWithType(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(10);
        integerBox.inspect();

        integerBox.inspectWithType("Hello World");

        int i = integerBox.get();
        System.out.println("Value in box: " + i);
    }
}