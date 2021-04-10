import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArrivalTime {
    Calendar arrivalTime = new GregorianCalendar();
    private final int MONTH = 30;
    private final int HOURS = 24;

    public ArrivalTime() {   //.set(тип времени, значение);
        //число1 + Math.random()*число2
        Calendar fistDate = new GregorianCalendar();
        arrivalTime.set(Calendar.DAY_OF_MONTH, (int) (fistDate.get(Calendar.DAY_OF_MONTH) + Math.random() * MONTH));
        arrivalTime.set(Calendar.HOUR_OF_DAY, (int) (Math.random() * (HOURS + 1)));
        // (int)(0+Math.random()*24)
    }



}
