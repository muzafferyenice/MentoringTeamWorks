package advancedPrejects2;

public class Sekil {

    double uzunKenar;
    double kisaKenar;
    double yariCap;

    public Sekil(double uzunKenar, double kisaKenar, double etkisiz) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Sekil(double yariCap) {
        this.yariCap = yariCap;
    }

    public Sekil(double uzunKenar, double kisaKenar) {
    }

    public double cevreHesaplama() {
        return (uzunKenar + kisaKenar) * 2;
    }

    public double alanHesaplama() {
        return uzunKenar * kisaKenar;
    }

    public double alanHesaplamaCember() {
        return yariCap * yariCap * 3.14;
    }
}
