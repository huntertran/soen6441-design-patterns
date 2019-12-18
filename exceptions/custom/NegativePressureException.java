package custom;

public class NegativePressureException extends SensorException {
    private static final long serialVersionUID = 1748885774796305561L;

    public NegativePressureException(int value) {
        super(value);
    }
}
