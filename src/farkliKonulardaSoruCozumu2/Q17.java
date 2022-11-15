package farkliKonulardaSoruCozumu2;

public class Q17 {

    /*
     * From a given array find all pairs whose sum is a given number
     * Verilen bir arraydeki, toplamı belirli bir sayı olan tüm çiftleri bulun
     *
     *  For example;
     *
     * input : {4, 6, 5, -10, 8, 5, 20} ==> 10
     * Output : 4 + 6 = 10, 5 + 5 = 10, -10+ 20 = 10
     *
     */


    public static void main(String[] args) {

        int [] input = {4, 6, 5, -10, 8, 5, 20};


        int istenenToplam=10;

        for (int i = 0; i <input.length-1 ; i++) {

            for (int j = i+1; j < input.length ; j++) {

                if(istenenToplam==input[i]+input[j]){
                    System.out.print(input[i]+"+"+input[j]+"="+istenenToplam+",");
                }

            }

        }

    }
}
