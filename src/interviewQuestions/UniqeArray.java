package interviewQuestions;

import java.util.ArrayList;

public class UniqeArray {
    public static void main(String[] args) {

        /*
        arrayda tekrar edenlri sil tekrarsiz olustur
         */
        int arr[] = {1, 1, 1, 2, 2, 2, 3, 3, 3, 5, 4, 8, 6, 9, 8, 7, 44, 44, 44, 55, 22, 72, 55};
        ArrayList<Integer> tekrarsizlist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizlist.contains(arr[i])) {
                tekrarsizlist.add(arr[i]);
            }
        }
        System.out.println("tekrarsizlist = " + tekrarsizlist);


    }
}
