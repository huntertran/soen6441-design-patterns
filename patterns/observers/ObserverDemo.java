import java.util.Scanner;

public class ObserverDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int secs = scanner.nextInt();

        ClockTimerModel clockTimer = new ClockTimerModel();
        DigitalClockView digitalClockView = new DigitalClockView();

        clockTimer.addObserver(digitalClockView);

        clockTimer.start(secs);
        scanner.close();
    }
}