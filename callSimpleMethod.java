package file_latihan;
//overload method example
public class callSimpleMethod {
    public static void main(String[] args) {
        int intValue = 45;
        double doubleValue = 9.0;
        simpleMethod(doubleValue);
        simpleMethod(intValue);
    }
    public static void simpleMethod(double d){
        System.out.println("Method receives double parameter"+d);
    }
    public static void simpleMethod(int d){
        System.out.println("Method receives integer parameter"+d);
    }
}
