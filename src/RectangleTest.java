import student.TestCase;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is the test class for Rectangle class.
 * 
 * @author guangkai
 * @version 1 9/4/2022 11:08 pm
 */
public class RectangleTest extends TestCase {

    
    /**
     * This will test isOverlapping() method.
     * 
     * Parameter: Rectangle other
     */
    public void testIsOverlapping1() {

        Rectangle interRec1 = new Rectangle(5, 3, 56, 56);
        Rectangle interRec2 = new Rectangle(25, 3, 6, 6);
        Rectangle interRec3 = new Rectangle(1, 1, 5, 5);
        Rectangle interRec4 = new Rectangle(2, 2, 1, 1);

        assertTrue(interRec1.isOverlapping(interRec2));
        assertTrue(interRec3.isOverlapping(interRec4));
        assertTrue(interRec4.isOverlapping(interRec3));

        Rectangle centerRec = new Rectangle(3, 3, 1, 1);
        Rectangle notInterRec1 = new Rectangle(0, 0, 1, 1);
        Rectangle notInterRec2 = new Rectangle(5, 0, 1, 1);
        Rectangle notInterRec3 = new Rectangle(0, 5, 1, 1);
        Rectangle notInterRec4 = new Rectangle(5, 5, 1, 1);

        assertFalse(notInterRec1.isOverlapping(centerRec));
        assertFalse(notInterRec2.isOverlapping(centerRec));
        assertFalse(notInterRec3.isOverlapping(centerRec));
        assertFalse(notInterRec4.isOverlapping(centerRec));

        Rectangle notInterRec5 = new Rectangle(0, 0, 1, 7);
        Rectangle notInterRec6 = new Rectangle(5, 0, 1, 7);

        assertFalse(notInterRec5.isOverlapping(centerRec));
        assertFalse(notInterRec6.isOverlapping(centerRec));

        Rectangle centerRec2 = new Rectangle(3, 3, 1, 7);
        Rectangle notInterRec7 = new Rectangle(0, 5, 1, 1);
        Rectangle notInterRec8 = new Rectangle(5, 5, 1, 1);

        assertFalse(notInterRec7.isOverlapping(centerRec2));
        assertFalse(notInterRec8.isOverlapping(centerRec2));

        Rectangle centerRec3 = new Rectangle(3, 3, 5, 7);
        Rectangle notInterRec9 = new Rectangle(0, 0, 1, 1);
        Rectangle notInterRec10 = new Rectangle(8, 0, 1, 1);
        Rectangle notInterRec11 = new Rectangle(3, 0, 1, 1);

        assertFalse(notInterRec9.isOverlapping(centerRec3));
        assertFalse(notInterRec10.isOverlapping(centerRec3));
        assertFalse(notInterRec11.isOverlapping(centerRec3));
    }
    
