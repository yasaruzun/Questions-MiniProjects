package farkliKonulardaSoruCozumu2;

public class Q25 {
    /*
     * Count the words in a String one by one Girilen bir String'deki kelimeleri tek
     * tek saydiran java code create ediniz.
     *
     * For Example: Input : String is "Ali came to school and Ayse came to school"
     * Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
     */

    public static void main(String[] args) {


        String input="Ali came to school and Ayse came to school";

        String[] arr = input.split(" ");

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            sayac =0;
            //String str1 = arr[i];
            for (int j = 0; j < arr.length; j++) {

                //String str2 = arr[j];

                if(arr[i].equalsIgnoreCase(arr[j]) && i > j) { break;}

                if (arr[i].equalsIgnoreCase(arr[j])) {sayac++;}


            }
            if (sayac !=0) {
                System.out.println(arr[i] +" toplam " +sayac+ " kere geçiyor");
            }
        }

    }
}


