package myStorage;


public class Wholesaler {

    //bu class saticinin yetkinlik ve guvenlik icin olusturuldu yani ne satabilir  bize
    private int wId;

    private String wUsername;

    private String wPassword;

    private String wCompetence;//yetkinligi ne verebilir
   // Map1<Integer,String>saler=new HashMap<>();
   // Map<Integer, Map1<Integer, String>> product_Salers=new HashMap<>();

    @Override

    public String toString() {
        return "Wholesaler{" +
                "wId=" + wId +
                ", wUsername='" + wUsername + '\'' +
                ", wPassword='" + wPassword + '\'' +
                ", wCompetence='" + wCompetence + '\'' +
                '}';
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public String getwUsername() {
        return wUsername;
    }

    public void setwUsername(String wUsername) {
        this.wUsername = wUsername;
    }

    public String getwPassword() {
        return wPassword;
    }

    public void setwPassword(String wPassword) {
        this.wPassword = wPassword;
    }

    public String getwCompetence() {
        return wCompetence;
    }

    public void setwCompetence(String wCompetence) {
        this.wCompetence = wCompetence;
    }
}
