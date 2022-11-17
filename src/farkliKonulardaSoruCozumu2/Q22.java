package farkliKonulardaSoruCozumu2;

public class Q22 {
    public static void main(String[] args) {
        /*
         * Write a method which accepts a String as parameter and prints the sum of the
         * digits, present in the given string.
         *
         * input : ade1r4d3
         *
         * output : 8
         *
         * Hint : Use Character.isDigit() Integer.valueOf()
         */

        String input="ade1r4d3";
        stringIciRakamlarToplami(input);

    }

    public static void stringIciRakamlarToplami (String input){
        int toplam=0;

        for (int i = 0; i <input.length() ; i++) {

            if(Character.isDigit(input.charAt(i))){
                toplam+= Integer.valueOf(input.substring(i,i+1));

            }

        }
        System.out.println(toplam);



    }
}
