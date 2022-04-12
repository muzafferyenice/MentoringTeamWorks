package sansliKullanici;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {
    List<Kullanici> kisiler = new ArrayList<>();// bos list cre
    // edildi method bu list e elemet atayacak
    // bu list kullanici clasindaki obj leri listelr

    public List<Kullanici> kayitAl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\"adinizi girin\" = " + "adinizi girin");
        String isim = scan.nextLine();

        Kullanici k1 = new Kullanici(isim, LocalDateTime.now());//kullanici class
        // dan pm li cons ile obj cre edildi
        kisiler.add(k1);//kullanici class
        // dan pm li cons ile obj cre edilen obj kisiler listesine eklendio


        return kisiler;
    }

    public void sansliKullanici(List<Kullanici> kll) {
        for (Kullanici k : kll) {//kayitAl() methodundan cre edilen
            // herbir kullanici donguye alindi
            if (k.kayitZamani.getSecond() < 10) {//herbir kullanicin
                // kayitzamanindaki zamanindaki saniyesi sarta sokulud
                System.out.println("Sansli kisisinz " + k.name + "agam 5 kilo bal kazandin");
            } else System.out.println("maalesef " + k.name + " sansli degildin");
        }

    }

    public void listele(List<Kullanici> kullanicilar) {
        for (Kullanici k:kullanicilar) {//kayitAl() methodundan gelen kisiler listini donguye sokuyor
            System.out.println("adi "+ k.name+" kayit zmani "+k.kayitZamani);

        }
    }

}
