import java.util.Random;

import custom.NegativePressureException;
import custom.OverloadPressureException;

public class PressureSensor {
    public PressureSensor() {
        randomGenerator = new Random();
    }

    int getPressure() throws NegativePressureException,
                      OverloadPressureException {
        int pressure = randomGenerator.nextInt(105) - 1;
        if (pressure < 0) {
            throw new NegativePressureException(pressure);
        }
        if (pressure > 100) {
            throw new OverloadPressureException(pressure);
        }
        return pressure;
    }

    Random randomGenerator;
}
