package farkliKonulardaSoruCozumu1;

public class CiftKatliArrayCiftSayilariToplama { public static void main(String[] args) {
    //Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
    //method olusturun.

    int[] [] arr={{4,3,1},{1,2},{5,6,7},{3,6,8}};


    ikiKatliArrayCiftSayilarTopla(arr);

}

    public static void ikiKatliArrayCiftSayilarTopla(int[][] arr){

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if(arr[i][j]%2==0){

                    toplam+=arr[i][j];

                }

            }

        }


        System.out.println(toplam);


    }
}
