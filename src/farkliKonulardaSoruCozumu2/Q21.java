package farkliKonulardaSoruCozumu2;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {

         /*
        Kullanicidan gunu ismini girmesini isteyin,
       girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bugün haftanin kacinci gunu?");
        int gun=scan.nextInt();
        if (gun>0 && gun<=5){
            if (gun==1){
                System.out.println("Bugün gunlerden pazartesi.Simdi calisma zamani "+ (5-gun)+"gun var.");
            } else if (gun==2) {
                System.out.println("Bugün gunlerden sali.Simdi calisma zamani "+ (5-gun)+"gun var.");
            }else if (gun==3) {
                System.out.println("Bugün gunlerden carsamba.Simdi calisma zamani " + (5 - gun) + "gun var.");
            }else if (gun==4) {
                System.out.println("Bugün gunlerden persembe.Simdi calisma zamani " + (5 - gun) + "gun var.");
            }else if (gun==5) {
                System.out.println("Bugün gunlerden cuma.Simdi calisma zamani " + (5 - gun) + "gun var.");
            }
        } else if (gun>5 && gun<=7 ) {
            if (gun==6){
                System.out.println("Bugün gunlerden cumartesi.Simdi dinlenme zamani");
            } else if (gun==7) {
                System.out.println("Bugün gunlerden pazar.Simdi dinlenme zamani");
            }
        }else {
            System.out.println("Gecersiz gun girisi");
        }
        // ***********************************2.cozum**********************************************
        System.out.println("Bugün haftanin kacinci gunu?");
        int haftaninGunu=scan.nextInt();
        switch (haftaninGunu){
            case 1 : System.out.println("Bugün gunlerden pazartesi.Simdi calisma zamani "+ (5-haftaninGunu)+"gun var.");
                break;
            case 2 : System.out.println("Bugün gunlerden sali.Simdi calisma zamani "+ (5-haftaninGunu)+"gun var.");
                break;
            case 3 : System.out.println("Bugün gunlerden carsamba.Simdi calisma zamani "+ (5-haftaninGunu)+"gun var.");
                break;
            case 4 : System.out.println("Bugün gunlerden persembe.Simdi calisma zamani "+ (5-haftaninGunu)+"gun var.");
                break;
            case 5 : System.out.println("Bugün gunlerden cuma.Simdi calisma zamani "+ (5-haftaninGunu)+"gun var.");
                break;
            case 6 : System.out.println("Bugün gunlerden cumartesi.Simdi dinlenme zamani");
                break;
            case 7 : System.out.println("Bugün gunlerden pazar.Simdi dinlenme zamani");
                break;
            default: System.out.println("Gecersiz gun girisi");
        }



    }

}
