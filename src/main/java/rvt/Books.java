package rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }
    System.out.println("\nWhat information will be printed?");
    String choice = scanner.nextLine();

    if (choice.equals("everything")) {
        for (int i = 0; i < books.size(); i++ ) {
            Book b = books.get(i);
            System.out.println(b);
        }
    }   
    else if (choice.equals("name")) {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            System.out.println(b.getTitle());

        }
    }

    }
    static class Book {
        private String title;
        private int pages;
        private int publicationYear;
    
        public Book(String title, int pages, int publicationYear){

        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
        }
    
        public String getTitle() {
            return this.title;
        }
    
        public String toString() {
            return this.title + ", " + this.pages + " pages, " + this.publicationYear;
         }
    }


}