    /**
     * This will test isOverlapping() method.
     * 
     * Parameter: Rectangle other
     */
    public void testIsOverlapping2() {
        
        Rectangle c = new Rectangle(10, 10, 5, 5);
        
        Rectangle r1 = new Rectangle(5, 5, 5, 5);
        assertFalse(r1.isOverlapping(c));
        Rectangle r2 = new Rectangle(15, 5, 5, 5);
        assertFalse(r2.isOverlapping(c));
        Rectangle r3 = new Rectangle(5, 15, 5, 5);
        assertFalse(r3.isOverlapping(c));
        Rectangle r4 = new Rectangle(15, 15, 5, 5);
        assertFalse(r4.isOverlapping(c));
        
        Rectangle r5 = new Rectangle(4, 4, 6, 6);
        assertFalse(r5.isOverlapping(c));
        Rectangle r6 = new Rectangle(15, 4, 6, 6);
        assertFalse(r6.isOverlapping(c));
        Rectangle r7 = new Rectangle(4, 15, 6, 6);
        assertFalse(r7.isOverlapping(c));
        Rectangle r8 = new Rectangle(15, 15, 6, 6);
        assertFalse(r8.isOverlapping(c));
        
        Rectangle r9 = new Rectangle(6, 6, 4, 4);
        assertFalse(r9.isOverlapping(c));
        Rectangle r10 = new Rectangle(15, 6, 4, 4);
        assertFalse(r10.isOverlapping(c));
        Rectangle r11 = new Rectangle(6, 15, 4, 4);
        assertFalse(r11.isOverlapping(c));
        Rectangle r12 = new Rectangle(15, 15, 4, 4);
        assertFalse(r12.isOverlapping(c));

        Rectangle r13 = new Rectangle(5, 10, 5, 5);
        assertFalse(r13.isOverlapping(c));
        Rectangle r14 = new Rectangle(10, 5, 5, 5);
        assertFalse(r14.isOverlapping(c));
        Rectangle r15 = new Rectangle(5, 10, 5, 5);
        assertFalse(r15.isOverlapping(c));
        Rectangle r16 = new Rectangle(10, 15, 5, 5);
        assertFalse(r16.isOverlapping(c));
        Rectangle r17 = new Rectangle(10, 15, 5, 5);
        assertFalse(r17.isOverlapping(c));
        
        Rectangle r18 = new Rectangle(4, 9, 6, 6);
        assertFalse(r18.isOverlapping(c));
        Rectangle r19 = new Rectangle(4, 10, 6, 6);
        assertFalse(r19.isOverlapping(c));
        Rectangle r20 = new Rectangle(9, 15, 6, 6);
        assertFalse(r20.isOverlapping(c));
        Rectangle r21 = new Rectangle(10, 15, 6, 6);
        assertFalse(r21.isOverlapping(c));
        Rectangle r22 = new Rectangle(9, 4, 6, 6);
        assertFalse(r22.isOverlapping(c));
        Rectangle r23 = new Rectangle(10, 4, 6, 6);
        assertFalse(r23.isOverlapping(c));
        Rectangle r24 = new Rectangle(15, 9, 6, 6);
        assertFalse(r24.isOverlapping(c));
        Rectangle r25 = new Rectangle(15, 10, 6, 6);
        assertFalse(r25.isOverlapping(c));
        
        Rectangle r26 = new Rectangle(6, 9, 4, 4);
        assertFalse(r26.isOverlapping(c));
        Rectangle r27 = new Rectangle(6, 10, 4, 4);
        assertFalse(r27.isOverlapping(c));
        Rectangle r28 = new Rectangle(6, 11, 4, 4);
        assertFalse(r28.isOverlapping(c));
        Rectangle r29 = new Rectangle(6, 12, 4, 4);
        assertFalse(r29.isOverlapping(c));
        Rectangle r30 = new Rectangle(9, 6, 4, 4);
        assertFalse(r30.isOverlapping(c));
        Rectangle r31 = new Rectangle(10, 6, 4, 4);
        assertFalse(r31.isOverlapping(c));
        Rectangle r32 = new Rectangle(11, 6, 4, 4);
        assertFalse(r32.isOverlapping(c));
        Rectangle r33 = new Rectangle(12, 6, 4, 4);
        assertFalse(r33.isOverlapping(c));
        Rectangle r34 = new Rectangle(15, 9, 4, 4);
        assertFalse(r34.isOverlapping(c));
        Rectangle r35 = new Rectangle(15, 10, 4, 4);
        assertFalse(r35.isOverlapping(c));
        Rectangle r36 = new Rectangle(15, 11, 4, 4);
        assertFalse(r36.isOverlapping(c));
        Rectangle r37 = new Rectangle(15, 12, 4, 4);
        assertFalse(r37.isOverlapping(c));
        Rectangle r38 = new Rectangle(9, 15, 4, 4);
        assertFalse(r38.isOverlapping(c));
        Rectangle r39 = new Rectangle(10, 15, 4, 4);
        assertFalse(r39.isOverlapping(c));
        Rectangle r40 = new Rectangle(11, 15, 4, 4);
        assertFalse(r40.isOverlapping(c));
        Rectangle r41 = new Rectangle(12, 15, 4, 4);
        assertFalse(r41.isOverlapping(c));
    }


