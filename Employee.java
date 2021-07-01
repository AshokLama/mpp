package Lab5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Employee {
    private int employeeId;
    List<PayCheck> payChecks = new ArrayList<>();

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public void print() {
        System.out.println("EmployeeID:" + employeeId);
    }

    public void addPayCheck(PayCheck payCheck){
        payChecks.add(payCheck);

}
    public List<PayCheck> getPayChecks() {
        return payChecks;
    }

    public PayCheck CalcCompensation(int pMonth, int pYear) {
        DateRange dateRange = new DateRange(pMonth, pYear);
        PayCheck payCheckEmployee = new PayCheck(this.calcGrossPay(dateRange), dateRange);
        addPayCheck(payCheckEmployee);
        return payCheckEmployee;
    }

    public abstract double calcGrossPay(DateRange dateRange);
}
