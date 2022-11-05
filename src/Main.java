public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Abay", "Kunanbay uly");
        Book book1 = new Book("Qara so'zderi", 1904, author1);
        System.out.println(book1.getAuthor().getFullName());
    }
}