package okul_Proje;

import java.io.FileInputStream;

import java.io.IOException;


public class Runner extends Listeleme{

    public static void main(String[] args) {
        String dosyaYolu = "src/okul_Proje/yeniTask";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k =0;
            while((k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Bilgi_Class obj =new Bilgi_Class();

    }
}
