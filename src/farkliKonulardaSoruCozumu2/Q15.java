package farkliKonulardaSoruCozumu2;

public class Q15 {
    public static void main(String[] args) {
/*
Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
Input :
John White
1234234534561478
Output : Name :
J** W*
CCN  : ** ** ** 1478
* Ilk Harfler Buyuk harf ile baslamalidir.


 */
        String isim="john";
        String soyisim="white";
        String kkNo="1234234534561478";

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        kkNo=kkNo.substring(0,12).replaceAll("\\w","* ")+kkNo.substring(12);

        System.out.println(isim+soyisim);
        System.out.println(kkNo);


    }
}
