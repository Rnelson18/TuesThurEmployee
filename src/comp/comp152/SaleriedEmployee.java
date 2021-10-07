package comp.comp152;

public class SaleriedEmployee extends Employee{
    private double yearlySalery;


    public SaleriedEmployee(double salary) {
        yearlySalery = salary;
    }
    @Override
    public double calculate01WeeklyPay() {
        return 0;
    }



}
}
