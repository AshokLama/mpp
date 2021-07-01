package Lab5;

import java.util.List;

public class HourlyEmployees extends Employee {
    private double hourlyWage;
    private double hourlyPerWeek;

    public HourlyEmployees(int employeeId, double hourlyWage, double hourlyPerWeek) {
        super(employeeId);
        this.hourlyWage = hourlyWage;
        this.hourlyPerWeek = hourlyPerWeek;
    }

    List<DateRange> dateRanges;

    @Override
    public double calcGrossPay(DateRange dateRange) {
        return 4 * hourlyPerWeek * hourlyWage;
    }

}


