package apps;

import business.Book;
import utils.FileHandlingUtilities;
import utils.Library;

public class LibraryInterface {
    public static void main(String[] args) {
        Book[] books = FileHandlingUtilities.readBookFile("SampleInput/BookSampleInput.txt");

        Library myLibrary = new Library(books);

        Book match = myLibrary.search("The Pit and the Pendulum");
        System.out.println("Match: " + match);
    }
}
