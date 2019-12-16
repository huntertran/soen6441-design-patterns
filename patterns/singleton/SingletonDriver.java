public class SingletonDriver {
    public static void main(String[] args) {
        SingletonObject object = SingletonObject.getInstance();
        object.increaseValue();
        object.showMessage();

        SingletonObject object2 = SingletonObject.getInstance();
        object2.showMessage();
    }
}