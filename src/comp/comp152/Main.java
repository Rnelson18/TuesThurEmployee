package comp.comp152;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        WeekDay deliverDay = WeekDay.Friday;
        deliverDay = WeekDay.Saturday;
        var picker = new Random();
        var choice = picker.nextInt(WeekDay.values().length);
        deliverDay = WeekDay.values()[choice];
        System.out.println("Your delivery will happen on " +deliverDay);
    }
}
