package besUrunluManavProjesi;

import java.util.Scanner;

public class KacKilo {

    public static void kacKilo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kac kilo almak istersneiz");
        AUserManav.kilo = scan.nextInt();

        AUserManav.toplamKilo += AUserManav.kilo;

    }
}
