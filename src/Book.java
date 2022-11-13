import java.util.Objects;

public class Book {
    private String name;
    private int age;
    private Author author;

    public Book(String name, int age, Author author) {
        this.name = name;
        this.age = age;
        this.author = author;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge() {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, author);
    }

    @Override
    public String toString() {
        return name + " " + author + " " + age;
    }
}
