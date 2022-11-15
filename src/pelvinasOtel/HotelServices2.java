package pelvinasOtel;

public class HotelServices2 implements GodFather {

    private String houseKeeping;
    private String degerliEsyaSaklamaKasası;
    private String yüzmeHavuzları;
    private String sauna;
    private String fitnessMerkezi;
    private String kuaför;

    public HotelServices2() {
    }
    public HotelServices2(String houseKeeping, String degerliEsyaSaklamaKasası,
                          String yüzmeHavuzları, String sauna, String fitnessMerkezi, String kuaför) {
        this.houseKeeping = houseKeeping;
        this.degerliEsyaSaklamaKasası = degerliEsyaSaklamaKasası;
        this.yüzmeHavuzları = yüzmeHavuzları;
        this.sauna = sauna;
        this.fitnessMerkezi = fitnessMerkezi;
        this.kuaför = kuaför;
    }

    public String getHouseKeeping() {
        return houseKeeping;
    }

    public void setHouseKeeping(String houseKeeping) {
        this.houseKeeping = houseKeeping;
    }

    public String getDegerliEsyaSaklamaKasası() {
        return degerliEsyaSaklamaKasası;
    }

    public void setDegerliEsyaSaklamaKasası(String degerliEsyaSaklamaKasası) {
        this.degerliEsyaSaklamaKasası = degerliEsyaSaklamaKasası;
    }

    public String getYüzmeHavuzları() {
        return yüzmeHavuzları;
    }

    public void setYüzmeHavuzları(String yüzmeHavuzları) {
        this.yüzmeHavuzları = yüzmeHavuzları;
    }

    public String getSauna() {
        return sauna;
    }

    public void setSauna(String sauna) {
        this.sauna = sauna;
    }

    public String getFitnessMerkezi() {
        return fitnessMerkezi;
    }

    public void setFitnessMerkezi(String fitnessMerkezi) {
        this.fitnessMerkezi = fitnessMerkezi;
    }

    public String getKuaför() {
        return kuaför;
    }

    public void setKuaför(String kuaför) {
        this.kuaför = kuaför;
    }

    @Override
    public String toString() {
        return "HotelServices2{" +
                "houseKeeping='" + houseKeeping + '\'' +
                ", degerliEsyaSaklamaKasası='" + degerliEsyaSaklamaKasası + '\'' +
                ", yüzmeHavuzları='" + yüzmeHavuzları + '\'' +
                ", sauna='" + sauna + '\'' +
                ", fitnessMerkezi='" + fitnessMerkezi + '\'' +
                ", kuaför='" + kuaför + '\'' +
                '}';
    }

    @Override
    public void hotelReception() {
        System.out.println("*****rezervasyon tamam PELVINAS otele hosgeldin*****");
    }

    @Override
    public void rooms() {

    }

    @Override
    public void extraHotelHizmetTalep() {

    }

    @Override
    public void otelHizmetleriLambda() {

    }

    @Override
    public void otelKayitIcinGerekliBelgeler() {

    }

    @Override
    public void oteleGirisIslemi() {

    }

    @Override
    public void otelHizmetleri() {

    }

    @Override
    public void otelExtraHizmetSorgula() {

    }

    @Override
    public void cikisIslemleri() {

    }

    @Override
    public void miniBar() {

    }

    @Override
    public void restouranHesap() {

    }

    @Override
    public void marketHesap() {

    }
}
