import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга " + name + ", " + author + ", года издания " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && author.equals(book.author) && year == book.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}