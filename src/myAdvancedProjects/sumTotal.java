package myAdvancedProjects;

import java.util.Arrays;

public class sumTotal {

        /*
            Create String 2D array
    ​
            {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
    ​
            if the String has $ multiply by 3.2
    ​
            if the String has € multiply by 4.2
    ​
            return the double
    ​
         */
    /*
        String 2D array oluştur
​
       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
​
       String de $ varsa 3.2 ile çarp
​
       String de € varsa 4.2 ile çarp
​
       double return et
​
    */
    public static void main(String[] args) {

//       Koda burdan başlayın

        String[][] nums = {{"$12", "$22", "$5"}, {"€9", "€40", "$1", "$2"}, {"€12"}};

        double dolarToplam=0;
        double euroToplam=0;
        for (String []each:nums
        ) {
            for (String each1: each
            ) {
                if(each1.contains("$")){

                    //dolarToplam+=Double.valueOf(each1.replace("$",""));
                    dolarToplam+=Double.parseDouble(each1.replace("$",""));

                }else {
                    euroToplam+=Double.valueOf(each1.replace("€",""));

                }


            }

        }
        System.out.println("Dolar toplam "+dolarToplam*3.2);
        System.out.println("Euro toplam "+euroToplam*4.2);
    }
}
