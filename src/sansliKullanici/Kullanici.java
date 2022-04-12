package sansliKullanici;

import java.time.LocalDateTime;

public class Kullanici {

    String name;
    LocalDateTime kayitZamani;
     public Kullanici(){

     }

    public Kullanici(String name, LocalDateTime kayitZamani) {
        this.name = name;
        this.kayitZamani = kayitZamani;


    }
}
