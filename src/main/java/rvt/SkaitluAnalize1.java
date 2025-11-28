package rvt;

import java.util.Scanner;

public class SkaitluAnalize1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        int count = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
        System.out.print("Ievadiet pozitivu skaitli (0 vai negativs skaitlis partrauc ievadi): ");
        int number = Integer.valueOf(scanner.nextLine());
        if (number <= 0) {
            break;
        }
        count += 1;
        sum += number;

        if (number > max) {
            max = number;
        }
        if (number < min) {
            min = number;
        }
    }
    if (count > 0) {
            average = sum / count;
        
    System.out.println();

    System.out.println("Ievadito skaitlu skaits: " + count);
    System.out.println("Skaitlu summa: " + sum);
    System.out.println("Videja vertiba: " + average);
    System.out.println("Lielakais skaitlis: " + max);
    System.out.println("Mazakais skaitlis: " + min);
    } else {
        System.out.println("Nebija ievadits neviens pozitivais skaitlis");
    }
    }
}
