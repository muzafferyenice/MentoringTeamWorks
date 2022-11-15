package pelvinasOtel;

public class HotelRooms implements M_Corleone {//otel odalari
    private int odaNo;
    private String odaTercih;
    private String internet;
    private String lcd;
    private String kuvetBanyoJakuzi;
    private String manzara;
    private String yatakOlcut;
    private double gunlukUcret;
    private int sifreler;


    public int getOdaNo() {
        return odaNo;

    }

    public int setOdaNo(int odaNo) {

        odaNo++;
        if (odaNo == odaNo - 1) {
            System.out.println("oda dolu");
            //tekrar oda secimcagir
        }else this.odaNo = odaNo;
        return odaNo;
    }
    public int getSifreler() {
        return sifreler;
    }

    public void setSifreler(int sifreler) {
        this.sifreler = sifreler;
    }

    private String kalinacakSehir;
    private String girisTarihi;
    private String cikisTarihi;

    public HotelRooms(String odaTercih, String internet, String lcd, String kuvetBanyoJakuzi, String manzara,
                      String yatakOlcut, double gunlukUcret) {
        this.odaTercih = odaTercih;
        this.internet = internet;
        this.lcd = lcd;
        this.kuvetBanyoJakuzi = kuvetBanyoJakuzi;
        this.manzara = manzara;
        this.yatakOlcut = yatakOlcut;
        this.gunlukUcret = gunlukUcret;
    }

    public HotelRooms(String kalinacakSehir, String girisTarihi, String cikisTarihi) {
        this.kalinacakSehir = kalinacakSehir;
        this.girisTarihi = girisTarihi;
        this.cikisTarihi = cikisTarihi;
    }

    public HotelRooms() {

    }

    @Override
    public String toString() {
        return
                "odaTercih='" + odaTercih + '\'' +"\n"+
                ", internet='" + internet + '\'' +"\n"+
                ", lcd='" + lcd + '\'' +"\n"+
                ", kuvetBanyoJakuzi='" + kuvetBanyoJakuzi + '\'' +"\n"+
                ", manzara='" + manzara + '\'' +"\n"+
                ", yatakOlcut='" + yatakOlcut + '\'' +"\n"+
                ", gunlukUcret=" + gunlukUcret +
                '}';
    }

    public String getOdaTercih() {
        return odaTercih;
    }

    public void setOdaTercih(String odaTercih) {
        this.odaTercih = odaTercih;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getLcd() {
        return lcd;
    }

    public void setLcd(String lcd) {
        this.lcd = lcd;
    }

    public String getKuvetBanyoJakuzi() {
        return kuvetBanyoJakuzi;
    }

    public void setKuvetBanyoJakuzi(String kuvetBanyoJakuzi) {
        this.kuvetBanyoJakuzi = kuvetBanyoJakuzi;
    }

    public String getManzara() {
        return manzara;
    }

    public void setManzara(String manzara) {
        this.manzara = manzara;
    }

    public String getYatakOlcut() {
        return yatakOlcut;
    }

    public void setYatakOlcut(String yatakOlcut) {
        this.yatakOlcut = yatakOlcut;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    public String getKalinacakSehir() {
        return kalinacakSehir;
    }

    public void setKalinacakSehir(String kalinacakSehir) {
        this.kalinacakSehir = kalinacakSehir;
    }

    public String getGirisTarihi() {
        return girisTarihi;
    }

    public void setGirisTarihi(String girisTarihi) {
        this.girisTarihi = girisTarihi;
    }

    public String getCikisTarihi() {
        return cikisTarihi;
    }

    public void setCikisTarihi(String cikisTarihi) {
        this.cikisTarihi = cikisTarihi;
    }

    @Override
    public void yap() {

    }
}
