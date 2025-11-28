package rvt;

import java.util.Scanner;
public class delikatese1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi preci: "); 
        String prece = scanner.nextLine();

        System.out.println("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());

        System.out.println("Ekspress  piegade (0 - ne, 1 - ja)");
        int ekspress = Integer.valueOf(scanner.nextLine());
        double piegade = 0;
        if (cena < 10) {
            piegade = 2.00;
            if (ekspress == 1) {
                piegade += 3;
            }
        }
        else {
            piegade = 0;
            if (ekspress == 1) {
                piegade += 3;
            }
        }
        double kopa = cena + piegade;

        System.out.println("Rekins: ");
        System.out.println(prece + " " + cena);
        System.out.println("Piegade: " + piegade);
        System.out.println("Kopa: " + kopa);
    }
}
