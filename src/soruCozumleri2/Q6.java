package soruCozumleri2;

import java.util.ArrayList;
import java.util.List;

public class Q6 {

    /*
     * Write a program that deletes the letters 'a' from the names in the list given
     * as input.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     *
     * OUTPUT :
     *
     * [Veli,Omer]
     */

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("ali");
        isimler.add("veli");
        isimler.add("ayse");
        isimler.add("fatma");
        isimler.add("omer");

        String istenmeyenHarf = "f";

        List<String> yeniList = new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {

            if (!isimler.get(i).contains(istenmeyenHarf)) {

                yeniList.add(isimler.get(i));
            }


        }

        isimler = yeniList;

        System.out.println(isimler);
    }
}