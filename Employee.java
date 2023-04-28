public class Employee implements EmployeeConstants {

    private int principal;
    private float annualInterest;
    private byte years;

    public Employee(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public float getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest(float annualInterest) {
        this.annualInterest = annualInterest;
    }

    public byte getYears() {
        return years;
    }

    public void setYears(byte years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "principal=" + principal +
                ", annualInterest=" + annualInterest +
                ", years=" + years +
                '}';
    }

    public double calculateMortgage() {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }
}
