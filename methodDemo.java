package file_latihan;

public class methodDemo {
    public static void main(String[] args) {
        System.out.println(calculateGross(12, 120));
    }

    public static double calculateGross(double hours, double payRate){
        double gross = hours*payRate;
        return gross;
    }
}
