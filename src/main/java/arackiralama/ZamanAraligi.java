package arackiralama;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ZamanAraligi {

    public static int kac_Gun() {
        Scanner input = new Scanner(System.in);
        System.out.println("Araci alacaginiz Tarihi giriniz..");
        System.out.print("Yil      ".substring(0, 6) + ": ");
        int yil = input.nextInt();
        System.out.print("Ay      ".substring(0, 6) + ": ");
        int ay = input.nextInt();
        System.out.print("Gun      ".substring(0, 6) + ": ");
        int gun = input.nextInt();

        LocalDate alisDate = LocalDate.of(yil, ay, gun);

        System.out.println("Araci geri iade edeceginiz Tarihi giriniz..");
        System.out.print("Yil      ".substring(0, 6) + ": ");
        int iade_Yili = input.nextInt();
        System.out.print("Ay    ".substring(0, 6) + ": ");
        int iade_Ayi = input.nextInt();
        System.out.print("Gun      ".substring(0, 6) + ": ");
        int iade_Gunu = input.nextInt();

        LocalDate iade_Date = LocalDate.of(iade_Yili, iade_Ayi, iade_Gunu);


        if (alisDate.isBefore(LocalDate.now()) || iade_Date.isBefore(alisDate)) {
            System.out.println(alisDate + " Gecersiz Tarih");
            kac_Gun();
        }
        int gunFarki = (int) ChronoUnit.DAYS.between(alisDate, iade_Date);

        System.out.println("Kiralamak istediginiz gün sayisi : " + (gunFarki));


        return gunFarki;

    }
}
