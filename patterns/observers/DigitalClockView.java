import java.util.Observable;
import java.util.Observer;

public class DigitalClockView implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        ClockTimerModel clockTimer = (ClockTimerModel) o;
        int hour = clockTimer.getHour();
        int minute = clockTimer.getMinute();
        int second = clockTimer.getSecond();

        System.out.println(hour + ":" + minute + ":" + second);
    }

}