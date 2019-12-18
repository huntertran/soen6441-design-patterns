package custom;

import enums.HardwareState;

public class ActuatorException extends HardwareException {
    private static final long serialVersionUID = 1L;
    protected HardwareState hardwareState;

    public ActuatorException(HardwareState hardwareState) {
        super();
        this.hardwareState = hardwareState;
    }

    @Override
    public String toString() {
        return this.executionTime + ":" + this.getClass() + ":" + this.hardwareState.name();
    }
}
