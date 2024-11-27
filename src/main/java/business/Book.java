package business;

public class Book implements Comparable<Book>{
    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        validateISBN(isbn);
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    private static void validateISBN(String isbn) {
        if(isbn == null || isbn.length() != 10){
            throw new IllegalArgumentException("All books must contain a valid ISBN value. A valid ISBN contains 10 " +
                    "characters.");
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        validateISBN(isbn);
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String format(){
        return "\"" + title + "\" by " + author + " - ISBN: " + isbn;
    }

    public int compareTo(Book other){
        if(this.title.compareTo(other.title) < 0){
            return -1;
        }else if(this.title.compareTo(other.title) > 0){
            return 1;
        }else{
            return 0;
        }
    }
}
