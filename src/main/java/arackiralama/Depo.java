package arackiralama;

import java.util.ArrayList;

public class Depo {

    public static void depo(String a) {

        ArrayList<String> sira = new ArrayList<>();
        ArrayList<String> marka = new ArrayList<>();
        ArrayList<String> modelTipi = new ArrayList<>();
        ArrayList<String> modelYili = new ArrayList<>();
        ArrayList<String> vites = new ArrayList<>();
        ArrayList<String> fiyat = new ArrayList<>();
        ArrayList<String> yakit = new ArrayList<>();

        sira.add("1");
        sira.add("2");
        sira.add("3");
        sira.add("4");
        sira.add("5");
        sira.add("6");
        sira.add("7");
        sira.add("8");
        sira.add("9");

        marka.add("Mercedes");
        marka.add("BMW");
        marka.add("Ford");
        marka.add("Opel");
        marka.add("Audi");
        marka.add("BMW");
        marka.add("Ford");
        marka.add("Opel");
        marka.add("VW");


        modelTipi.add("C200");
        modelTipi.add("520");
        modelTipi.add("Focus");
        modelTipi.add("Vectra");
        modelTipi.add("A8");
        modelTipi.add("520");
        modelTipi.add("Focus");
        modelTipi.add("Astra");
        modelTipi.add("Tiguan");

        yakit.add("Dizel");
        yakit.add("Dizel");
        yakit.add("Benzin");
        yakit.add("Gaz");
        yakit.add("Dizel");
        yakit.add("Dizel");
        yakit.add("Benzin");
        yakit.add("Benzin");
        yakit.add("Dizel");

        vites.add("Otomatik");
        vites.add("Otomatik");
        vites.add("Manuel");
        vites.add("Manuel");
        vites.add("Otomatik");
        vites.add("Otomatik");
        vites.add("Manuel");
        vites.add("Manuel");
        vites.add("Otomatik");

        fiyat.add("1000");
        fiyat.add("750");
        fiyat.add("500");
        fiyat.add("750");
        fiyat.add("750");
        fiyat.add("1000");
        fiyat.add("500");
        fiyat.add("250");
        fiyat.add("1000");

        modelYili.add("2022");
        modelYili.add("2021");
        modelYili.add("2020");
        modelYili.add("2018");
        modelYili.add("2020");
        modelYili.add("2022");
        modelYili.add("2020");
        modelYili.add("2019");
        modelYili.add("2023");


        System.out.println("SIRA " + ("MARKA" + "                ").substring(0, 12) +
                ("MODEL" + "                 ").substring(0, 12) +
                ("YIL" + "               ").substring(0, 10) +
                ("VITES" + "                 ").substring(0, 12) +
                ("YAKIT" + "               ").substring(0, 12) +
                "FIYAT");
        for (int i = 0; i < sira.size(); i++) {
            if (sira.get(i).equals(a) || (fiyat.get(i).equals(a)) || marka.get(i).equals(a)) {

                System.out.println((sira.get(i) + " -  ") + (marka.get(i) + "                  ").substring(0, 12) +
                        (modelTipi.get(i) + "              ").substring(0, 12) +
                        (modelYili.get(i) + "               ").substring(0, 10) +
                        (vites.get(i) + "                 ").substring(0, 12) +
                        (yakit.get(i) + "               ").substring(0, 12) +
                        fiyat.get(i));

            }
        }
    }

    public  static int gunluk_fiyat(String  a) {

        ArrayList<String> sira = new ArrayList<>();
        sira.add("1");
        sira.add("2");
        sira.add("3");
        sira.add("4");
        sira.add("5");
        sira.add("6");
        sira.add("7");
        sira.add("8");
        sira.add("9");

        ArrayList<String> fiyat = new ArrayList<>();
        fiyat.add("1000");
        fiyat.add("750");
        fiyat.add("500");
        fiyat.add("750");
        fiyat.add("750");
        fiyat.add("1000");
        fiyat.add("500");
        fiyat.add("250");
        fiyat.add("1000");

        int gunluk_Fiyat = 0;

        for (int i = 0; i < sira.size(); i++) {
            if ((sira.get(i).equals(a))) {
                gunluk_Fiyat = Integer.parseInt((fiyat.get(i)));
            }
        }return gunluk_Fiyat;
    }

}
