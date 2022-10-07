import java.util.Objects;

public class Book {
    private final String  nameBook;
    private final Author author;

    private int yearPublication;

    public Book(String nameBook, Author author, int yearPublication) {
        this.nameBook = nameBook;
        this. author = author;
        this.yearPublication = yearPublication;
    }




    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString() {
        return "Книга: " + this.nameBook + " | Автор: " + this.author + " | Год публикации: " + this.yearPublication;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearPublication);
    }
}

