package farkliKonulardaSoruCozumu2;

public class Q24 {
    /*
          Check if the integer is an Armstrong numbers
           Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir

             153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
             370 = 3*3*3 + 7*7*7 + 0*0*0 = 370


     */
    public static void main(String[] args) {

        int sayi=153;

        int birlerBasamagi= sayi%10;
        sayi=sayi/10;

        int onlarBasamagi=sayi%10;
        sayi/=10;

        int yuzlerBasamagi=sayi%10;


        sayi=(sayi*100)+(onlarBasamagi*10)+(birlerBasamagi);

        int kontrol=(birlerBasamagi*birlerBasamagi*birlerBasamagi)+
                (onlarBasamagi*onlarBasamagi*onlarBasamagi)+
                (yuzlerBasamagi*yuzlerBasamagi*yuzlerBasamagi);

        if(sayi!=kontrol){
            System.out.println("sayi ArmStrong degildir");
        }else{
            System.out.println("bu sayi armstrongudr");
        }

    }


}
