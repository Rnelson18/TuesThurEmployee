package comp.comp152;

public abstract class Employee {
    public void fileW2Forms(){
        System.out.println("Now Generating the W-2 form for this employee");
    }


    public abstract double calculate01WeeklyPay();

    public void withholdTaxes(){
        System.out.println("Now withholding "+ calculate01WeeklyPay()*.2 + " in taxes");
    }

    public abstract double calculateBiWeeklyPay();
}
