package custom;

public class OverloadPressureException extends SensorException {
    private static final long serialVersionUID = 1206089821847045866L;

    public OverloadPressureException(int value) {
        super(value);
    }
}
