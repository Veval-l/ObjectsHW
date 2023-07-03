public class Main {

    public static void main(String[] args) {

    Author author1 = new Author("Joane", "Rowling");
    Book book1 = new Book("Harry Potter", 1997, author1);
        System.out.println("book1.name = " + book1.name);
        System.out.println("book1.yearOfRelease = " + book1.yearOfRelease);
        System.out.println("author1.AuthorName = " + author1.AuthorName);
        System.out.println("author1.AuthorSurname = " + author1.AuthorSurname);

    Author author2 = new Author("Donna", "Tartt");
    Book book2 = new Book("The Secret History", 1992, author2);
        System.out.println("book2.name = " + book2.name);
        System.out.println("book2.yearOfRelease = " + book2.yearOfRelease);
        System.out.println("author2.AuthorName = " + author2.AuthorName);
        System.out.println("author2.AuthorSurname = " + author2.AuthorSurname);
    }


}