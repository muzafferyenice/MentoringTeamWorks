package maps;

import java.util.HashMap;

public class C01_Maps {
    public static void main(String[] args) {

        HashMap<Integer, String> urun = new HashMap<>();
        String str=" jfkhfk jfkldsjf";
        urun.put(1000, str);
      //  urun.put(1001, "Hekimoglu,Un,50kg");
      //  urun.put(1002, "Ari,un,50kg");

        System.out.println("urun = " + urun);

        HashMap< HashMap<Integer, String>,Integer> urun1 = new HashMap<>();
        urun1.put(urun,101);
        System.out.println("urun1 = " + urun1);


    }
}