    /**
     * This will test getX() method.
     * 
     * Parameter: None
     */
    public void testGetX() {
        Rectangle getX = new Rectangle(5, 3, 56, 57);

        assertEquals(getX.getX(), 5);
    }


    /**
     * This will test getY() method.
     * 
     * Parameter: None
     */
    public void testGetY() {
        Rectangle getY = new Rectangle(5, 3, 56, 57);

        assertEquals(getY.getY(), 3);
    }


    /**
     * This will test getW() method.
     * 
     * Parameter: None
     */
    public void testGetW() {
        Rectangle getW = new Rectangle(5, 3, 56, 57);

        assertEquals(getW.getW(), 56);
    }


    /**
     * This will test getH() method.
     * 
     * Parameter: None
     */
    public void testGetH() {
        Rectangle getH = new Rectangle(5, 3, 56, 57);

        assertEquals(getH.getH(), 57);
    }


    /**
     * This will test toString() method.
     * 
     * Parameter: None
     */
    public void testToString() {
        Rectangle toString1 = new Rectangle(5, 3, 56, 57);

        assertTrue(toString1.toString().equals("5, 3, 56, 57"));
    }
    
    /**
     * This will test override equal() method.
     * 
     * Parameter: None
     */
    public void testEquals() {
        
        Rectangle toString1 = new Rectangle(5, 3, 56, 57);
        
        Rectangle toString2 = new Rectangle(5, 3, 56, 57);
        Rectangle toString3 = new Rectangle(6, 3, 56, 57);
        Rectangle toString4 = new Rectangle(5, 4, 56, 57);
        Rectangle toString5 = new Rectangle(5, 3, 57, 57);
        Rectangle toString6 = new Rectangle(5, 3, 56, 58);
        
        Rectangle toString7 = new Rectangle(6, 3, 56, 57);
        Rectangle toString8 = new Rectangle(5, 5, 56, 57);
        Rectangle toString9 = new Rectangle(5, 3, 57, 57);
        Rectangle toString10 = new Rectangle(5, 3, 56, 58);
        
        Rectangle toString11 = new Rectangle(6, 4, 56, 57);
        Rectangle toString12 = new Rectangle(6, 3, 57, 57);
        Rectangle toString13 = new Rectangle(6, 3, 56, 58);
        
        Rectangle toString14 = new Rectangle(5, 4, 57, 57);
        Rectangle toString15 = new Rectangle(5, 4, 56, 58);
        Rectangle toString16 = new Rectangle(5, 3, 57, 58);
        
        Rectangle toString17 = new Rectangle(6, 4, 57, 57);
        Rectangle toString18 = new Rectangle(6, 4, 56, 58);
        Rectangle toString19 = new Rectangle(6, 3, 57, 58);
        Rectangle toString20 = new Rectangle(5, 4, 57, 58);
        
        Rectangle toString21 = new Rectangle(5, 4, 57, 58);

        assertTrue(toString1.equals(toString2));
        assertTrue(toString1.equals(toString1));
        assertFalse(toString1.equals("uncertainity"));
        assertFalse(toString1.equals(toString3));
        assertFalse(toString1.equals(toString4));
        assertFalse(toString1.equals(toString5));
        assertFalse(toString1.equals(toString6));
        assertFalse(toString1.equals(toString7));
        assertFalse(toString1.equals(toString8));
        assertFalse(toString1.equals(toString9));
        assertFalse(toString1.equals(toString10));
        assertFalse(toString1.equals(toString11));
        assertFalse(toString1.equals(toString12));
        assertFalse(toString1.equals(toString13));
        assertFalse(toString1.equals(toString14));
        assertFalse(toString1.equals(toString15));
        assertFalse(toString1.equals(toString16));
        assertFalse(toString1.equals(toString17));
        assertFalse(toString1.equals(toString18));
        assertFalse(toString1.equals(toString19));
        assertFalse(toString1.equals(toString20));
        assertFalse(toString1.equals(toString21));
        
    }
}
