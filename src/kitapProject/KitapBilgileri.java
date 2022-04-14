package kitapProject;


import static kitapProject.KitapIslemleri.count;

public class KitapBilgileri {

    public int kitapNo;
    public String kitapAdi;
    public String yazarAdi;
    public int kitapFiyat;

public KitapBilgileri(){//p siz cons olusturuldu
}

    public KitapBilgileri(int kitapNo, String kitapAdi, String yazarAdi, int kitapFiyat) {
        kitapNo=count;

        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyat = kitapFiyat;
    }
}
