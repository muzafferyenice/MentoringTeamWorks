package myStorage;

public class Products {

    private int id;

    private String pName;

    private String pBrand;

    private String pCategory;

    private String pUnitQ;//gelen miktar

    private double pPurchase;

    private double psale;

    private String pShelf;//raf

    private int pQuantity;//miktar

    public Products(int id, String pName, String pBrand, String pCategory, String pUnitQ, double pPurchase, double psale, String pShelf, int pQuantity) {
        this.id = id;
        this.pName = pName;
        this.pBrand = pBrand;
        this.pCategory = pCategory;
        this.pUnitQ = pUnitQ;
        this.pPurchase = pPurchase;
        this.psale = psale;
        this.pShelf = pShelf;
        this.pQuantity = pQuantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                ", pBrand='" + pBrand + '\'' +
                ", pCategory='" + pCategory + '\'' +
                ", pUnitQ='" + pUnitQ + '\'' +
                ", pPurchase=" + pPurchase +
                ", psale=" + psale +
                ", pShelf='" + pShelf + '\'' +
                ", pQuantity=" + pQuantity +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpBrand() {
        return pBrand;
    }

    public void setpBrand(String pBrand) {
        this.pBrand = pBrand;
    }

    public String getpCategory() {
        return pCategory;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public String getpUnitQ() {
        return pUnitQ;
    }

    public void setpUnitQ(String pUnitQ) {
        this.pUnitQ = pUnitQ;
    }

    public double getpPurchase() {
        return pPurchase;
    }

    public void setpPurchase(double pPurchase) {
        this.pPurchase = pPurchase;
    }

    public double getPsale() {
        return psale;
    }

    public void setPsale(double psale) {
        this.psale = psale;
    }

    public String getpShelf() {
        return pShelf;
    }

    public void setpShelf(String pShelf) {
        this.pShelf = pShelf;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }
}
