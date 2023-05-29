package arackiralama;

import java.util.Scanner;

public class Methodlar {
    static Scanner input = new Scanner(System.in);


    public static void giris() {
        System.out.println("""            
                   ******  Grup 3 Arac Kiralama     ******
                               HOSGELDINIZ
                        
          Lütfen arac seciniz...
          1- Markaya Göre
          2- Fiyata Göre
          3- CikiS
                """);

        int secim = input.nextInt();

        switch (secim) {
            case 1:  markayaGöre();          break;
            case 2:  fiyatGöre();            break;
            case 3:  cikis();                break;
            default: giris();
        }

    }



    public static void cikis() {
        System.out.println("Bizi tercih ettiginiz icin tesekkür ederiz. " +
                "\nHayirli yolculuklar... ");
    }

    private static void fiyatGöre() {
        System.out.println("""
    Lütfen Kiralamak istediginiz arac icin FIYAT ARALIGI seciniz
    1- 250
    2- 500
    3- 750
    4- 1000
    5- Geri dön
    6- Cikis 
    """);

        int secim = input.nextInt();
        fiyatlar(secim);
    }

    private static void fiyatlar(int secim) {
        switch (secim) {
            case 1:                Depo.depo("250");                break;
            case 2:                Depo.depo("500");                break;
            case 3:                Depo.depo("750");                break;
            case 4:                Depo.depo("1000");                break;
            case 5:                giris();                break;
            case 6:                cikis();                break;
            default:
                System.out.println("Yanlis tusladiniz.Lutfen Tekrar");
                fiyatGöre();
                break;

        }
    }


    public static void markayaGöre() {
        System.out.println("""                        
        Kiralmak istediginiz MARKA'yi seciniz
        1- Mercedes
        2- BMW
        3- VW
        4- AUDI
        5- Ford"
        6- Opel
        7-Geri dön
        8- Cikis
        """);

        int secim = input.nextInt();
        markalar(secim);
    }


    static void markalar(int secim) {
        Depo a = new Depo();
        switch (secim) {
            case 1:    Depo.depo("Mercedes");    break;
            case 2:    Depo.depo("BMW");         break;
            case 3:    Depo.depo("VW");          break;
            case 4:    Depo.depo("Audi");        break;
            case 5:    Depo.depo("Ford");        break;
            case 6:    Depo.depo("Opel");        break;
            case 7:    giris();                     break;
            case 8:    cikis();                     break;
            default:
                System.out.println("Yanlis tusladiniz.Lutfen Tekrar");
                markayaGöre();
                break;
        }
    }




    public static int toplam_Tutar_Hesapla(int gunlukFiyat, int gunSayisi) {

        return gunlukFiyat*gunSayisi;
    }

    public static void hitap(String ad_Soyad,int gunluk_Fiyat, int gun_Sayisi, int tutar) {
        System.out.println("Sayin " + ad_Soyad + " sectiginiz arac icin" +
                " gülük " + gunluk_Fiyat + "TL'den " + gun_Sayisi + " günlük toplam tutar " + tutar + "TL' dir. islemi tamamlamak icin ...");


    }



}
