public class MukemmelSayiBulma {

    //Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
    //        //Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
    //        //herhangi bir sayı Mükemmel Sayı olarak bilinir.
    //        //Input :6
    //        //Output:6 Mukemmel Sayidir.
    //        //======================
    //        //Input7
    //        //Output:   7 Mukemmel Sayidir degildir.

    public static void main(String[] args) {


        int input=8128;
        int pozitifBolenToplam=0;


        for (int i = 1; i <input ; i++) {

            if(input%i==0){
                pozitifBolenToplam+=i;

        }

    }
        if(pozitifBolenToplam==input){
            System.out.println(input +" sayisi mükemmeldir");
        }else{
            System.out.println(input +" sayisi mükemmel degildir.");
        }
    }
}
