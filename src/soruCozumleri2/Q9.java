package soruCozumleri2;

public class Q9 {

    public static void main(String[] args) {

        //Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        //olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        //sonuclarini donduren bir method olusturun.


        int sayi=34;
        System.out.println(asalSayiKontrol(25));

    }

    public static String asalSayiKontrol(int sayi){

        String sonuc="";
        for (int i = 2; i <=sayi-1 ; i++) {

            if(sayi%i==0){

                sonuc="asal degil";
                break;
            }

        }

        if(!sonuc.equals("asal degil")){
            sonuc="asaldir";
        }
        return sonuc;
    }
}
