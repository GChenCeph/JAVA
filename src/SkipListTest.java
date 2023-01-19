import student.TestCase;
import student.TestableRandom;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is the test class for SkipList class.
 * 
 * @author guangkai
 * @version 1 9/4/2022 11:23 pm
 */
public class SkipListTest extends TestCase {

    /**
     * This will test getSize().
     */
    public void testGetSize() {

        SkipList<String, Rectangle> list = new SkipList<>();
        Rectangle rec1 = new Rectangle(2, 2, 3, 3);
        list.insert("rec1", rec1);
        assertEquals(list.getSize(), 1);
    }


    /**
     * This will test getLevel().
     */
    public void testGetLevel() {

        SkipList<String, Rectangle> list = new SkipList<>();
        Rectangle rec1 = new Rectangle(2, 2, 3, 3);
        TestableRandom.setNextBooleans(true, true, false);
        list.insert("rec1", rec1);
        assertEquals(list.getLevel(), 2);
    }


    /**
     * This will test insert().
     */
    public void testInsert1() {

        SkipList<String, Rectangle> list = new SkipList<>();
        Rectangle rec1 = new Rectangle(2, 2, 3, 3);
        Rectangle rec2 = new Rectangle(2, 2, 4, 4);
        Rectangle rec3 = new Rectangle(2, 2, 5, 5);
        list.insert("rec1", rec1);
        list.insert("abc", rec2);
        list.insert("abc", rec3);
        
        assertEquals(list.getSize(), 3);
    }


    /**
     * This will test insert().
     */
    public void testInsert2() {

        SkipList<String, Rectangle> list = new SkipList<>();
        //Rectangle rec1 = new Rectangle(2, 2, 3, 3, "rec1");
        //list.insert(null, rec1);
        
        assertEquals(list.getSize(), 0);
    }


    /**
     * This will test adjustHead()
     */
    public void testAdjustHead() {

        SkipList<String, Rectangle> list = new SkipList<>();
        Rectangle rec1 = new Rectangle(2, 2, 3, 3);
        Rectangle rec2 = new Rectangle(2, 2, 4, 4);

        TestableRandom.setNextBooleans(true, false);
        list.insert("rec1", rec1);
        assertEquals(list.head.getDepth(), "1");
        assertEquals(list.getLevel(), 1);

        TestableRandom.setNextBooleans(true, true, false);
        list.insert("rec2", rec2);
        assertEquals(list.head.getDepth(), "2");
        assertEquals(list.getLevel(), 2);
    }


    /**
     * This will test dump().
     */
    public void testDump1() {

        SkipList<String, Rectangle> list = new SkipList<>();
        Rectangle rec1 = new Rectangle(2, 2, 3, 3);

        TestableRandom.setNextBooleans(true, false);
        list.insert("rec1", rec1);
        String[][] str = list.dump();
        
        assertEquals(list.getSize(), 1);

        assertEquals(str[0][0], "null");
        assertEquals(str[0][1], "1");
        
        assertEquals(str[1][0], "rec1, 2, 2, 3, 3");
        assertEquals(str[1][1], "1");
        
        assertEquals(str.length, 2);
    }
    
    /**
     * This will test dump().
     */
    public void testDump2() {

        SkipList<String, Rectangle> list = new SkipList<>();
        String[][] str = list.dump();

        assertEquals(list.getSize(), 0);
        assertEquals(str.length, 1);
    }


    /**
     * This will test removeByName()
     */
    public void testRemoveByName1() {

        SkipList<String, Rectangle> list = new SkipList<>();
        Rectangle rec1 = new Rectangle(2, 2, 3, 3);
        Rectangle rec2 = new Rectangle(2, 2, 4, 4);
        Rectangle rec3 = new Rectangle(2, 2, 4, 4);
        Rectangle rec5 = new Rectangle(2, 2, 4, 4);
        list.insert("rec1", rec1);
        list.insert("rec2", rec2);
        list.insert("rec3", rec3);
        list.insert("rec5", rec5);

        list.removeByName("rec1");
        list.removeByName("rec2");
        list.removeByName("rec2");
        list.removeByName("rec4");
    }
    
