import student.TestCase;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is the test class for KVPair class.
 * 
 * @author guangkai
 * @version 1 9/4/2022 11:01 pm
 */
public class KVPairTest extends TestCase {

    /**
     * This will test compareTo().
     */
    public void testPairCompareTo() {

        Rectangle rec1 = new Rectangle(3, 3, 5, 5);
        //KVPair<String, Rectangle> newPair1 = new KVPair<String, Rectangle>(
        //    "rec1", rec1);
        KVPair<String, Rectangle> newPair2 = new KVPair<String, Rectangle>(
            "rec2", rec1);
        assertEquals(newPair2.compareTo(newPair2), 0);
    }


    /**
     * This will test compareTo().
     */
    public void testKeyCompareTo() {

        Rectangle rec1 = new Rectangle(3, 3, 5, 5);
        //KVPair<String, Rectangle> newPair1 = new KVPair<String, Rectangle>(
        //    "rec1", rec1);
        KVPair<String, Rectangle> newPair2 = new KVPair<String, Rectangle>(
            "rec2", rec1);
        
        assertEquals(newPair2.key().compareTo(newPair2.key()), 0);
        assertEquals(newPair2.key(), "rec2");
    }


    /**
     * This will test value().
     */
    public void testValue() {

        Rectangle rec1 = new Rectangle(3, 3, 5, 5);
        KVPair<String, Rectangle> newPair1 = new KVPair<String, Rectangle>(
            "rec1", rec1);

        assertEquals(newPair1.value(), rec1);
    }


    /**
     * This will test toString().
     */
    public void testToString() {

        Rectangle rec1 = new Rectangle(3, 3, 5, 5);
        KVPair<String, Rectangle> newPair1 = new KVPair<String, Rectangle>(
            "rec1", rec1);

        assertEquals(newPair1.toString(), "rec1, 3, 3, 5, 5");
    }
}
