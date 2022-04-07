package interviewQuestions;

import java.util.Scanner;

public class PinKodu_While {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String pin="mzf.1453";
        int girisHakki=4;
        System.out.println("Hosgeldiniz");
        while (true){
            System.out.println("pin kodunu gir");
            String girilenPin= scan.nextLine();
            if (pin.equals(girilenPin)){
                System.out.println("basarili pin");
                break;
            }else {
                System.out.println("yanlis giris");
                girisHakki--;
                System.out.println("kalan giris hakki : "+girisHakki);
            }if (girisHakki==0){
                System.out.println("bloke oldu");
                break;
            }


        }
    }
}
