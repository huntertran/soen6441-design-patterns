package custom;

import enums.HardwareState;

public class StuckValveException extends ActuatorException {
    private static final long serialVersionUID = -6017777325440613748L;

    public StuckValveException(HardwareState hardwareState) {
        super(hardwareState);
    }
}