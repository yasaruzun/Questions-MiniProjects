package farkliKonulardaSoruCozumu1;

public class CiftKatliArrayCarpimMethodu { public static void main(String[] args) {
    //Verilen 2 katli bir array’de bulunan tum sayilarin carpimini bize donduren bir
    //method olusturun

    int[][] arr = {{3,1,2,4},{1,1},{3,4,5},{10},{2,7}};


    System.out.println(ikiKatliArrayElementCarpimi(arr));


}

    public static int ikiKatliArrayElementCarpimi(int[][] arr) {


        int carpim=1;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                carpim*=arr[i][j];

            }

        }

        return carpim;
    }
}
