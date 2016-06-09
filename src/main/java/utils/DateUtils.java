package utils;

import java.util.Calendar;

public class DateUtils {

    public static int millisecondsDay(Calendar date) {
        int hours = date.get(Calendar.HOUR_OF_DAY);
        int minutes = date.get(Calendar.MINUTE);
        int seconds = date.get(Calendar.SECOND);
        int milliseconds = date.get(Calendar.MILLISECOND);
        int milliHours = hours*60*60*1000;
        int milliMinutes = minutes*60*1000;
        int milliSeconds = seconds*1000;
        int result = milliHours + milliMinutes + milliSeconds + milliseconds;
        return result;
    }

}
