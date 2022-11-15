package farkliKonulardaSoruCozumu2;

import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        /*

         Kullanıcıdan bir cümle alın.
        Kullanıcıdan gelen cümleyi parametre olarak kabul edin,
        Array kullanarak cümleyi ters çevirin ve sonucu ana method'a cümle olarak döndüren bir method yazın.
        * Not: Büyük ve küçük harfler, boşluklar ve özel karakterler değiştirilmeyecektir.
        * * Giriş : * Kod yazmak çok güzel.
        * * Çıktı : * .edoc etirw ot ecin yrev si tI
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle =scan.nextLine();

    stringiTersCevirme(cumle);

    }
    public static void stringiTersCevirme(String cumle) {

        String [] arr = new String[cumle.length()];

        String tersStr= "";

        for (int i = cumle.length()-1; i >=0 ; i--) {
            tersStr += cumle.charAt(i);
        }

        for (int i = 0; i <tersStr.length() ; i++) {

            arr[i]=tersStr;
            
        }
        String []yeni=new String[1];
        List<String>yeniList=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].equals(arr[i+1])){
                yeniList.add(arr[i]);
                break;

            }

        }

        for (int i = 0; i <yeniList.size() ; i++) {
            yeni[i]=yeniList.get(i);

        }

        System.out.println(Arrays.toString(yeni));

        }

    }
















