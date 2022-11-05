import java.util.ArrayList;
import java.util.List;

public class ArraydeIstenenElemanVarMiVarsaKacAdet {


    public static void main(String[] args) {

    //Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
    //kullanildigini yazdiran bir method olusturun


    int[] arr = {2,4,4,6,6,8,10,6,8,10};

    List<Integer> sayilar =new ArrayList<>();

    for (int i = 0; i <arr.length ; i++) {
        sayilar.add(arr[i]);

    }

    int sayac=0;
    int istenenEleman=11;

    for (int i = 0; i <sayilar.size() ; i++) {

        if (sayilar.get(i)==istenenEleman){

            sayac++;
        }
    }

    if (sayac>0){
        System.out.println(istenenEleman+" sayisi array icinde  "+sayac+" defa kullanilmistir");
    }else{
        System.out.println("istenen elemanan array içinde kullanılmamıştır");
    }




}

}
