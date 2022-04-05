package myAdvancedProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahminKisa {

    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST",
            "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("1-" + (filmler.size()) + " arasinda bir sayi giriniz : ");
        int secilenFilmIndex = scan.nextInt();
        filmGetir(filmler, secilenFilmIndex - 1);



    }

    private static void filmGetir(List<String> film, int index) {
        StringBuilder tahminEdilecekFilm = new StringBuilder(FilmTahmin.filmler.get(index).replaceAll("\\w", "-"));//tum harf karakterleri - ile değiştir
        System.out.println(tahminEdilecekFilm);
        System.out.println(film.get(index).length() + " harfli yabanci film seçtiniz. Filmi tahmin etmek için " + 2 * film.get(index).length() + " hakkınız var .");

        char harf = ' ';
        int tahminSayısı = 0;
        int dogruTahminSayısı = 0;
        String str = "";

        do {

            System.out.print("yanlıs tahmin sayisi: " + (tahminSayısı - dogruTahminSayısı) + "/" +
                    2 * film.get(index).length() + "\ntahmin ettiginiz harfi giriniz : ");
            //yanlıs girilen tahmin sayisini print edildi
            harf = scan.next().toUpperCase().charAt(0);//film için tahmin edilen harf alındı
            str += harf;//harf str'ye atandı
            if (!tahminEdilecekFilm.toString().contains(str)) {//tahminEdilecekFilm'de kullanıcıdan alınan harf yoksa tahmin sayısı artılıdı
                tahminSayısı++;
            }

        }while ((tahminSayısı - dogruTahminSayısı) != 2 * film.get(index).length());
    }

}
