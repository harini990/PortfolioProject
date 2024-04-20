
/**
 * Put a short phrase describing the program here.
 *
 * @author Harini Sreeperunbuduru
 *
 */
public final class BookTrackerTest2 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private BookTrackerTest2() {
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

        library.logBook("Diary of a Wimpy Kid", 2, 5);
        //logged using my logBook method
        library.logBook("Sea of Tranquility", 3, 4);
        library.logBook("Goosebumps", 1, 3);
        library.logBook("Goodnight Moon", 2, 5);
        final int x = 15;
        System.out.println(library.readingGoal(x));

        System.out.println("Sorted By Review: ");
        System.out.println(library.sortByReview());
    }

}
