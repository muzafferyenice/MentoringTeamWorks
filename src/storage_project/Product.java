package storage_project;

public class Product implements GodFather {//pojo class encapsule edildi
    int cikisMiktar;

    private String urunIsmi;
    private String marka;
    private int miktar;
    private String birim;
    private String raf;

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
        if(miktar>=cikisMiktar){
        this.miktar = miktar;
        }else{
            System.out.println("eyle bir mal yogtur bize");
        }
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    public Product() {

    }
    public Product(String urunIsmi, String marka, int miktar, String birim, String raf) {
        this.urunIsmi = urunIsmi;
        this.marka = marka;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "urunIsmi='" + urunIsmi + '\'' +
                ", marka='" + marka + '\'' +
                ", miktar='" + miktar + '\'' +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'';
    }

    @Override
    public void urunTanimlama() {

    }

    @Override
    public void urunListele() {

    }

    @Override
    public void urunGirisi() {

    }

    @Override
    public void urunuRafaKoy() {

    }

    @Override
    public void urunCikisi() {

    }
}
