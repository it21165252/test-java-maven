
class Book{
    String name;
    String isdn;

    public Book(String name, String isdn) {
        this.name = name;
        this.isdn = isdn;
    }

    public String toString() {
        return "Book name: " + this.name + " isdn: " + this.isdn;
    }
}


public class page5{

    static Book book1;

    static Book swapParam(Book book1 , Book book2) {
        book3 = book1;
        book1 = book2;
        book2 = book3;
        System.out.println(book1);
        System.out.println(book2);
        return book1;
    }
    public static void main(String[] args){
        Book book1 = new Book("Java", "123");
        Book book2 = new Book("C++", "456");
        book2 = swapParam(book1, book2);
        System.out.println(book1);
        System.out.println(book2);
    }
}