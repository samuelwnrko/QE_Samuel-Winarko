package org.example.pack;

import org.example.pack.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    private ArrayList<Book> Books;

    public Books() {
        this.Books = new ArrayList<>();
    }

    public void setBooks() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter title: ");
        String judul = input.nextLine();
        System.out.println("Enter author: ");
        String penulis = input.nextLine();
        System.out.println("Enter category: ");
        String category = input.nextLine();

        Books.add(new Book(judul, penulis, category));

        System.out.println("book created!");
        System.out.println("===");
        System.out.println("ID: ");
        System.out.println("Title: " + judul);
        System.out.println("Author: " + penulis);
        System.out.println("Category: " + category);
        System.out.println("===");
    }

    public void getBooks() {
        System.out.println("===ALL BOOKS ===");
        for (Book book : Books) {
            System.out.println("===");
            System.out.println("ID: " + book.getID());
            System.out.println("Title: " + book.getJudul());
            System.out.println("Author: " + book.getPenulis());
            System.out.println("Category: " + book.getCategory());
            System.out.println("===");
        }
    }

    public void getBookbyId(String Id) {
        boolean isFound = false;
        for (Book book : Books) {
            if (book.getID().equals(Id)) {
                System.out.println("===");
                System.out.println("ID: " + book.getID());
                System.out.println("Title: " + book.getJudul());
                System.out.println("Author: " + book.getPenulis());
                System.out.println("Category: " + book.getCategory());
                System.out.println("===");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Book not found!");
        }
    }


    public void UpdateBook(String Id) {
        boolean isFound = false;
        Scanner input = new Scanner(System.in);
        for (Book book : Books) {
            if (book.getID().equals(Id)) {
                System.out.println("Enter title: ");
                book.setJudul(input.nextLine());
                System.out.println("Enter author: ");
                book.setPenulis(input.nextLine());
                System.out.println("Enter category: ");
                book.setCategory(input.nextLine());

                System.out.println("book updated!");

                System.out.println("===");
                System.out.println("ID: " + book.getID());
                System.out.println("Title: " + book.getJudul());
                System.out.println("Author: " + book.getPenulis());
                System.out.println("Category: " + book.getCategory());
                System.out.println("===");

                isFound = true;
            }
            break;
        }
        if (!isFound) {
            System.out.println("Book not found!");
        }
    }
    public void deleteBook(String Id){
        boolean isFound = false;
        for (Book book : Books) {
            if (book.getID().equals(Id)){
                Books.remove(book);
                System.out.println("Book deleted!");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Book not found!");
        }
    }
}