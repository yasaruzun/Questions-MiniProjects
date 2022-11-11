package soruCozumleri;

import java.util.ArrayList;
import java.util.List;

public class EnuzunVeEnKisaKelimeYazdirma {

    public static void main(String[] args) {
        // Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.

        String[] arr = {"Ali", "Ulus", "Nesrin"};

        List<String> kelimeler = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            kelimeler.add(arr[i]);

        }
        System.out.println(kelimeler);//[Ali, Ulus, Nesrin]


        String enUzunKelime = kelimeler.get(0);
        String enKisaKelime = kelimeler.get(0);


        for (int i = 0; i < kelimeler.size(); i++) {

            if (kelimeler.get(i).length()>enUzunKelime.length()) {

                enUzunKelime=kelimeler.get(i);

            }else if(kelimeler.get(i).length()<enKisaKelime.length()){
                enKisaKelime=kelimeler.get(i);
            }

        }

        System.out.println("en uzun kelime : "+enUzunKelime+
                "\nen kısa kelime :"+enKisaKelime);

    }

}
