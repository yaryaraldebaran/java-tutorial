package file_latihan;

/**
 * latString
 */
public class latString {

    public static void main(String[] args) {
        String greeting = "Hellow world";
        int panjangGreeting = greeting.length();
        System.out.println("panjang string greeting adalah "+panjangGreeting);

        //penggabungan string
        String semua = " Semua";
        String gretsem = greeting+ semua;
        System.out.println(gretsem);

        //mencari posisi
        int posisi = gretsem.indexOf("w",6);
        System.out.println("posisi adalah "+posisi);

        //membandingkan string
        String str1 = "This is really not imutable";
        String str2 = "this is really not immutable";
        int compare;
        boolean compare2;
        compare = str1.compareToIgnoreCase(str2);
        System.out.println(compare);
        compare2 = str1.equals(str2);
        System.out.println("string 1 apakah sama dengan string 2? "+compare2);

        //contains untuk mengecek apakah suatu string ada di dalam atau tidak
        String str3 = "This is really immutable";
        boolean containi = str3.contains("i");
        System.out.println("apakah string3 mengandung char i? "+containi);

        //konversi nilai 
        String numb = "9";
        System.out.println(Integer.parseInt(numb));

        //membagi string
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 2);
  
        for (String a : arrOfStr)
            System.out.println(a);

        String[] arrOfStr2 = str.split("s", 0);
    
        for (String a : arrOfStr2)
            System.out.println(a);
    }
}