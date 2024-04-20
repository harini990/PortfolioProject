import components.map.Map.Pair;

/**
 * Implementation of BookTracker secondary methods.
 *
 * @author Harini Sreeperunbuduru
 */
public abstract class BookTrackerSecondary implements BookTracker1 {

    //Secondary methods ------------------------------------------------------------

    /**
     * @return String with all books and their info.
     */
    @Override
    public String showAllBooks() {
        String str = "";
        for (Pair<String, Integer> p : this.getGenresMap()) {
            //for each book in genres map
            str = str.concat(this.showBookInfo(p.key()) + "//");
        }
        return str;
    }

    /**
     * @return String with Rating number and books in that rating in order.
     */
    @Override
    public String sortByReview() {
        String str = "";
        final int len = 5;
        for (int i = 1; i <= len; i++) {
            str = str.concat(i + " star books: ");
            for (Pair<String, Integer> p : this.getReviewsMap()) {
                if (p.value() == i) {
                    str = str.concat(p.key() + ". ");
                }
            }
            str = str.concat("//");
        }
        return str;
    }

    /**
     * @return String which explains how much user needs to log to meet their
     *         goal.
     */
    @Override
    public String readingGoal(int goal) {

        String str = "";
        if (goal > this.totalBookCount()) {
            str = str.concat("Your goal is" + goal + ", "
                    + (goal - this.totalBookCount()) + "to go!");
        } else if (goal == this.totalBookCount()) {
            str = str.concat("You've met your goal of " + goal
                    + " books. Congrats, keep reading!");
        } else {
            str = str.concat("You've surpassed your goal by "
                    + (this.totalBookCount() - goal) + " books. Great job!");
        }
        return str;

    }

    // extra methods-----------------------------------------------------------

    /**
     * toString Method.
     */
    @Override
    public String toString() {
        return this.showAllBooks();
    }

    /**
     * equals Method.
     */
    @Override
    public boolean equals(Object obj) {
        assert obj != null : "Object must not be null";
        return obj instanceof BookTracker1;
    }

}
