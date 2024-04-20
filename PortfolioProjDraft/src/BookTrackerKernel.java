import components.map.Map;
import components.standard.Standard;

/**
 * ToDoList kernel component with primary methods.
 */
public interface BookTrackerKernel extends Standard<BookTracker1> {

    //Kernel methods -----------------------------------------------------------

    /**
     * adding a new title, genre, and review to respective maps.
     *
     * @param title
     *            String with new title name
     * @param genreNum
     *            number representation of genre of new entry
     * @param reviewNum
     *            number rating of the book
     * @ensures title, genre sorted in genres and title, reviewNum sorted in
     *          reviewList
     */
    void logBook(String title, int genreNum, int reviewNum);

    /**
     * deleting a given title, genre, and review from respective maps.
     *
     * @param title
     *            String with title of book to be removed
     * @ensures title and its corresponding review and genre are not present in
     *          any map in lists
     */
    void deleteBook(String title);

    /**
     * creates string with the rating, review, and genre of the book.
     *
     * @param title
     *            title of book to be searched in information maps
     * @ensures the corresponding information of the book in entered in the
     *          queue
     *
     * @return String
     */
    String showBookInfo(String title);

    /**
     * creates int representing total books logged.
     *
     * @ensures int returned with total book count
     *
     * @return int totalCount with number of books in the tracker
     */
    int totalBookCount();

    /**
     * method accesses genres Map in this for secondary methods to iterate
     * through genres.
     *
     * @ensures genres Map is in this
     *
     * @return Map<String, Integer> of genres
     */
    Map<String, Integer> getGenresMap();

    /**
     * method accesses reviews Map in this for secondary methods to iterate
     * through reviews.
     *
     * @ensures genres Map is in this
     *
     * @return Map<String, Integer> of reviews
     */
    Map<String, Integer> getReviewsMap();

    /**
     * method accesses genresKey Map in this for secondary methods to iterate
     * through users custom genresKey.
     *
     * @ensures genres Map is in this
     *
     * @return Map<String, Integer> of genresKey
     */
    Map<String, Integer> getGenresKeyMap();
}
