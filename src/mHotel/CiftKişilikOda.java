package mHotel;

import java.io.Serializable;

public class CiftKişilikOda extends TekKişilikOda implements Serializable {
    String Isim2;
    String iletisim2;
    String Cinsiyet2;

    CiftKişilikOda(){
        this.Isim="";
        this.Isim2="";
    }

    public CiftKişilikOda(String isim, String iletisim, String cinsiyet, String isim2, String iletisim2, String cinsiyet2) {
        super(isim, iletisim, cinsiyet);
        Isim2 = isim2;
        iletisim2 = iletisim2;
        Cinsiyet2 = cinsiyet2;
    }

}
