package rvt;
public class Statistics {
    private int count;
    private int sum;
    private int evensum;
    private int oddsum;

    public Statistics() {
        int numberCount = 0;

    }

    public void addNumber(int number) {
        count += 1;

        sum += number;
    }

    public int getCount() {
        return count;

    }

    public int sum() {
        return sum;

    }

    public double average() {
        return sum / (double) count;

    }
    public int evensum() {
        return evensum;

    }
    public int oddsum() {
        return oddsum;

    }
    public void addEvenNumber(int evennum) {
        evensum += evennum;
    }
    public void addOddNumber(int oddnum) {
        oddsum += oddnum;
    }
}