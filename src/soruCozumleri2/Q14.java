package soruCozumleri2;

public class Q14 {
    public static void main(String[] args) {
        //bir stringin basinda buyuk harf ve sonunda nokta olup olmadigini kont etmek icin kod yaz

        String str="ahmet";

        boolean basBuyukMu;
        boolean sonNoktaMı;



        if(str.charAt(0)>='A' && str.charAt(0)<='Z') {
            basBuyukMu=true;
            System.out.println("bas harfi büyük");

        }else{
            System.out.println("bas harfi büyük degil");
        }

        if(str.charAt(str.length()-1)=='.'){
            sonNoktaMı=true;
            System.out.println("sonunuda nokta vardıır");
        }else{
            System.out.println("ssoonunda nokta yok");
        }
    }
}
