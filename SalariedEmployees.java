package Lab5;

public class SalariedEmployees extends Employee {
    private double salary;

    public SalariedEmployees(int employeeId, double salary) {
        super(employeeId);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(DateRange dateRange) {
        return salary;
    }
}
