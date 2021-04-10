import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArrivalTime {
    Calendar arrivalTime = new GregorianCalendar();
    private final int MONTH = 30;
    private final int HOURS = 24;
    private final int MINUTES_AND_SECONDS = 60;

    public ArrivalTime() {

        Calendar fistDate = new GregorianCalendar();
        arrivalTime.set(Calendar.DAY_OF_MONTH, (int) (fistDate.get(Calendar.DAY_OF_MONTH) + Math.random() * MONTH));
        arrivalTime.set(Calendar.HOUR_OF_DAY, (int) (Math.random() * (HOURS + 1)));
        arrivalTime.set(Calendar.MINUTE, (int) (Math.random() * (MINUTES_AND_SECONDS + 1)));
        arrivalTime.set(Calendar.SECOND, (int) (Math.random() * (MINUTES_AND_SECONDS + 1)));
    }



}
