public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Abay", "Kunanbay uly");
        Book book1 = new Book("Qara so'zderi", 1904);
        System.out.println("Книга " + book1.getName() + "; Автор: " + author1.getFirstName() + " " + author1.getSecondName() + "; год издания: " + book1.getAge() + " год.");
    }
}