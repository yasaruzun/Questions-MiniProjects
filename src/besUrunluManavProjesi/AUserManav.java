package besUrunluManavProjesi;

import java.util.Scanner;

public class AUserManav {

     static int toplamKilo=0;
     static  int toplamFiyat;
     static  int secim=1;
     static  int kilo=0;
     static int birFkg=10;
     static int ikiFkg=10;
     static int ucFkg=10;
     static  int dortFkg=10;
     static  int besFkg=10;
     static   int genelToplam=0;


     public AUserManav() {
     }

     public AUserManav(int toplamKilo, int toplamFiyat, int secim, int kilo, int birFkg, int ikiFkg, int ucFkg, int dortFkg, int besFkg, int genelToplam) {
          AUserManav.toplamKilo = toplamKilo;
          AUserManav.toplamFiyat = toplamFiyat;
          AUserManav.secim = secim;
          AUserManav.kilo = kilo;
          AUserManav.birFkg = birFkg;
          AUserManav.ikiFkg = ikiFkg;
          AUserManav.ucFkg = ucFkg;
          AUserManav.dortFkg = dortFkg;
          AUserManav.besFkg = besFkg;
          AUserManav.genelToplam = genelToplam;


     }
}
