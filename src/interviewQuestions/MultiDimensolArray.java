package interviewQuestions;

public class MultiDimensolArray {


    public static void main(String[] args) {
      int[][] array ={{7,12,34,55},{444,556,76},{4},{2,4,5,6,7,777,5}};
        elemanSayisi(array);


    }

    private static void elemanSayisi(int[][] array) {
        int sayac=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
            sayac++;
            }
        }
        System.out.println("sayac = " + sayac);

    }


}
