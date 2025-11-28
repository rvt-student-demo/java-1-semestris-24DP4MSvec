package rvt;

public class From_one_to_parameter1 {
    public static void main(String[] args) {
        Integer number;
        printUntlisNumber(5);
    }
    public static void printUntlisNumber(int number) {
        Integer i = 1;
        while (i <= number) {
            System.out.println(i);
            i += 1;
        }
    }
}
