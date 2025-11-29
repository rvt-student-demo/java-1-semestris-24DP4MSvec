package rvt;
import java.util.Scanner;
public class MainProgram_stat {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);
        int number;
        int evennum;
        int oddnum;
        System.out.println("Enter numbers: ");
        while(true){

            number = Integer.valueOf(scanner.nextLine());
            if (number != -1){
                statistics.addNumber(number);
                if(number % 2 == 0){
                    evennum = number;
                    statistics.addEvenNumber(evennum);
                }
                else{
                    oddnum = number;
                    statistics.addOddNumber(oddnum);
                }
            }
            else{
                break;
            
            }

        

        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics.evensum());
        System.out.println("Sum of odd numbers: " + statistics.oddsum()); 



    }
} 