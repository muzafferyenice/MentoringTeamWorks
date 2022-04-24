package storage_project;

public class Product implements GodFather{
    private int id;
    private String urunIsmi;
    private String marka;
    private String birim;// bizde olan
    private int miktar;// kullanicinin girdigi
    private String raf;


    public Product(){

    }

    public Product( String urunIsmi, String marka, int miktar,String birim, String raf) {
        this.urunIsmi=urunIsmi;
        this.marka=marka;
        this.birim=birim;
        this.miktar=miktar;
        this.raf=raf;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBirim() {
        return birim;
    }

    @Override
    public String toString() {
        return "urunIsmi='" + urunIsmi + '\'' +
                ", marka='" + marka + '\'' +
                ", birim='" + birim + '\'' +
                ", miktar=" + miktar +
                ", raf='" + raf + '\''
                ;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    @Override
    public void alisFiyat(int a, int b) {
        System.out.println("eklemek istediginiz urunun toplam fiyatı : "+a*b);
    }

    @Override
    public void satisFiyat(double x, double y) {

        System.out.println("almak istediginiz urunun toplam fiyatı : "+x*y);

    }
}
