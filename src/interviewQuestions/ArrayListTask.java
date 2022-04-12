package interviewQuestions;

import java.util.ArrayList;

public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<String >renkler=new ArrayList<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Yellow");
        renkler.add("Black");
        System.out.println(renkler);

        for (int i = 0; i <renkler.size() ; i++) {
            System.out.println(renkler.get(i));

        }

        //part2 eklenne ilk index e gelsin
        ilkIndexEkle(renkler,"white");
        System.out.println(renkler);
        sonIndexeEkle(renkler,"Pink");
        System.out.println(renkler);
    }

    private static void sonIndexeEkle(ArrayList<String> renkler, String pink) {
        renkler.add(renkler.size(),pink);
    }

    private static void ilkIndexEkle(ArrayList<String> renkler, String white) {
            renkler.add(0,white);
    }



}
