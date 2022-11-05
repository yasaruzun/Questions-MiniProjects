import java.util.ArrayList;
import java.util.List;

public class ArraydekiPozitifTamsayilarinToplanmasi {
    public static void main(String[] args) {

    //Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
    //method yaziniz.

        int[] arr = {2, 4, 6, 8, 10};

        System.out.println(arraydakiPozitifTamTop(arr));

    }

    public static int arraydakiPozitifTamTop(int [] arr){

        int toplam=0;

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            sayilar.add(arr[i]);

        }


        for (int i = 0; i <sayilar.size() ; i++) {


            toplam+=sayilar.get(i);

        }



        return toplam;
    }
}


