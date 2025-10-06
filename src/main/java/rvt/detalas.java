package rvt;

import java.util.Scanner;
public class detalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int skruves_cena = 5;
        final int uzgriezni_cena = 3;
        final int papklasni_cena = 1;

        System.out.println("Ievadi skruvju skaitu: ");
        int skruvji = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi uzgrieznu skaitu: ");
        int uzgrieznu = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi paplaksnu skaitu: ");
        int paplaksnu = Integer.valueOf(scanner.nextLine());

        int kopa = skruves_cena * skruvji + uzgriezni_cena * uzgrieznu + papklasni_cena* paplaksnu;

        System.out.println("Skruvju skaits: " + skruvji);
        System.out.println("Uzgrieznu skaits: " + uzgrieznu);
        System.out.println("Paplaksnu skaits: " + paplaksnu);
        System.out.println();
            

        if (uzgrieznu < skruvji) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
        }
         if (paplaksnu < 2 * skruvji) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
         }
         else if (uzgrieznu >= skruvji && paplaksnu >= 2 * skruvji) {
            System.out.println("Pasutijums ir kartiba");
         }
         System.out.println();
         System.out.println("Kopeja cena: " + kopa);
    }
}
