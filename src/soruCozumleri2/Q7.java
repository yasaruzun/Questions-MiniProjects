package soruCozumleri2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q7 {

    /*
     * Write a program that accepts an integer as input and prints first 10 prime
     * numbers greater than input Check numbers if they are even or not in a return
     * method.
     *
     * Input : 5
     *
     * Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
     */

    public static void main(String[] args) {

        int sayi,sayac;

        List<Integer> asalSayilar = new ArrayList<>();

        Scanner scan =new Scanner(System.in);

        System.out.println("Lütfen bir tam sayi giriniz");
        sayi= scan.nextInt();

        for (int i = sayi+1; i>0; i++) {

            sayac=0;
            for (int j = 2; j < i; j++) {

                if (i%j==0){
                    sayac=1;
                    break;
                }

            }
            if (sayac==0 ){
                asalSayilar.add(i);
            }
            if (asalSayilar.size()==10){
                break;
            }

        }
        System.out.println(asalSayilar);

    }




    }

