package myAdvancedProjects;

public class Araba {
    // POJO : planing old java object->modal class
    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Araba() {// p'siz cons.
    }

    public Araba(String model, String renk, int motor, int yil) {// p'li cons.
        this.model = model;
        this.renk = renk;
        //this.motor = motor;
        //this.yil = yil;
        setMotor(motor);//cons abc create etmek icin pmtre olarak
        //olarak gire motor datasi setmotor() methoduna parametre
        // olarak calisti degerini aldi
        setYil(yil);//encapsule etttik yil i koruduk

    }

    public Araba(int motor, int yil) {//p'li cons
        setMotor(motor);
        setYil(yil);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        // if model listin icinde varsa siparis ok else araba yok

        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        //renk listi olustur if ile calis

        this.renk = renk;
    }

    public int getMotor() {

        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("agam bizximle eglenir");
        this.motor=1200;
        }else
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<0){
            this.yil=(-1)*yil;
            System.out.println("agam nisledinngg ");
        }else
        this.yil = yil;
    }

    @Override
    public String toString() {//bu meyhod bu class'dan cerate edilen obj field'larını stringe çeviririr
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }

}

