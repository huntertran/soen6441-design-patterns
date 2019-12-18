package custom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HardwareException extends Exception {
    private static final long serialVersionUID = 1L;
    protected String executionTime;

    public HardwareException() {
        executionTime = getTime();
    }

    private String getTime() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(new Date());
    }
}