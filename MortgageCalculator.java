import java.text.NumberFormat;

public class MortgageCalculator implements EmployeeConstants {

    public static void printMortgage(Employee e) {
        double mortgage = e.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(Employee e) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= e.getYears() * MONTHS_IN_YEAR; month++) {
            double balance = e.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

}
