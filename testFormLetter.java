package file_latihan;

public class testFormLetter {
    public static void main(String[] args) {
        // System.out.println("this is sysout");
        FormLetterWriter ahyar = new FormLetterWriter();
        ahyar.firstName ="ahyar";
        ahyar.lastName = "ibrahim";
        ahyar.displaySalutation(ahyar.firstName,ahyar.lastName);
    }
}
