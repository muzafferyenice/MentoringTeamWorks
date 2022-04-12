package advancedPrejects2;

import java.util.Scanner;

public class PermutasyonKombi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" birinci n degeri giriniz");
        long n = scan.nextLong();
        System.out.println(" ikinci r degeri giriniz");
        long r = scan.nextLong();

        if (kombinasyon(n, r) == 0 && permutasyon(n, r) == 0) {
            System.out.println("Seçim sayısı(n) eleman sayısına(r) " +
                    "eşit veya eleman sayısından(r) büyük olmalidir. (n>=r)");
        } else {
            System.out.println("kombinasyon() = " + kombinasyon(n, r));
            System.out.println("permutasyon(n,r) = " + permutasyon(n, r));
            System.out.println("faktoriyel(n) = " + faktoriyel(n));
            System.out.println("faktoriyel(r) = " + faktoriyel(r));
        }
    }

    private static long faktoriyel(long n) {
        if (n != 0)  // termination condition
            return n * faktoriyel(n - 1); // recursive call
        else
            return 1;
    }

    private static long permutasyon(long n, long r) {
        if (n > 0 && r > 0 && n >= r) {
            return (faktoriyel(n) / faktoriyel(n - r));
        } else if (n == 0 && r == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    private static long kombinasyon(long n, long r) {
        if (n > 0 && r > 0 && n >= r) {
            return (faktoriyel(n) / (faktoriyel(n - r) * faktoriyel(r)));
        } else if (n == 0 && r == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
