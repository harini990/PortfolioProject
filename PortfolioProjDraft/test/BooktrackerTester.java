import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.map.Map;
import components.map.Map1L;

/**
 * Tests all kernel, secondary, and standard methods of BookTracker
 */

public class BooktrackerTester {

    @Test
    public void logBookTest() {
        BookTracker1 library = new BookTracker();
        library.logBook("Book1", 1, 2);
        assertEquals(1, library.totalBookCount());
    }

    @Test
    public void deleteBookTest() {
        BookTracker1 library = new BookTracker();
        library.logBook("Book1", 1, 2);
        library.logBook("Book2", 2, 3);
        library.deleteBook("Book2");
        assertEquals(1, library.totalBookCount());
    }

    @Test
    public void showBookInfoTest() {
        BookTracker1 library = new BookTracker();
        library.logBook("Diary of a Wimpy Kid", 2, 5);
        library.logBook("Book2", 2, 3);
        String str = library.showBookInfo("Diary of a Wimpy Kid");

        assertEquals("Diary of a Wimpy Kid genre-2, 5 stars!", str);
    }

    @Test
    public void getGenresMapTest() {
        BookTracker1 library = new BookTracker();
        library.logBook("Book", 1, 1);
        Map<String, Integer> m = new Map1L<>();
        m.add("Book", 1);
        assertEquals(m, library.getGenresMap());
    }

    @Test
    public void getReviewsMapTest() {
        BookTracker1 library = new BookTracker();
        library.logBook("Book", 1, 4);
        Map<String, Integer> m = new Map1L<>();
        m.add("Book", 4);
        assertEquals(m, library.getReviewsMap());
    }

    @Test
    public void totalBookCountTest() {
        BookTracker1 library = new BookTracker();
        library.logBook("Book", 1, 4);
        library.logBook("Book2", 2, 3);
        library.logBook("Book3", 4, 5);

        assertEquals(3, library.totalBookCount());
    }

    @Test
    public void clearTest() {
        BookTracker1 library = new BookTracker();
        library.logBook("Book", 1, 4);
        library.logBook("Book2", 2, 3);
        library.logBook("Book3", 4, 5);
        library.clear();

        assertEquals(0, library.totalBookCount());
    }

    @Test
    public void transferFromTest() {
        BookTracker1 library = new BookTracker();
        BookTracker1 library1 = new BookTracker();
        library.logBook("Book", 1, 4);
        library1.logBook("Book", 1, 4);

        BookTracker1 library2 = new BookTracker();
        library2.transferFrom(library1);

        assertEquals(library, library2);
    }

    @Test
    public void newInstanceTest() {
        BookTracker1 library = new BookTracker();
        BookTracker1 library1 = library.newInstance();

        assertEquals(library, library1);
    }

    @Test
    public void showAllBooksTest() {
        BookTracker1 library = new BookTracker();
        library.logBook("Book1", 2, 5);
        library.logBook("Book2", 2, 3);
        String str = library.showAllBooks();

        assertEquals("Book1 genre-2, 5 stars!//Book2 genre-2, 3 stars!//", str);
    }

    @Test
    public void sortByReviewTest() {
        BookTracker1 library = new BookTracker();
        library.logBook("Book1", 2, 5);
        library.logBook("Book2", 2, 3);
        String str = library.sortByReview();

        assertEquals(
                "1 star books: //2 star books: //3 star books: Book2. //4 star books: //5 star books: Book1. //",
                str);
    }

    @Test
    public void readingGoalTest() {
        BookTracker1 library = new BookTracker();
        library.logBook("Book1", 2, 5);
        library.logBook("Book2", 2, 3);
        final int goal = 2;

        String str = library.readingGoal(goal);
        assertEquals(str,
                "You've met your goal of 2 books. Congrats, keep reading!");
    }
    
    @Test
    public void toStringTest() {
        BookTracker1 library = new BookTracker();
        library.logBook("Book1", 2, 5);
        library.logBook("Book2", 2, 3);
        String str = library.toString();

        assertEquals("Book1 genre-2, 5 stars!//Book2 genre-2, 3 stars!//", str);
    }

}