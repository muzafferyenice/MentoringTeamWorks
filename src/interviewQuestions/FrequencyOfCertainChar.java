package interviewQuestions;

import java.util.Scanner;

public class FrequencyOfCertainChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir isim girin");
        String isim=scan.nextLine();
        System.out.println("harf girin");
        char harf=scan.next().charAt(0);
        int count= 0;
        for (int i = 0; i <isim.length() ; i++) {
            if (isim.charAt(i)==(harf)){
                count++;
            }
        }
        System.out.println(count+" defa "+harf+" harfi "+ isim+" de var");

    }
}
