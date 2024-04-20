
/**
 * Put a short phrase describing the program here.
 *
 * @author Harini Sreeperunbuduru
 *
 */
public final class BookTrackerTest {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private BookTrackerTest() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        BookTracker1 library = new BookTracker();

        System.out.println("Welcome to your library");
        System.out.println(""); //blank

        System.out.println("your personal genre key:"); //setup
        System.out.println("1 horror");
        System.out.println("2 comedy");
        System.out.println("3 sciencefiction");
        System.out.println("rate books between 1-5 stars");

        System.out.println(""); //blank

        System.out.println("Test: logging the following books + info");
        System.out.println("Diary of a Wimpy Kid");
        System.out.println("Sea of Tranquility");
        System.out.println("Goosebumps");

        library.logBook("Diary of a Wimpy Kid", 2, 5);
        //logged using my logBook method
        library.logBook("Sea of Tranquility", 3, 4);
        library.logBook("Goosebumps", 1, 3);

        System.out.println(""); //blank

        System.out.println("Test: pull up Diary of a Wimpy Kid info");
        System.out.println(library.showBookInfo("Diary of a Wimpy Kid"));
        // using my showBookInfo method

        System.out.println(""); //blank

        System.out.println("Test: show whole library");
        System.out.println(library.showAllBooks()); //using my showAllBooks method
        System.out.println(""); //blank

        System.out.println(
                "Test: removing Sea of Tranquility then show whole library");
        library.deleteBook("Sea of Tranquility"); //using my deleteBooks method
        System.out.println(library.showAllBooks());

        System.out.println(""); //blank

        System.out.println("Test: print library by review");
        System.out.println(library.sortByReview());

        BookTracker1 library1 = new BookTracker();

    }

}
