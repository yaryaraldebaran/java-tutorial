package file_latihan;

public class Billing {
    public static void main(String[] args) {
        System.out.println("this is billing class");
        System.out.println("hasil satu param ");
        computeBill(19);
        System.out.println("Hasil dua param");
        computeBill(20,(short) 5);
        System.out.println("hasil tiga param");
        computeBill(20, (short) 5, 20);
    }

    public static void computeBill(double price){
        double tax = price*0.08;
        double total = price +tax;
        System.out.println("totalnya adalah "+ total);
    }

    public static void computeBill(double price, short quantity){
        double total = price * quantity;
        double tax = total*0.08;
        double totalPrice = total+tax;
        System.out.println("totalnya adalah "+totalPrice);
    }
    public static void computeBill(double price, short quantity, double coupon){
        double total = price*quantity;
        double totalC= total - (total*(coupon/100));
        double tax = totalC*0.08;
        double totalPrice = totalC+tax;
        System.out.println("totalnya adalah "+totalPrice);
    }

}
