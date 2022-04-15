package interviewQuestions;

import java.util.ArrayList;

public class RandomList {
    /*
    list olustur 10 eleman
    random ekle void method olustur pmsi int array list ol
    0 20 arasi deger atasin metho
    eger cift sayi atarsa 111 yazdirsin
    eger cift sayi yoksa cift sayi yok mesaji versin
     */
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        randomEkle(list);


    }

    private static void randomEkle(ArrayList<Integer> list) {
        for (int i = 0; i <10 ; i++) {
            list.add((int) (Math.random()*20));//double a sahip math.random classi hata verdiginden
            //integer a casting yaptik


        }
        System.out.println("raondom liste : "+list);
        int sayac=0;        for (int i = 0; i < list.size() ; i++) {
           if (list.get(i)%2==0){//cift sayi varsa
                list.set(i,111);
            }
        }
        System.out.println("111 ler eklendi "+ list);
        if (sayac==0){
            System.out.println("listede cift sayi yok");
        }
        System.out.println("liste son hali : "+list);
    }
}
