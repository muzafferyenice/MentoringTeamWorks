package myAdvancedProjects;

import java.util.ArrayList;

public class Array_Method_Creation {
    public static void main(String[] args) {

        /* TASK :
         * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
         * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
         */
        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        System.out.println("ardisikTopla() = " + ardisikTopla(arr));


    }

    private static ArrayList<Integer> ardisikTopla(int[] arr) {
        ArrayList<Integer> toplananSayilarList = new ArrayList<>();
        int count=0;    // for kac kere calisma sarti o kadar arr elemani getirr
        int toplananSayiAdedi=1;   // arr den baslangicta 1 eleman toplamya girecek
        while (arr.length-toplananSayiAdedi>=count){// sayilar bitene kadar arr den elemanlari artirarak getir
            // topla ve her toplami
            int toplam =0;
            for (int i = 0; i <=count ; i++) { // arr den dongu sayisi kadar eleman getirip toplama ekliyor
                toplam+=arr[toplananSayiAdedi-1+i];

            }
            count++;
            toplananSayiAdedi+=count; // her while dongude toplanacak arr elemani sayisi artiriliyor
            toplananSayilarList.add(toplam);  // her while donguden elde edilen toplam liste eleman olrak ekleniyor
        }
return toplananSayilarList;
    }

}
