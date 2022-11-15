package farkliKonulardaSoruCozumu1;

public class PalindromKontrol {
    public static void main(String[] args) {
        ////bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        ////aynıysa, buna palindrom denir. Örneğin; "anna", "123321" palindromlardır.


        String str="annacık";
        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {

            tersStr+=str.charAt(i);


        }

        if(str.equalsIgnoreCase(tersStr)){

            System.out.println("girilen ifade  polindrom'dur");
        }else{
            System.out.println("girilen ifade polindrom degildir");
        }


    }
}
