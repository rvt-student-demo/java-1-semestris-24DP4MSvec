package rvt;

import java.util.Scanner;

public class Avarage_of_three_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        int summa = first + second;
        System.out.println("The sum of the numbers is " + summa);
    }   
}
