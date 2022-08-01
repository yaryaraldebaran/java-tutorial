package file_latihan;

import java.util.ArrayList;

public class arrayListHashmap {
    public static void main(String[] args) {
        //array 1D
        int[] value1D = {1,2,3,4,5};
        

        //array 2D
        int[][] value = {
            {1,2,5},
            {5,6,9},
            {4,3,5}
        };
        value[1][1]=0;
        for (int baris=0;baris<value.length;baris++){
            for (int kolom=0;kolom<value[baris].length;kolom++){
                System.out.print(value[baris][kolom]+" ");
            }
            System.out.println("");
        }

        //ArrayList string
        ArrayList <String> list = new ArrayList<String>();
        list.add("budi");
        list.add("adi");
        list.add("cindi");
        for (String i : list){
            System.out.println(i);
        }
    }
}
