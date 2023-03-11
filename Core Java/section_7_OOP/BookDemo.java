package section_7_OOP;

public class BookDemo {

    public static void main(String[] args) {
        Book gameOfThrones = new Book(
                "George Martin",
                "Game of Thrones",
                "Fantasy",
                864
        );
        Book mathBook = new Book(
                "James Sterwart",
                "Calculus",
                "Math",
                1392
        );
        Book javaBook = new Book(
                "Joel Murach",
                "Murach's Jav Programming",
                "Programming",
                864
        );

        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();

    }

//    public static void printBookDetails(Book book) {
//        System.out.println(book.getTitle());
//        System.out.println("by " + book.getAuthor());
//        System.out.println("has " + book.getNumPages() + " pages");
//        System.out.println("and it genre is " + book.getGenre());
//    }

}
