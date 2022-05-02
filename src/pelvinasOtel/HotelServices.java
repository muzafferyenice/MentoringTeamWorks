package pelvinasOtel;


public class HotelServices implements M_Corleone{//tum otel hizmetleri fiyatlari


    private String havaalanıTransferi;
    private String araçKiralamaHizmetleri;//yusuf beyin acentesiyle
    private String kuruTemizlemeUtuhizmeti;
    private String ucretsizOtopark;
    private String aquaPark;
    private String spa;
    private String turGezi;

    public HotelServices(){

    }
    public HotelServices( String havaalanıTransferi, String araçKiralamaHizmetleri,
                         String kuruTemizlemeUtuhizmeti,
                         String ucretsizOtopark, String aquaPark, String spa, String turGezi) {

        this.havaalanıTransferi = havaalanıTransferi;
        this.araçKiralamaHizmetleri = araçKiralamaHizmetleri;
        this.kuruTemizlemeUtuhizmeti = kuruTemizlemeUtuhizmeti;
        this.ucretsizOtopark = ucretsizOtopark;
        this.aquaPark = aquaPark;
        this.spa = spa;
        this.turGezi = turGezi;
    }


    public String getHavaalanıTransferi() {
        return havaalanıTransferi;
    }

    public void setHavaalanıTransferi(String havaalanıTransferi) {
        this.havaalanıTransferi = havaalanıTransferi;
    }

    public String getAraçKiralamaHizmetleri() {
        return araçKiralamaHizmetleri;
    }

    public void setAraçKiralamaHizmetleri(String araçKiralamaHizmetleri) {
        this.araçKiralamaHizmetleri = araçKiralamaHizmetleri;
    }

    public String getKuruTemizlemeUtuhizmeti() {
        return kuruTemizlemeUtuhizmeti;
    }

    public void setKuruTemizlemeUtuhizmeti(String kuruTemizlemeUtuhizmeti) {
        this.kuruTemizlemeUtuhizmeti = kuruTemizlemeUtuhizmeti;
    }

    public String getUcretsizOtopark() {
        return ucretsizOtopark;
    }

    public void setUcretsizOtopark(String ucretsizOtopark) {
        this.ucretsizOtopark = ucretsizOtopark;
    }

    public String getAquaPark() {
        return aquaPark;
    }

    public void setAquaPark(String aquaPark) {
        this.aquaPark = aquaPark;
    }

    public String getSpa() {
        return spa;
    }

    public void setSpa(String spa) {
        this.spa = spa;
    }

    public String getTurGezi() {
        return turGezi;
    }

    public void setTurGezi(String turGezi) {
        this.turGezi = turGezi;
    }

    @Override
    public String toString() {
        return "HotelServices{" +
                ", havaalanıTransferi='" + havaalanıTransferi + '\'' +
                ", araçKiralamaHizmetleri='" + araçKiralamaHizmetleri + '\'' +
                ", kuruTemizlemeUtuhizmeti='" + kuruTemizlemeUtuhizmeti + '\'' +
                ", ucretsizOtopark='" + ucretsizOtopark + '\'' +
                ", aquaPark='" + aquaPark + '\'' +
                ", spa='" + spa + '\'' +
                ", turGezi='" + turGezi + '\'' +
                '}';
    }

    @Override
    public void yap() {

    }
}
