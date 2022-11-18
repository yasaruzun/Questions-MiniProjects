package farkliKonulardaSoruCozumu2;

import java.util.ArrayList;
import java.util.List;

public class Q27 {
    /*
     * 2 farklı array deki aynı isimleri console yazdıran bir java programı yazın.
     * (without case sensitivity)
     *
     * Input1 : {John,Brad,Ange,Sofia,Emily}
     *
     * Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */


    public static void main(String[] args) {

        String[] liste1 = {"hazel", "Brad", "ahmet", "yasar", "Emily" };
        String[] liste2 = {"sofia", "brad", "grace", "emily", "hazel" };

        List<String> list1Listesi = new ArrayList<>();
        List<String> liste2Listesi = new ArrayList<>();
        List<String> tekrarliListe = new ArrayList<>();

        for (int i = 0; i < liste1.length; i++) {
            list1Listesi.add(liste1[i]);
        }
        for (int i = 0; i < liste2.length; i++) {
            liste2Listesi.add(liste2[i]);

        }

        for (int i = 0; i <list1Listesi.size() ; i++) {
            for (int j = 0; j <liste2Listesi.size() ; j++) {

                if (list1Listesi.get(i).equalsIgnoreCase(liste2Listesi.get(j))){

                    tekrarliListe.add(list1Listesi.get(i));
                }

            }

        }
        System.out.println(tekrarliListe);
    }
}
