package advancedPrejects2;

import java.util.HashSet;

public class ArrayIntegerElementEkler {
    /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan array elemanlari set e convert eden bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};

        elementEkle(hs, arr);
        System.out.println("***");
        elementEkle(hs, new int[]{34,33, 43, 44, 55, 66});
    }

    private static void elementEkle(HashSet<Integer> hs, int[] arr) {
        HashSet<Integer> hs2 = new HashSet<>();
        for (Integer sayi : arr) {
            hs.add(sayi);
        }
        yazdir(hs);
    }

    public static void yazdir(HashSet<Integer> hs) {
        for (Integer s : hs) {
            System.out.print(s + " ");
        }
    }
}
