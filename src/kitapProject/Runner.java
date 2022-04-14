package kitapProject;

import java.util.Scanner;

import static kitapProject.KitapIslemleri.*;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Hosgeldiniz");
        System.out.println("*****");
        menu();
    }

    private static void menu() {
        System.out.println("kitap ekle 1\n" +
                "numara ile kitap goruntule 2\n" +
                "bilgi ile kitap goruntule 3\n" +
                "numara ile kitap sil 4\n" +
                "tum kitaplari listele 5\n" +
                "cikis 6");
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                kitapEkle();
                menu();
                break;
            case 2:
                numaraSorgula();
                menu();
                break;

            case 3:
                bilgiSorgula();
                menu();
                break;
            case 4:
                kitapSil();
                menu();
                break;
            case 5:
                kitapListele();
                menu();
                break;
            case 6:
                System.out.println("Iyi gunler dileriz");
                break;
            default:
                System.out.println("Gecerli ifade giriniz");
                menu();

        }
    }
}
