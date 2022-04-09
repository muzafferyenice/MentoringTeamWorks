package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_MethodsUsing{

    public static void main(String[] args) {

        Pattern p = Pattern.compile("[^a-z0-9() ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("I am a string");
        boolean b = m.find();

        if (b) {
            System.out.println("There is a special character in my string");
        }

        String myName = "domanokz";
        String newName = myName.substring(0,4)+'x'+myName.substring(5);
        System.out.println("newName = " + newName);

        StringBuilder myyName = new StringBuilder("domanokz");

        myyName.setCharAt(4, 'x');//sb de 4 index e x koyar

        System.out.println(myyName);
        String myyyName = "domanokz";

        String t ="*".repeat(myyyName.length());//strinde tum stringi * yapar
        System.out.println(t);



    }
}
