package file_latihan;

public class Student {
    private int stuNum;
    private double gpa;
    public Student(int stuNum, double gpa){
        this.stuNum = stuNum;
        this.gpa = gpa;
    }

    public void showStudent(){
        System.out.println("Student #"+stuNum +" gpa is "+gpa);
    }
}
