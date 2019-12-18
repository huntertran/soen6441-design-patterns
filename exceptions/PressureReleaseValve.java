import java.util.Random;

import custom.StuckValveException;
import enums.ActuatorState;
import enums.HardwareState;

public class PressureReleaseValve {
    public PressureReleaseValve(HardwareState new_s) {
        hw_state = new_s;
        act_state = ActuatorState.closed;
        randomGenerator = new Random();
    }

    void close() throws StuckValveException {
        if (randomGenerator.nextInt(100) <= 2) {
            hw_state = HardwareState.stuck;
        }
        if (hw_state == HardwareState.stuck && act_state == ActuatorState.opened) {
            throw new StuckValveException(hw_state);
        }
    }

    void open() throws StuckValveException {
        if (randomGenerator.nextInt(100) <= 2) {
            hw_state = HardwareState.stuck;
        }
        if (hw_state == HardwareState.stuck && act_state == ActuatorState.closed) {
            throw new StuckValveException(hw_state);
        }
    }

    private ActuatorState act_state;
    HardwareState hw_state;
    Random randomGenerator;
}