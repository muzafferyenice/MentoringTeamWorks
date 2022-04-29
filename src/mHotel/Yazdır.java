package mHotel;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Yazdır implements Yaz {
    Revervasyon otel1;
    public Yazdır(Revervasyon otel1)
    {
        this.otel1=otel1;
    }

    @Override
    public void Yazdır() {
        try{
            FileOutputStream fout=new FileOutputStream("backup");
            ObjectOutputStream oos=new ObjectOutputStream(fout);
            oos.writeObject(otel1);
            //ObjectOutputStream oos=new ObjectOutputStream(fout);
            // oos.writeObject(otel_ob);
        }
        catch(Exception e)
        {
            System.out.println("Yazdırma Hatası "+e);
        }



    }
}
