package utils;

import business.Book;

public class BookUtils {
    public static Book parseBook(String line){
        String [] components = line.split("%%");
        if(components.length == 3){
            return new Book(components[0], components[1], components[2]);
        }
        else{
            return null;
        }
    }
}
