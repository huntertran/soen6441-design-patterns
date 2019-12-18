import custom.StuckValveException;
import enums.BoilerState;

public class PressureReleaseValveConnector {
    private PressureReleaseValve prv;
    Boiler b;

    public PressureReleaseValveConnector(PressureReleaseValve new_prv, Boiler new_b) {
        prv = new_prv;
        b = new_b;
    }

    void close() {
        try {
            prv.close();
        } catch (StuckValveException e) {
            b.emergencyFile.write(e.toString());
        }
    }

    void open() {
        try {
            prv.open();
        } catch (StuckValveException e) {
            b.boilerState = BoilerState.critical;
            b.emergencyFile.write(e.toString() + "\r\n");
            b.emergencyFile.write("Evacuation!!\r\n");
        }
    }
}