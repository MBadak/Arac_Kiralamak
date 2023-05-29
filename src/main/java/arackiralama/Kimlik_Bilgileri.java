package arackiralama;

import java.util.Scanner;

public class Kimlik_Bilgileri {

    public static String Kimlik_olustur() {
        System.out.println("Isleme devam etmek icin Kimlik Bilgilerinizi olusturunuz.");

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen TC Kimlik NO giriniz.");
        String tcNo = input.next();

        if (11 != tcNo.length()) {
            System.out.println("Lutfen 11 haneli bir Kimlik No giriniz.");
            Kimlik_olustur();
        }

        System.out.println("Lutfen Adinizi Giriniz.");
        input.nextLine();
        String ad = input.nextLine().toUpperCase();
        System.out.println("Lutfen Soyadinizi Giriniz.");
        String soyad = input.next().toUpperCase();

        String isim = ad + " " + soyad;

        return isim;
    }


}
