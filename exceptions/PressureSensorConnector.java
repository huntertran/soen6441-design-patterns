import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import custom.SensorException;
import enums.BoilerState;

public class PressureSensorConnector {
    private PressureSensor ps;
    Boiler b;

    public PressureSensorConnector(PressureSensor new_ps, Boiler new_b) {
        ps = new_ps;
        b = new_b;
    }

    int getPressure() {
        int pressure = 999;
        try {
            pressure = ps.getPressure();
            b.pressureReportFile.write(pressure + "@" + getTime() + "\r\n");
        } catch (SensorException e) {
            b.emergencyFile.write(e.toString() + "\r\n");
            b.boilerState = BoilerState.unsafe;
            b.shutdown();
        }
        return pressure;
    }

    String getTime() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(new Date());
    }
}
