public class SingletonObject {
    private static SingletonObject instance;

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        if (instance == null) {
            instance = new SingletonObject();
        }

        return instance;
    }

    private int value;

    public void increaseValue() {
        value++;
    }

    public void showMessage() {
        System.out.println("Hello world from Singleton. The value is: " + value);
    }
}