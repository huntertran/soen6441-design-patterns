package custom;

public class SensorException extends HardwareException {
    private static final long serialVersionUID = 1L;

    public String toString() {
        return this.executionTime + ":" + this.getClass() + ":" + valueRead;
    }

    SensorException(int value) {
        super();
        valueRead = value;
    }

    int valueRead;
}
