package storage;

public class Urunler {

    private String urunIsmi;
    private String marka;
    private int miktar;//birimlerin toplami kullanicinin giridgi
    private int birim=0;//bize olan baslangic miktari
    private String rafSirasi;

    @Override
    public String toString() {
        return "Urunler{" +
                "urunIsmi='" + urunIsmi + '\'' +
                ", marka='" + marka + '\'' +
                ", miktar=" + miktar +
                ", birim=" + birim +
                ", rafSirasi='" + rafSirasi + '\'' +
                '}';
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }


    public int getBirim() {
        return birim;
    }

    public void setBirim(int birim) {
        this.birim = birim;
    }

    public String getRafSirasi() {
        return rafSirasi;
    }

    public void setRafSirasi(String rafSirasi) {
        this.rafSirasi = rafSirasi;
    }

    public Urunler(int id, String urunIsmi, String marka, int miktar, int birim, String rafSirasi) {
        this.urunIsmi = urunIsmi;
        this.marka = marka;
        this.miktar = miktar;
        this.birim = birim;
        this.rafSirasi = rafSirasi;
    }


}
