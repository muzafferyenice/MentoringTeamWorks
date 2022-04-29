package mHotel;

import java.io.Serializable;

public class Yemek implements Serializable {
    int no;
    int kisiSayisi;
    float fiyat;

    public Yemek(int no, int kisiSayisi) {
        this.no = no;
        this.kisiSayisi = kisiSayisi;
        switch (no){
            case 1: fiyat=kisiSayisi*50;
                break;
            case 2: fiyat=kisiSayisi*60;
                break;
            case 3: fiyat=kisiSayisi*70;
                break;
            case 4: fiyat=kisiSayisi*30;
                break;
        }
    }
}
