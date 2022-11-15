package farkliKonulardaSoruCozumu1;

import java.util.ArrayList;
import java.util.List;

public class FiyatToplamlari {

    //String bir listede verilen tüm fiyatların toplamını bulunuz.
    //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04


    public static void main(String[] args) {


        List<String> fiyatlar=new ArrayList<>();



               fiyatlar.add("$12.99");
               fiyatlar.add("$23.60");
               fiyatlar.add("$54.45");


        double toplam =0;

        for (String fiyat:fiyatlar
        ) {
            fiyat=fiyat.replace("$","");
            toplam +=Double.parseDouble(fiyat);

        }
        System.out.println(toplam);



            
        }

    }

