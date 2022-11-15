package farkliKonulardaSoruCozumu2;

public class Q2 {

    public static void main(String[] args) {

        //Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.

        //Regex (Regular Expressions)
        //\\s : space
        // \\S : space olmayan hersey
        //\\s+ : yanyana birden fazla space
        //\\d : digits
        // \\D : digit olmayan hersey
        //\\w : harf veya rakam Veya _
        // \\W : harf veya rakam olmayan hersey

        String input="java1 ogRe2@nMek3 #ne +Gu=zel";

        input=input.replaceAll("\\d","");
        input=input.replaceAll(" ","9");
        input=input.replaceAll("\\W","");
        input=input.replaceAll("9"," ");
        input=input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase();

        System.out.println(input);




    }
}
