package Lab5;

public final class PayCheck {
    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;
    private DateRange payPeriod;

    public PayCheck(double grossPay, DateRange payPeriod) {
        this.grossPay = grossPay;
        this.fica =  0.23;
        this.state = 0.05;
        this.local = 0.01;
        this.medicare = 0.03;
        this.socialSecurity = 0.075;
        this.payPeriod = payPeriod;
    }

    public DateRange getPayPeriod() {
        return payPeriod;
    }

    public void print() {
        System.out.println("GrossPay:" + grossPay + "\t" + "PayPeriod:" + payPeriod);
    }

    double getNetPay() {
        return grossPay * (1 - fica - state - local - medicare - socialSecurity);
    }

}
