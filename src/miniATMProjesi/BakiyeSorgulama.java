package miniATMProjesi;

public class BakiyeSorgulama {

    static Menu menu=new Menu();
    public static void bakiyeSorgula() {
        System.out.println("BAKIYENIZ: " + AUserATM.bakiye);

        Menu.menu();
    }
}
