package Lab5;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public final class DateRange {
    private Calendar startDate;
    private Calendar endDate;

    DateRange(int month, int year) {
        startDate = Calendar.getInstance();
        endDate = Calendar.getInstance();
        startDate.set(year, month, 1);
        endDate.set(year, month, (startDate.getActualMaximum(Calendar.DATE)));
    }
//    LocalDateTime  current = LocalDateTime.now();
//    public DateRange(Calendar startDate, Calendar endDate) {
//        this.startDate = startDate;
//        this.endDate = endDate;
//    }


    boolean isInRange(Date date) {
        Calendar newDate = Calendar.getInstance();
        newDate.setTime(date);

        int startYear = startDate.get(Calendar.YEAR);
        int startMonth = startDate.get(Calendar.MONTH);

        int endYear = endDate.get(Calendar.YEAR);
        int endMonth = endDate.get(Calendar.MONTH);

        int year = newDate.get(Calendar.YEAR);
        int month = newDate.get(Calendar.MONTH);
        month++;

        System.out.println(startMonth + " " + endMonth + " " + month);

        return (year >= startYear && year <= endYear) && (month >= startMonth && month <= endMonth);
    }


    public static Date getFirstDayOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }


    public static Date getLastDateOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    @Override
    public String toString() {
        return startDate.get(Calendar.YEAR) + " " + startDate.get(Calendar.MONTH) + " " + startDate.get(Calendar.DAY_OF_MONTH) + " " +
                endDate.get(Calendar.YEAR) + " " + endDate.get(Calendar.MONTH) + " " + endDate.get(Calendar.DAY_OF_MONTH);
    }
}
