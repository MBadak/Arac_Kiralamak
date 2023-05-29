package arackiralama;

import java.util.Scanner;

public class Odeme {
    public static void öde(int tutar) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Odeme Metodunu seciniz.\n" +
                "1- o Kredi Karti \n2- o PayPal \n3- o Havale\n4- o Pesin\n5- o cikis");
        int odeme_metodu = input.nextInt();

        switch (odeme_metodu) {
            case 1:
                kK_ode(tutar);
                break;
            case 2:
                pP_ode(tutar);
                break;
            case 3:
                hvl_ode(tutar);
                break;
            case 4:
                pesin_ode(tutar);
                break;
            case 5:
                Methodlar.cikis();
                break;
            default:
                System.out.println("Yanlis secim yaptiniz \nLütfen konntrol ederek tekrar deneyiniz");
                öde(tutar);
        }
    }

    private static void pesin_ode(int tutar) {

        System.out.println(tutar + " TL 'lik ödemeniz basari ile gerceklesti. Makbuzunuz yazdiriliyor...");
    }

    private static void hvl_ode(int tutar) {
        Scanner input = new Scanner(System.in);
        String iban = "DE 1234567890123456";
        String bic = "FF6DLAA";
        System.out.println("Lutfen asagidaki hesaba ucreti havale ediniz\nIban : " + iban + "\nBic : " + bic + "\nLütfen Iban'i giriniz");
        String girilen_Iban = input.nextLine();
        System.out.println("Lutfen Bic'I giriniz");
        String girilen_Bic = input.next();
        System.out.println("Lutfen Toplam tutari giriniz");
        int top_tutar = input.nextInt();

        if (girilen_Bic.equals(bic) && girilen_Iban.equals(iban) && top_tutar == tutar) {
            System.out.println(tutar + " TL 'lik ödemeniz basari ile gerceklesti. Makbuzunuz yazdiriliyor...");
        } else {
            System.out.println("Lütfen islemi kontrol ederek tekrar giriniz");
            hvl_ode(tutar);
        }
    }

    private static void pP_ode(int tutar) {
        Scanner input = new Scanner(System.in);
        String pP_email = "3.teamarackiralama.@gmail.com";
        String odeme_Kodu = "5KLM33";
        System.out.println("Lutfen asagidaki PayPal hesabimiza ucreti gönderiniz\nPayPal hesabi : " + pP_email + "\nÖdeme kodu : " + odeme_Kodu + "\nLütfen PayPal hesabin'i giriniz");
        String girilen_email = input.nextLine();
        System.out.println("Lutfen Ödeme Kodu'nu giriniz");
        String girilen_Kod = input.next();
        System.out.println("Lutfen Toplam tutari giriniz");
        int top_tutar = input.nextInt();
        if (pP_email.equals(girilen_email) && odeme_Kodu.equals(girilen_Kod) && top_tutar == tutar) {
            System.out.println(tutar + " TL 'lik ödemeniz basari ile gerceklesti. Makbuzunuz yazdiriliyor...");
        } else {
            System.out.println("Lütfen islemi kontrol ederek tekrar giriniz");
            pP_ode(tutar);
        }

    }

    private static void kK_ode(int tutar) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kartinizin Pin kodunu giriniz.");
        int pin = input.nextInt();
        System.out.println(tutar + " TL 'lik ödemeniz basari ile gerceklesti. Makbuzunuz yazdiriliyor...");
    }
}
