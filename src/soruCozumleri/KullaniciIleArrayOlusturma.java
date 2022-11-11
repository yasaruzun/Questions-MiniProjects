package soruCozumleri;

import java.util.Arrays;
import java.util.Scanner;

public class KullaniciIleArrayOlusturma {

    public static void main(String[] args) {

        //Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.


        int[] sayi = kullaniciDanSayiAlipArrayeDondurme();

        System.out.println(Arrays.toString(sayi));


    }

    public static int[] kullaniciDanSayiAlipArrayeDondurme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen olusturmak istediginiz array'in boyutunu giriniz");

        int arrBoyutu = scan.nextInt();

        int[] arr = new int[arrBoyutu];

        int girilenElement = 0;

        for (int i = 0; i < arrBoyutu; i++) {
            System.out.println("lütfen array'e eklemek istediginiz elementi giriniz");

            girilenElement = scan.nextInt();

            arr[i] = girilenElement;


        }
        return arr;

    }
}