    /**
     * This will test removeByName()
     */
    public void testRemoveByName2() {

        SkipList<String, Rectangle> list = new SkipList<>();

        list.removeByName("rec1");
    }
    
    /**
     * This will test removeByName()
     */
    public void testRemoveByCoord1() {

        SkipList<String, Rectangle> list = new SkipList<>();
        Rectangle rec1 = new Rectangle(2, 2, 3, 3);
        Rectangle rec2 = new Rectangle(2, 2, 4, 4);
        Rectangle rec3 = new Rectangle(2, 2, 5, 6);
        Rectangle rec4 = new Rectangle(2, 2, 7, 7);
        KVPair<String, Rectangle> recPair1 = 
            new KVPair<String, Rectangle>("recPair1", rec1);
        KVPair<String, Rectangle> recPair2 = 
            new KVPair<String, Rectangle>("recPair2", rec2);
        KVPair<String, Rectangle> recPair3 = 
            new KVPair<String, Rectangle>("recPair3", rec3);
        KVPair<String, Rectangle> recPair4 = 
            new KVPair<String, Rectangle>("recPair4", rec4);
        TestableRandom.setNextBooleans(true, true, false);
        list.insert("rec1", rec1);
        TestableRandom.setNextBooleans(true, true, false);
        list.insert("rec2", rec2);
        TestableRandom.setNextBooleans(true, true, false);
        list.insert("rec3", rec3);
        TestableRandom.setNextBooleans(true, true, false);
        list.insert("rec4", rec4);

        list.removeByCoord(recPair1);
        list.search("rec1");
        list.removeByCoord(recPair2);
        list.removeByCoord(recPair3);
        list.removeByCoord(recPair4);
    }
    
    /**
     * This will test removeByName()
     */
    public void testRemoveByCoord2() {

        SkipList<String, Rectangle> list = new SkipList<>();

        list.removeByName("1, 2, 3, 4");
        Rectangle rec1 = new Rectangle(2, 2, 3, 3);
        KVPair<String, Rectangle> recPair1 = 
            new KVPair<String, Rectangle>("recPair1", rec1);
        TestableRandom.setNextBooleans(true, true, false);
        list.insert("rec1", rec1);
        
        list.removeByCoord(recPair1);
    }


    /**
     * This will test search()
     */
    public void testSearch1() {

        SkipList<String, Rectangle> list = new SkipList<>();
        Rectangle rec1 = new Rectangle(2, 2, 3, 3);
        Rectangle rec2 = new Rectangle(2, 2, 4, 4);
        Rectangle rec4 = new Rectangle(2, 2, 5, 5);
        list.insert("rec1", rec1);
        list.insert("rec2", rec2);
        list.insert("rec4", rec4);

        KVPair<String, Rectangle> recPair1 = new KVPair<String, Rectangle>(
            "rec1", rec1);
        KVPair<String, Rectangle> recPair2 = new KVPair<String, Rectangle>(
            "rec2", rec2);

        assertTrue(list.search("rec1")[0].toString().equals(recPair1.value()
            .toString()));
        assertTrue(list.search("rec2")[0].toString().equals(recPair2.value()
            .toString()));
        assertNull(list.search("rec3"));
    }


    /**
     * This will test search()
     */
    public void testSearch2() {

        SkipList<String, Rectangle> list = new SkipList<>();
        Rectangle rec1 = new Rectangle(2, 2, 3, 3);
        Rectangle rec2 = new Rectangle(2, 2, 4, 4);
        list.insert("rec1", rec1);
        list.insert("rec2", rec2);
        

        KVPair<String, Rectangle> recPair1 = new KVPair<String, Rectangle>(
            "rec1", rec1);
        KVPair<String, Rectangle> recPair2 = new KVPair<String, Rectangle>(
            "rec2", rec2);

        assertTrue(list.search("rec1")[0].toString().equals(recPair1.value()
            .toString()));
        assertTrue(list.search("rec2")[0].toString().equals(recPair2.value()
            .toString()));
        assertNull(list.search("rec3"));
    }
}
