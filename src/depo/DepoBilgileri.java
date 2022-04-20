package depo;

public class DepoBilgileri implements Depo{

    String urunIsmi;
    String marka;
    int miktar;//birimlerin toplami kullanicinin giridgi
    String id;
    int birim=0;//bize olan baslangic miktari
    String rafSirasi;


   public DepoBilgileri(){
   }
    public DepoBilgileri(String id, String urunIsmi, String marka, int miktar, String raf) {
        this.id = id;
        this.urunIsmi=urunIsmi;
        this.marka = marka;
        this.birim = miktar;
        this.rafSirasi = raf;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public void urunEkleme() {

    }

    @Override
    public void urunCikisi() {

    }

    @Override
    public void urunuRafaKoy() {

    }

    @Override
    public void urunListele() {

    }

    @Override
    public String toString() {
        return "DepoBilgileri{" +
                "urunIsmi='" + urunIsmi + '\'' +
                ", marka='" + marka + '\'' +
                ", id='" + id + '\'' +
                ", birim=" + birim +
                ", rafSirasi='" + rafSirasi + '\'' +
                '}';
    }
}

