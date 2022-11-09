public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Qara so'zderi", 1904, new Author("aaa", "aaaa"));
        System.out.println(book1.getAuthor());
        Book book2 = new Book("dfdf", 11321, new Author("ggd", "fdf"));
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book2.toString());
    }
}