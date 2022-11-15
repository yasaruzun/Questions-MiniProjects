package farkliKonulardaSoruCozumu2;

public class Q4 {
    public static void main(String[] args) {

        //Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin.


        String isim="yasar";
        String soyIsim="uzunsadasdada";

        if(isim.length()>soyIsim.length()){

            isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
            soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase();
            System.out.println(isim+" "+soyIsim);

        }else{
            isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
            soyIsim=soyIsim.substring(0).toUpperCase();
            System.out.println(isim+" "+soyIsim);

        }







    }
}
