package comp.comp152;

public class CommissionEmployee extends Employee {
    private int numberofSales;
    public final static double commissionAccount = 100;

    public CommissionEmployee(){
        numberofSales = 0;
    }

    public void makeSale(){
        numberofSales++;
    }

    @Override

    public double calculate01WeeklyPay() {
        return 0;
    }

    @Override
    public double calculateBiWeeklyPay() {
        var payAmount = 1000+numberofSales*commissionAccount;
        numberofSales = 0;
        return payAmount;
    }
}



