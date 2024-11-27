package utils;

import business.Book;

import java.util.Arrays;

public class Library {
    private Book [] books;

    public Library(Book[] books){
        if(books == null){
            books = new Book[ 0];
        }
        this.books = books;
        //Arrays.sort(books);
    }

    public Book search(String title){
        // VALIDATION:
        if(title == null){
            throw new IllegalArgumentException("Title to be searched for cannot be null");
        }

        // SETUP:
        int start = 0;
        int end = books.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (title.equals(books[mid].getTitle())){
                return books[mid];
            }else if(title.compareToIgnoreCase(books[mid].getTitle()) > 0){
                start = mid + 1;
                System.out.println("Changed start to " + start);
            }else{
                end = mid -1;
                System.out.println("Changed end to " + end);
            }

        }
        return null;
    }
}
