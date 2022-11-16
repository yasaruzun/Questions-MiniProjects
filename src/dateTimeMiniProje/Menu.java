package dateTimeMiniProje;

import java.util.Scanner;

public class Menu {
    static BRegistration registration = new BRegistration();
    static CListing listing=new CListing();

    static void giris() {
        System.out.println("Yapmak istediğiniz işlemi seçiniz\n" +
                "1. İsim girişi\n" +
                "2. Şanslı isimleri listeleme\n" +
                "3. Çıkış\n" +
                "Seçiminiz:");

        Scanner scan = new Scanner(System.in);

        while (true) {
            if (scan.hasNextInt()) {
                int secim = scan.nextInt();
                switch (secim) {
                    case 1: {
                        registration.register();
                        giris();
                    }
                    case 2: {
                        listing.listele(registration.usersList);
                        giris();
                    }
                    case 3: {
                        System.out.println("Güle Güle");
                        System.exit(0);
                    }
                    default: {
                        System.out.println("Geçerli değer giriniz.");
                        giris();
                    }
                }
            } else {
                System.out.println("Geçerli değer giriniz");
                giris();
            }
        }
    }
}
