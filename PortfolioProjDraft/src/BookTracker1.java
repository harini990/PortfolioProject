/**
 * secondary methods.
 *
 **/
public interface BookTracker1 extends BookTrackerKernel {

    /**
     * uses kernel showBookInfo to select currently logged books and display all
     * library information.
     *
     * @ensures all currently logged books and their info is displayed
     *
     * @returns String of book title genre and rating information
     */
    String showAllBooks();

    /**
     * creates a Queue with titles in order of their numerical rating (highest
     * to lowest).
     *
     * Map <String title, Integer reviewNum>
     *
     * @ensures Queue returns contains titles grouped by their rating
     *
     * @returns Queue<Strings> elements - sorted titles
     */
    String sortByReview();

    /**
     * analyzes a reading goal and reports where reader is in progress of this
     * goal in String.
     *
     * @param goal
     *            int of number of books readers want to log
     *
     * @returns String with explanation of how many books are left or if goal is
     *          met
     */
    String readingGoal(int goal);
}
