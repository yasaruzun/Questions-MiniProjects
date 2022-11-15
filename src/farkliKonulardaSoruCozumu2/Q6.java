package farkliKonulardaSoruCozumu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q6 {

    /*
     * Write a program that deletes the letters 'a' from the names in the list given
     * as input.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     *
     * OUTPUT :
     *
     * [Veli,Omer]
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        List<String> isimler=new ArrayList<>();

        String isim;

        do{
            System.out.println("lütfen bir isim ekleyiniz" +
                    "\nsonlandirmak için 0'a basiniz.");
            isim=scan.nextLine();
            isimler.add(isim);
            isimler.remove("0");


        }while(!isim.equals("0"));{


        }

        System.out.println("lütfen istemediğiniz bir harf giriniz");
        String istenmeyenHarf=scan.nextLine().toLowerCase();

        List<String> yeniIsimler=new ArrayList<>();

        for (int i = 0; i <isimler.size() ; i++) {

            if(!isimler.get(i).toLowerCase().contains(istenmeyenHarf.toLowerCase())){

                yeniIsimler.add(isimler.get(i));

            }

        }

        isimler=yeniIsimler;

        System.out.println(isimler);


    }

    }
