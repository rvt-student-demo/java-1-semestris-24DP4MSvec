package rvt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JMArreyList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        
        onlyTheseNumbers();
        listSize();
        onTheList();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        System.out.println(strings);
        removeLast(strings);
        removeLast(strings);
        System.out.println(strings);
        


    }
    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);

        int[] list = {72, 2, 8, 11, -1};
        System.out.println(Arrays.toString(list));
        System.out.print("From where? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("To where?: ");
        int second = Integer.valueOf(scanner.nextLine());
        for(int i = first; i <= second; i++){
            System.out.println(list[i]);
        }
    }
    public static void listSize() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        
        
        while (true){

            

            System.out.print("Ievadi vardu(ievadi exit to leave): ");
            String name = scanner.nextLine();
            
            if ("exit".equals(name.toLowerCase())){ 
            break;
            }
            
            list.add(name);
           
            }

            System.out.print("In total: ");
            System.out.println(list.size());
            
        }
    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        
        while (true){

            System.out.print("Ievadi vardu(ievadi SPACE to leave): ");
            String name = scanner.nextLine();
            
            if (" ".equals(name)){ 
            break;
            }
            
            list.add(name);
           
            }

            System.out.print("Search for? ");
            String guess = scanner.nextLine();

            if (list.contains(guess)){
                System.out.print(guess);
                System.out.println(" was found!");
            }
            else{
                System.out.print(guess);
                System.out.println(" was not found!");
            }

        }
    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty()) {
                return;
        }
        int lastIndex = strings.size() - 1;
        strings.remove(lastIndex);
    }
    }