package file_latihan;

import java.time.LocalDate;
import java.time.Month;

public class FitnessTracker {
    private String fitnessActivity;
    private short numberMinutes;
    private LocalDate date;
    public FitnessTracker(){
        this.numberMinutes=0;
        this.fitnessActivity="running";
        this.date = LocalDate.of(2000, Month.JANUARY, 1);
    }
    public FitnessTracker(String fitnessActivity, short numberMinutes, LocalDate date){
        this.numberMinutes=numberMinutes;
        this.fitnessActivity=fitnessActivity;
        this.date = date;
    }
    public String getFitnessActivity() {
        return fitnessActivity;
    }
    public void setFitnessActivity(String fitnessActivity) {
        this.fitnessActivity = fitnessActivity;
    }
    public short getNumberMinutes() {
        return numberMinutes;
    }
    public void setNumberMinutes(short numberMinutes) {
        this.numberMinutes = numberMinutes;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
}
