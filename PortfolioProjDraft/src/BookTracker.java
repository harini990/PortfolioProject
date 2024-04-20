
import components.map.Map;
import components.map.Map1L;
import components.sequence.Sequence;
import components.sequence.Sequence1L;

/**
 * {BookTracker} represented as a {Sequence} with implementations of primary
 * methods.
 *
 * @convention <pre>
 * [all elements in this must be Map<String, Integer>]
 *
 * </pre>
 * @correspondence <pre>
 * this = [if $this.rep = empty_sequence, then BookTracker1 is empty]
 * </pre>
 *
 * @author Harini Sreeperunbuduru
 *
 */
public class BookTracker extends BookTrackerSecondary {

    //@Harini Sreeperunbuduru
    //constructors --------------------------------------------------------

    /**
     * * Initial representation of this.
     */
    private Sequence<Map<String, Integer>> rep;

    /**
     * Creating initial rep.
     */

    private void createNewRep() {
        this.rep = new Sequence1L<Map<String, Integer>>();

        Map<String, Integer> genres = new Map1L<>(); // String title and number for genre
        Map<String, Integer> genresKey = new Map1L<>();
        // predetermined String genre, Int numKey
        Map<String, Integer> reviewList = new Map1L<>();

        this.rep.add(0, genres);
        this.rep.add(1, genresKey);
        this.rep.add(2, reviewList);
    }

    /**
     * No-argument constructor.
     */

    public BookTracker() {
        this.createNewRep();
    }

    //kernel method bodies --------------------------------------------------

    /**
     * adding a book and its info to related maps.
     */
    @Override
    public void logBook(String title, int genre, int review) {
        this.rep.entry(0).add(title, genre);
        this.rep.entry(2).add(title, review);

    }

    /**
     * removing a book and its info to related maps.
     */
    @Override
    public void deleteBook(String title) {
        this.rep.entry(0).remove(title);
        this.rep.entry(2).remove(title);
    }

    /**
     * accessing a book and its info from related maps..
     */
    @Override
    public String showBookInfo(String title) {
        String str = "";
        str = str.concat(title + " ");
        // Concatenating the title to the string and storing the result

        String x = this.rep.entry(0).value(title).toString();

        str = str.concat("genre-" + x + ", ");
        // Concatenating x to the string and storing the result

        String y = (this.rep.entry(2).value(title).toString() + " ");
        str = str.concat(y + "stars!");
        // Concatenating y to the string and storing the result

        return str;
    }

    /**
     * direct access to the genres map in the sequence in the secondary methods.
     */
    @Override
    public Map<String, Integer> getGenresMap() {
        return this.rep.entry(0);
    }

    /**
     * direct access to the genresKey map in the sequence in the secondary
     * methods.
     */
    @Override
    public Map<String, Integer> getGenresKeyMap() {
        return this.rep.entry(1);
    }

    /**
     * direct access to the reviews map in the sequence in the secondary
     * methods.
     */
    @Override
    public Map<String, Integer> getReviewsMap() {
        return this.rep.entry(2);
    }

    /**
     * reports number of books read.
     */
    @Override
    public int totalBookCount() {
        return this.rep.entry(0).size();
    }

    // Standard methods: clear, newInstance, transferFrom ---------------------

    /**
     * clear Method.
     */
    @Override
    public void clear() {
        this.createNewRep();
    }

    /**
     * transferFrom Method.
     */
    @Override
    public void transferFrom(BookTracker1 source) {
        BookTracker localSource = (BookTracker) source;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }

    /**
     * newInstance Method.
     */
    @Override
    public final BookTracker newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

}