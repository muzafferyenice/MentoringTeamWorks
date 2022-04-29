package mHotel;

import java.io.Serializable;
import java.util.ArrayList;

public class TekKişilikOda implements Serializable {
    String Isim;
    String iletisim;
    String Cinsiyet;

    ArrayList<Yemek> yemek=new ArrayList<>();
    TekKişilikOda(){
        this.Isim="";
    }

    public TekKişilikOda(String isim, String iletisim, String cinsiyet) {
        Isim = isim;
        iletisim = iletisim;
        Cinsiyet = cinsiyet;
    }
}
