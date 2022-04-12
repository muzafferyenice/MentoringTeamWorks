package com.company;

import javax.swing.*;

public class JOption_Trying{
    public static void main(String[] args) {


        String secenekler[] = {"evet", "hayir", "kararsiz"};
        String mesaj = "kahve icer misin?";
        int secim = JOptionPane.showOptionDialog(null, mesaj, "Siparis", JOptionPane.YES_NO_CANCEL_OPTION,
                3, null, secenekler, null);




    }
}