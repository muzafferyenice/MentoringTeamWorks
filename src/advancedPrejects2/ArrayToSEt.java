package advancedPrejects2;

import java.util.HashSet;
import java.util.Set;

public class ArrayToSEt { /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle      ***
    olan array elemanalrı set'e convert edn bir method create ediniz .***
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */

    public static void main(String[] args) {
        int[] arr = {1, 22, 34, 55, 66, 77, 88, 88, 88};

        Set<Integer> st = new HashSet<>();
        elementEkle(st, arr);
        System.out.println("st = " + st);
       // setYazdir();
    }

    public static Set<Integer> elementEkle(Set<Integer> st, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);

        }

        return st;
    }

}
