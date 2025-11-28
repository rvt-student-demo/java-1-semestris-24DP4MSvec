package rvt;

import java.util.Scanner;
public class Chapter19 {
    public static void main(String[] args) {
        ex2();
    }
    public static void ex1() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Start: ");
    int number = Integer.valueOf(scanner.nextLine());
    System.out.println(); 
    System.out.println("Enter End: ");
    int end = Integer.valueOf(scanner.nextLine());
    System.out.println();

    while (true) {
        System.out.println(number);
        if (number < end) {
            number += 1;
        } else {
            break;
        }

    }  
        }

    public static void ex2() {
    Scanner scanner = new Scanner(System.in);
     System.out.println("Enter N: ");
     int N = Integer.valueOf(scanner.nextLine());
     System.out.println();
     int loopsum = 0;
     int formulasum = 0;
     int number = 1;
     while (true) {
        loopsum += number;
        if (number < N) {
            number += 1;
        } else {
            break;
        }
     }
    formulasum = (N*(N+1)/2);
     System.out.println("Loop Sum = " + loopsum);
     System.out.println("Fomula Sum = " + formulasum);   
    }

    public static void ex3() {
    Scanner scanner = new Scanner(System.in);
     System.out.println("Enter N: ");
     int n = Integer.valueOf(scanner.nextLine());
     System.out.println();
     int loopsum = 0;
     int formulasum = 0;
     int number = 1;
     while (true) {
        loopsum += number * number;
        if (number < n) {
            number += 1;
        } else {
            break;
        }
     }
    formulasum = (n*(n+1)*(2*n+1)/6);
     System.out.println("Loop Sum = " + loopsum);
     System.out.println("Fomula Sum = " + formulasum);  
    }
}