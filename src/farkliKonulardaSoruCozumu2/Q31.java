package farkliKonulardaSoruCozumu2;

import java.util.Scanner;

public class Q31 {

    /*
     * Create a function that takes an array and returns the difference between and
     * the smallest numbers. Ask user to enter array elements.
     *
     * kullanıcının girdigi bir array'in en buyuk elemani ile en kucuk elemanının
     * farkını bulan bir method create ediniz.
     */
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("lütfen array uzunlugunuz giriniz");
        int arrUzunlugu= scan.nextInt();

        int [] arr= new int[arrUzunlugu];

        arraydekiEnBuyukEnKucukFarki(arr);



    }

    public static void arraydekiEnBuyukEnKucukFarki(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("lütfen array içine eklemek istediginiz bir tamsayi giriniz");
            int girilenEleman=scan.nextInt();

            arr[i]=girilenEleman;

        }

        int minEleman=arr[0];
        int maxEleman=arr[0];

        for (int i = 1; i <arr.length ; i++) {

            if(arr[i]>maxEleman){
                maxEleman=arr[i];
            }
            if(minEleman>arr[i]){
                minEleman=arr[i];
            }
        }

        System.out.println(maxEleman-minEleman);
    }
}
