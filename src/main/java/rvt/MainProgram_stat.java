package rvt;
import java.util.Scanner;

public class MainProgram_stat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
      
        int number;

        System.out.println("Enter numbers: ");
        while (true) {
            
            number = Integer.valueOf(scanner.nextLine());
            
           if (number == -1){
            break;
           } 
           statistics.addNumber(number);
        }
        System.out.println("Sum: " + statistics.sum());
    }
}
