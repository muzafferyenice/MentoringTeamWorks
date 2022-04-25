package storage_project;

import static storage_project.Actions.scan;

public class TryCatch {
    public static int intGirisi() {
        int giris = 0;
        boolean flag = true;
        boolean flag2 = false;
        do {
            giris = 0;
            try {
                if (flag2) {        // Dummy1 çalışmadan exception verdigi için sürekli satır atlıyordu. bu yüzden ilk seferde çalışmayan sonrasında çalışan bir dummy yaptım.
                   scan.nextLine();     //dummy 2
                }
                flag2 = true;
                giris = scan.nextInt();
                scan.nextLine();        //Dummy1

                flag = false;
                flag2 = false;
            } catch (Exception e) {
                System.out.println("lütfen geçerli bir giris yapınız");
            }

        } while (flag);

        return giris;
    }
}
