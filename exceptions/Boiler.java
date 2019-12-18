import enums.BoilerState;
import enums.HardwareState;

public class Boiler {
    public Boiler() {
        emergencyFile = new FileWriterWrapper("EmergencyFile.txt");
        emergencyFile.write("STARTING BOILER CONTROLLER\r\n");
        pressureReportFile = new FileWriterWrapper("pressureReportFile.txt");
        pressureReportFile.write("STARTING BOILER CONTROLLER\r\n");
        ps = new PressureSensorConnector(new PressureSensor(), this);
        prv = new PressureReleaseValveConnector(new PressureReleaseValve(
                                                                         HardwareState.stuck),
                                                this);
        boilerState = BoilerState.safe;
    }

    void shutdown() {
        emergencyFile.write("Engaging shutdown procedure.\r\n");
        prv.open();
        emergencyFile.write("BOILER CONTROLLER SHUT DOWN\r\n");
        emergencyFile.close();
        pressureReportFile.write("BOILER CONTROLLER SHUT DOWN\r\n");
        pressureReportFile.close();
    }

    void start() {
        while (boilerState == BoilerState.safe) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println(ps.getPressure());
        }
    }

    PressureSensorConnector ps;
    PressureReleaseValveConnector prv;
    BoilerState boilerState;
    FileWriterWrapper emergencyFile;
    FileWriterWrapper pressureReportFile;
}