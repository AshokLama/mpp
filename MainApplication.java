package Lab5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new CommissionEmployees(1, 20, 1000);
        Employee emp2 = new HourlyEmployees(2, 20, 40);
        Employee emp3 = new SalariedEmployees(3, 1500);
        Employee emp4 = new SalariedEmployees(4, 2000);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        Order order1 = new Order(1, LocalDate.of(2021, 01, 10), 200);
        Order order2 = new Order(1, LocalDate.of(2021, 11, 1), 230);
        Order order3 = new Order(1, LocalDate.of(2021, 03, 12), 240);

        ((CommissionEmployees) emp1).addOrder(order1);
        ((CommissionEmployees) emp1).addOrder(order2);
        ((CommissionEmployees) emp1).addOrder(order3);


        for (Employee e : employeeList) {
            PayCheck payCheckforOneMonth = e.CalcCompensation(1, 2021);

            e.print();
            System.out.println(e.getClass().getSimpleName() + "\t\t" + "Employee Category");
            for (PayCheck p : e.getPayChecks()) {
                p.print();
                System.out.println("Net pay : " + p.getNetPay());
            }
        }


    }

}
