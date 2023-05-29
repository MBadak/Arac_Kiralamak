package arackiralama;

import java.util.Scanner;

public class AracKiralamRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        Methodlar.giris();

        System.out.println("Lütfen istediginiz Aracin SIRA Numara seciniz");
        String s = input.next();
        System.out.println("\nKiralamak istediginiz Arac :");
        Depo.depo(s);
        System.out.println();
        int gunluk_Fiyat = Depo.gunluk_fiyat(s);

        int gun_Sayisi = ZamanAraligi.kac_Gun();

// cuma grubu burada kaldik
        String ad_Soyad = Kimlik_Bilgileri.Kimlik_olustur();

        int tutar = Methodlar.toplam_Tutar_Hesapla(gunluk_Fiyat, gun_Sayisi);

        Methodlar.hitap(ad_Soyad,gunluk_Fiyat,gun_Sayisi,tutar);

        Odeme.öde(tutar);

        System.out.println("\n\nIsleminiz Basari ile tamamlandi.\n   " +
                "        **********************************         " +
                "   \n 3. TEAM ARAC KIRALAMA olarak kazasiz YOLCULUKLAR dileriz... ");


    }


}
