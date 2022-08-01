package file_latihan;

public class FormLetterWriter {
    String firstName;
    String lastName;
    // FormLetterWriter(String firstName, String lastName){
    //     this.firstName= firstName;
    //     this.lastName=lastName;
    // }
    public void displaySalutation(String lastName){
        System.out.println("Dear Mr. or Ms."+lastName);
        full();
    }
    public void displaySalutation(String lastName, String firstName){
        System.out.println("Dear "+firstName+" "+lastName);
        full();
    }
    public void full(){
        System.out.println("Thank you for your recent order");
    }

}
