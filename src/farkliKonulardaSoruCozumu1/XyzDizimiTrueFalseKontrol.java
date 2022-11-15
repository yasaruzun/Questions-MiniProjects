package farkliKonulardaSoruCozumu1;

public class XyzDizimiTrueFalseKontrol {

    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */


        String input="ahmetxyz";

        boolean dogruMu=false;

        if(input.contains("xyz")){

            dogruMu=true;


        }

        System.out.println(dogruMu);

    }
}
