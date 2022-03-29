package myProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TekrarEdenleriSilen {
    public static void main(String[] args) {

        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        List<Integer> tekrarsiz = new ArrayList<>();
        for (Integer s :arr) {
            if (!tekrarsiz.contains(s)){
                tekrarsiz.add(s);
            }
        }
        Collections.sort(tekrarsiz);
        int tekrarsizArray[]=new int[tekrarsiz.size()];
        for(int i = 0 ; i< tekrarsiz.size();i++) {
            tekrarsizArray[i] = tekrarsiz.get(i);
        }
        System.out.println("arr = " + Arrays.toString(tekrarsizArray));
    }
}
