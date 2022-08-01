package file_latihan;

import java.time.LocalDate;
import java.time.Month;

public class TestFitnessTracker {
    public static void main(String[] args) {
        FitnessTracker ahyar = new FitnessTracker("Berenang", (short)30, LocalDate.of(2022, Month.JULY, 30));
        System.out.println("aktivitas adalah "+ahyar.getFitnessActivity()+" selama "+ahyar.getNumberMinutes()+ " menit pada "+ahyar.getDate());
    }
}
