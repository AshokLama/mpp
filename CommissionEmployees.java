package Lab5;

import javax.xml.crypto.Data;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommissionEmployees extends Employee {
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public CommissionEmployees(int employeeId, double commission, double baseSalary) {
        super(employeeId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }


    @Override
    public double calcGrossPay(DateRange dateRange) {
        ZoneId defaultZoneId = ZoneId.systemDefault();
        double totalCommission = 0;
        for (Order o : orders) {
            Date date = Date.from(o.getOrderDate().atStartOfDay(defaultZoneId).toInstant());
            System.out.println(dateRange.isInRange(date));//check
            if(dateRange.isInRange(date)) {

                totalCommission += o.getOrderAmount() * 0.07;
            }
        }
        return baseSalary + totalCommission;


    }

}
