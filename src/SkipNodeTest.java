import student.TestCase;

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
 * @version 1 9/4/2022 11:44 pm
 */
public class SkipNodeTest extends TestCase {

    /**
     * This will test the getPair() method.
     */
    public void testGetPair() {

        Rectangle newPairRec = new Rectangle(3, 3, 5, 5);
        SkipNode<String, Rectangle> newNode = 
            new SkipNode<String, Rectangle>("newPair", newPairRec, 3);
        assertTrue(newNode.getPair().key().equals("newPair"));
        String str = newNode.getPair().toString();
        assertTrue(str.equals("newPair, 3, 3, 5, 5"));
    }


    /**
     * This will test the getDepth() method.
     */
    public void testGetDepth() {

        Rectangle newPairRec = new Rectangle(3, 3, 5, 5);
        SkipNode<String, Rectangle> newNode = 
            new SkipNode<String, Rectangle>("newPair", newPairRec, 3);
        assertTrue(newNode.getDepth().equals("3"));
    }


    /**
     * This will test element() method.
     */
    public void testElement() {

        Rectangle newPairRec = new Rectangle(3, 3, 5, 5);
        SkipNode<String, Rectangle> newNode = 
            new SkipNode<String, Rectangle>("newPair", newPairRec, 3);
        assertTrue(newNode.element().equals(newPairRec));
    }


    /**
     * This will test key() method.
     */
    public void testKey() {

        Rectangle newPairRec = new Rectangle(3, 3, 5, 5);
        SkipNode<String, Rectangle> newNode = 
            new SkipNode<String, Rectangle>("newPair", newPairRec, 3);
        assertTrue(newNode.key().equals("newPair"));
    }


    ///**
    // * This will test toString() method.
    // */
    //public void testToString() {
//
     //   Rectangle newPairRec = new Rectangle(3, 3, 5, 5);
     //   SkipNode<String, Rectangle> newNode = 
     //       new SkipNode<String, Rectangle>("newPair", newPairRec, 3);
    //    assertTrue(newNode.toString().equals("newPair, 3, 3, 5, 5"));
    //}
}
