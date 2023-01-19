import java.io.FileNotFoundException;
import student.TestCase;
//import student.TestableRandom;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This will test Rectangle1 class, which
 * contains main.
 * 
 * @author guangkai
 * @version 1 9/4/2022 11:31 pm
 */
public class Rectangle1Test extends TestCase {

    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    public void testMain1() throws FileNotFoundException {

        String[] str0 = new String[1];
        str0[0] = "testing.txt";
        Rectangle1.main(str0);
        assertEquals(systemOut().getHistory(), ""
            + "Rectangle inserted: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec2, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec2, 2, 2, 3, 3)\r\n"
            + "Rectangle inserted: (rec3, 2, 2, 3, 3)\r\n"
            + "Rectangle removed: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle removed: (rec1, 2, 2, 3, 3)\r\n"
            + "Rectangle removed: (rec2, 2, 2, 3, 3)\r\n"
            + "Rectangle removed: (rec3, 2, 2, 3, 3)\r\n"
            + "Rectangles found:\r\n" + "(rec1, 2, 2, 3, 3)\r\n"
            + "(rec1, 2, 2, 3, 3)\r\n" + "(rec1, 2, 2, 3, 3)\r\n"
            + "(rec1, 2, 2, 3, 3)\r\n" + "(rec1, 2, 2, 3, 3)\r\n"
            + "(rec1, 2, 2, 3, 3)\r\n" + "(rec1, 2, 2, 3, 3)\r\n"
            + "(rec1, 2, 2, 3, 3)\r\n" + "(rec1, 2, 2, 3, 3)\r\n"
            + "Rectangles found:\r\n" + "(rec2, 2, 2, 3, 3)\n");
        systemOut().clearHistory();
    }


    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    public void testMain2() throws FileNotFoundException {

        String[] str = new String[1];
        str[0] = "testEmpty.txt";
        Rectangle1.main(str);
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
    }


    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    public void testMain3() throws FileNotFoundException {
        String[] str1 = new String[1];
        str1[0] = "testDoc3.txt";
        Rectangle1.main(str1);
        assertEquals(systemOut().getHistory(),
            "Rectangle rejected: (r_r, -1, -20, 3, 4)\r\n"
                + "Rectangle rejected: (rec, 7, -8, 1, 3)\r\n"
                + "Rectangle rejected: (virtual_rec0, 1, 1, 0, 0)\r\n"
                + "Rectangle rejected: (virtual_REC0, 0, 0, 11, 0)\r\n"
                + "Rectangle rejected: (inExistRec_0, 1, 1, -1, -2)\r\n"
                + "Rectangle rejected: (11, 11, 0, 0)\r\n"
                + "Intersections pairs:\r\n"
                + "Rectangles not found: (r_r)\r\n"
                + "Rectangle not removed: (r_r)\r\n"
                + "Rectangle rejected: (1, 1, 0, 0)\r\n"
                + "Rectangles intersecting region (-5, -5, 20, 20):\r\n"
                + "Rectangle rejected: (5, 5, 0, 0)\r\n"
                + "Rectangle rejected: (5, 5, -1, -1)\r\n"
                + "Rectangle rejected: (5, 5, -1, 1)\r\n"
                + "Rectangle rejected: (5, 5, 1, -1)\r\n"
                + "Rectangle inserted: (goodRect, 5, 3, 56, 56)\r\n"
                + "Rectangle inserted: (goodRect2, 111, 400, 20, 20)\r\n"
                + "Rectangle inserted: (goodRect3, 25, 3, 6, 6)\n");
        systemOut().clearHistory();
    }


    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    public void testMain4() throws FileNotFoundException {
        String[] str2 = new String[1];
        str2[0] = "testDoc4.txt";
        Rectangle1.main(str2);
        assertEquals(systemOut().getHistory(),
            "Rectangle not removed: (goodRect)\r\n"
            + "Rectangle not removed: (goodRect2)\r\n"
            + "Rectangle not removed: (goodRect3)\r\n"
            + "Rectangle not removed: (goodRect34)\r\n"
            + "Rectangle inserted: (testDump_1, 5, 3, 56, 56)\r\n"
            + "Rectangle inserted: (testDump_2, 25, 3, 6, 6)\r\n"
            + "Rectangle inserted: (testDump_3, 5, 3, 56, 56)\r\n"
            + "Rectangle inserted: (testDump_4, 25, 3, 6, 6)\r\n"
            + "Rectangle removed: (testDump_2, 25, 3, 6, 6)\r\n"
            + "Rectangles not found: (testDump_2)\r\n"
            + "Rectangles found:\r\n"
            + "(testDump_3, 5, 3, 56, 56)\r\n"
            + "Rectangle inserted: (virtual_rec0, 1, 1, 2, 2)\r\n"
            + "Rectangle inserted: (Virtual_rec0, 2, 2, 11, 3)\r\n"
            + "Rectangles intersecting region (-5, -5, 20, 20):\r\n"
            + "(Virtual_rec0, 2, 2, 11, 3)\r\n"
            + "(testDump_1, 5, 3, 56, 56)\r\n"
            + "(testDump_3, 5, 3, 56, 56)\r\n"
            + "(virtual_rec0, 1, 1, 2, 2)\r\n"
            + "Rectangle removed: (virtual_rec0, 1, 1, 2, 2)\r\n"
            + "Rectangle rejected: (1, 1, 2, 3)\r\n"
            + "Rectangle rejected: (1, 1, 99, 3)\r\n"
            + "Rectangle rejected: (1, 1, 2, 99)\r\n"
            + "Rectangle rejected: (1, 99, 2, 3)\r\n"
            + "Rectangle rejected: (99, 1, 2, 3)\r\n"
            + "Rectangle rejected: (1, 99, 99, 99)\r\n"
            + "Rectangle rejected: (99, 1, 99, 99)\r\n"
            + "Rectangle rejected: (99, 99, 2, 99)\r\n"
            + "Rectangle rejected: (99, 99, 99, 3)\r\n"
            + "Rectangle rejected: (2, 2, 2, 2)\r\n"
            + "Rectangle rejected: (2, 1, 3, 2)\r\n"
            + "Rectangle rejected: (2, 1, 2, 3)\r\n"
            + "Rectangle rejected: (1, 2, 3, 2)\r\n"
            + "Rectangle rejected: (1, 2, 2, 3)\r\n"
            + "Rectangle rejected: (1, 1, 3, 4)\r\n"
            + "Rectangle rejected: (2, 2, 3, 2)\r\n"
            + "Rectangle rejected: (2, 2, 2, 3)\r\n"
            + "Rectangle rejected: (1, 2, 3, 3)\r\n"
            + "Rectangle rejected: (2, 1, 3, 3)\r\n"
            + "Rectangle rejected: (2, 2, 3, 3)\r\n"
            + "Rectangle rejected: (2, 1, 2, 2)\r\n"
            + "Rectangle rejected: (1, 2, 2, 2)\r\n"
            + "Rectangle rejected: (1, 1, 3, 2)\r\n"
            + "Rectangle rejected: (2, 2, 2, 2)\r\n"
            + "Rectangle rejected: (2, 1, 3, 2)\r\n"
            + "Rectangle rejected: (1, 2, 3, 2)\r\n"
            + "Rectangle rejected: (2, 2, 3, 2)\n");
        systemOut().clearHistory();
    }


    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    public void testMain5() throws FileNotFoundException {
        String[] str3 = new String[1];
        str3[0] = "testDoc5.txt";
        Rectangle1.main(str3);
        assertEquals(systemOut().getHistory(),
            "Rectangle inserted: (c, 10, 10, 5, 5)\r\n"
                + "Rectangle inserted: (r1, 5, 5, 5, 5)\r\n"
                + "Rectangle inserted: (r2, 15, 5, 5, 5)\r\n"
                + "Rectangle inserted: (r3, 5, 15, 5, 5)\r\n"
                + "Rectangle inserted: (r4, 15, 15, 5, 5)\r\n"
                + "Rectangle inserted: (r5, 4, 4, 6, 6)\r\n"
                + "Rectangle inserted: (r6, 15, 4, 6, 6)\r\n"
                + "Rectangle inserted: (r7, 4, 15, 6, 6)\r\n"
                + "Rectangle inserted: (r8, 15, 15, 6, 6)\r\n"
                + "Rectangle inserted: (r9, 6, 6, 4, 4)\r\n"
                + "Rectangle inserted: (r10, 15, 6, 4, 4)\r\n"
                + "Rectangle inserted: (r11, 6, 15, 4, 4)\r\n"
                + "Rectangle inserted: (r12, 15, 15, 4, 4)\r\n"
                + "Rectangle inserted: (r13, 5, 10, 5, 5)\r\n"
                + "Rectangle inserted: (r14, 10, 5, 5, 5)\r\n"
                + "Rectangle inserted: (r15, 5, 10, 5, 5)\r\n"
                + "Rectangle inserted: (r16, 10, 15, 5, 5)\r\n"
                + "Rectangle inserted: (r17, 10, 15, 5, 5)\r\n"
                + "Rectangle inserted: (r18, 4, 9, 6, 6)\r\n"
                + "Rectangle inserted: (r19, 4, 10, 6, 6)\r\n"
                + "Rectangle inserted: (r20, 9, 15, 6, 6)\r\n"
                + "Rectangle inserted: (r21, 10, 15, 6, 6)\r\n"
                + "Rectangle inserted: (r22, 9, 4, 6, 6)\r\n"
                + "Rectangle inserted: (r23, 10, 4, 6, 6)\r\n"
                + "Rectangle inserted: (r24, 15, 9, 6, 6)\r\n"
                + "Rectangle inserted: (r25, 15, 10, 6, 6)\r\n"
                + "Rectangle inserted: (r26, 6, 9, 4, 4)\r\n"
                + "Rectangle inserted: (r27, 6, 10, 4, 4)\r\n"
                + "Rectangle inserted: (r28, 6, 11, 4, 4)\r\n"
                + "Rectangle inserted: (r29, 6, 12, 4, 4)\r\n"
                + "Rectangle inserted: (r30, 9, 6, 4, 4)\r\n"
                + "Rectangle inserted: (r31, 10, 6, 4, 4)\r\n"
                + "Rectangle inserted: (r32, 11, 6, 4, 4)\r\n"
                + "Rectangle inserted: (r33, 12, 6, 4, 4)\r\n"
                + "Rectangle inserted: (r34, 15, 9, 4, 4)\r\n"
                + "Rectangle inserted: (r35, 15, 10, 4, 4)\r\n"
                + "Rectangle inserted: (r36, 15, 11, 4, 4)\r\n"
                + "Rectangle inserted: (r37, 15, 12, 4, 4)\r\n"
                + "Rectangle inserted: (r38, 9, 15, 4, 4)\r\n"
                + "Rectangle inserted: (r39, 10, 15, 4, 4)\r\n"
                + "Rectangle inserted: (r40, 11, 15, 4, 4)\r\n"
                + "Rectangle inserted: (r41, 12, 15, 4, 4)\r\n"
                + "Intersections pairs:\r\n"
                + "(r1, 5, 5, 5, 5 | r18, 4, 9, 6, 6)\r\n"
                + "(r1, 5, 5, 5, 5 | r22, 9, 4, 6, 6)\r\n"
                + "(r1, 5, 5, 5, 5 | r26, 6, 9, 4, 4)\r\n"
                + "(r1, 5, 5, 5, 5 | r30, 9, 6, 4, 4)\r\n"
                + "(r1, 5, 5, 5, 5 | r5, 4, 4, 6, 6)\r\n"
                + "(r1, 5, 5, 5, 5 | r9, 6, 6, 4, 4)\r\n"
                + "(r10, 15, 6, 4, 4 | r2, 15, 5, 5, 5)\r\n"
                + "(r10, 15, 6, 4, 4 | r23, 10, 4, 6, 6)\r\n"
                + "(r10, 15, 6, 4, 4 | r24, 15, 9, 6, 6)\r\n"
                + "(r10, 15, 6, 4, 4 | r33, 12, 6, 4, 4)\r\n"
                + "(r10, 15, 6, 4, 4 | r34, 15, 9, 4, 4)\r\n"
                + "(r10, 15, 6, 4, 4 | r6, 15, 4, 6, 6)\r\n"
                + "(r11, 6, 15, 4, 4 | r19, 4, 10, 6, 6)\r\n"
                + "(r11, 6, 15, 4, 4 | r20, 9, 15, 6, 6)\r\n"
                + "(r11, 6, 15, 4, 4 | r29, 6, 12, 4, 4)\r\n"
                + "(r11, 6, 15, 4, 4 | r3, 5, 15, 5, 5)\r\n"
                + "(r11, 6, 15, 4, 4 | r38, 9, 15, 4, 4)\r\n"
                + "(r11, 6, 15, 4, 4 | r7, 4, 15, 6, 6)\r\n"
                + "(r12, 15, 15, 4, 4 | r21, 10, 15, 6, 6)\r\n"
                + "(r12, 15, 15, 4, 4 | r25, 15, 10, 6, 6)\r\n"
                + "(r12, 15, 15, 4, 4 | r37, 15, 12, 4, 4)\r\n"
                + "(r12, 15, 15, 4, 4 | r4, 15, 15, 5, 5)\r\n"
                + "(r12, 15, 15, 4, 4 | r41, 12, 15, 4, 4)\r\n"
                + "(r12, 15, 15, 4, 4 | r8, 15, 15, 6, 6)\r\n"
                + "(r13, 5, 10, 5, 5 | r15, 5, 10, 5, 5)\r\n"
                + "(r13, 5, 10, 5, 5 | r18, 4, 9, 6, 6)\r\n"
                + "(r13, 5, 10, 5, 5 | r19, 4, 10, 6, 6)\r\n"
                + "(r13, 5, 10, 5, 5 | r26, 6, 9, 4, 4)\r\n"
                + "(r13, 5, 10, 5, 5 | r27, 6, 10, 4, 4)\r\n"
                + "(r13, 5, 10, 5, 5 | r28, 6, 11, 4, 4)\r\n"
                + "(r13, 5, 10, 5, 5 | r29, 6, 12, 4, 4)\r\n"
                + "(r14, 10, 5, 5, 5 | r22, 9, 4, 6, 6)\r\n"
                + "(r14, 10, 5, 5, 5 | r23, 10, 4, 6, 6)\r\n"
                + "(r14, 10, 5, 5, 5 | r30, 9, 6, 4, 4)\r\n"
                + "(r14, 10, 5, 5, 5 | r31, 10, 6, 4, 4)\r\n"
                + "(r14, 10, 5, 5, 5 | r32, 11, 6, 4, 4)\r\n"
                + "(r14, 10, 5, 5, 5 | r33, 12, 6, 4, 4)\r\n"
                + "(r15, 5, 10, 5, 5 | r13, 5, 10, 5, 5)\r\n"
                + "(r15, 5, 10, 5, 5 | r18, 4, 9, 6, 6)\r\n"
                + "(r15, 5, 10, 5, 5 | r19, 4, 10, 6, 6)\r\n"
                + "(r15, 5, 10, 5, 5 | r26, 6, 9, 4, 4)\r\n"
                + "(r15, 5, 10, 5, 5 | r27, 6, 10, 4, 4)\r\n"
                + "(r15, 5, 10, 5, 5 | r28, 6, 11, 4, 4)\r\n"
                + "(r15, 5, 10, 5, 5 | r29, 6, 12, 4, 4)\r\n"
                + "(r16, 10, 15, 5, 5 | r17, 10, 15, 5, 5)\r\n"
                + "(r16, 10, 15, 5, 5 | r20, 9, 15, 6, 6)\r\n"
                + "(r16, 10, 15, 5, 5 | r21, 10, 15, 6, 6)\r\n"
                + "(r16, 10, 15, 5, 5 | r38, 9, 15, 4, 4)\r\n"
                + "(r16, 10, 15, 5, 5 | r39, 10, 15, 4, 4)\r\n"
                + "(r16, 10, 15, 5, 5 | r40, 11, 15, 4, 4)\r\n"
                + "(r16, 10, 15, 5, 5 | r41, 12, 15, 4, 4)\r\n"
                + "(r17, 10, 15, 5, 5 | r16, 10, 15, 5, 5)\r\n"
                + "(r17, 10, 15, 5, 5 | r20, 9, 15, 6, 6)\r\n"
                + "(r17, 10, 15, 5, 5 | r21, 10, 15, 6, 6)\r\n"
                + "(r17, 10, 15, 5, 5 | r38, 9, 15, 4, 4)\r\n"
                + "(r17, 10, 15, 5, 5 | r39, 10, 15, 4, 4)\r\n"
                + "(r17, 10, 15, 5, 5 | r40, 11, 15, 4, 4)\r\n"
                + "(r17, 10, 15, 5, 5 | r41, 12, 15, 4, 4)\r\n"
                + "(r18, 4, 9, 6, 6 | r1, 5, 5, 5, 5)\r\n"
                + "(r18, 4, 9, 6, 6 | r13, 5, 10, 5, 5)\r\n"
                + "(r18, 4, 9, 6, 6 | r15, 5, 10, 5, 5)\r\n"
                + "(r18, 4, 9, 6, 6 | r19, 4, 10, 6, 6)\r\n"
                + "(r18, 4, 9, 6, 6 | r22, 9, 4, 6, 6)\r\n"
                + "(r18, 4, 9, 6, 6 | r26, 6, 9, 4, 4)\r\n"
                + "(r18, 4, 9, 6, 6 | r27, 6, 10, 4, 4)\r\n"
                + "(r18, 4, 9, 6, 6 | r28, 6, 11, 4, 4)\r\n"
                + "(r18, 4, 9, 6, 6 | r29, 6, 12, 4, 4)\r\n"
                + "(r18, 4, 9, 6, 6 | r30, 9, 6, 4, 4)\r\n"
                + "(r18, 4, 9, 6, 6 | r5, 4, 4, 6, 6)\r\n"
                + "(r18, 4, 9, 6, 6 | r9, 6, 6, 4, 4)\r\n"
                + "(r19, 4, 10, 6, 6 | r11, 6, 15, 4, 4)\r\n"
                + "(r19, 4, 10, 6, 6 | r13, 5, 10, 5, 5)\r\n"
                + "(r19, 4, 10, 6, 6 | r15, 5, 10, 5, 5)\r\n"
                + "(r19, 4, 10, 6, 6 | r18, 4, 9, 6, 6)\r\n"
                + "(r19, 4, 10, 6, 6 | r20, 9, 15, 6, 6)\r\n"
                + "(r19, 4, 10, 6, 6 | r26, 6, 9, 4, 4)\r\n"
                + "(r19, 4, 10, 6, 6 | r27, 6, 10, 4, 4)\r\n"
                + "(r19, 4, 10, 6, 6 | r28, 6, 11, 4, 4)\r\n"
                + "(r19, 4, 10, 6, 6 | r29, 6, 12, 4, 4)\r\n"
                + "(r19, 4, 10, 6, 6 | r3, 5, 15, 5, 5)\r\n"
                + "(r19, 4, 10, 6, 6 | r38, 9, 15, 4, 4)\r\n"
                + "(r19, 4, 10, 6, 6 | r7, 4, 15, 6, 6)\r\n"
                + "(r2, 15, 5, 5, 5 | r10, 15, 6, 4, 4)\r\n"
                + "(r2, 15, 5, 5, 5 | r23, 10, 4, 6, 6)\r\n"
                + "(r2, 15, 5, 5, 5 | r24, 15, 9, 6, 6)\r\n"
                + "(r2, 15, 5, 5, 5 | r33, 12, 6, 4, 4)\r\n"
                + "(r2, 15, 5, 5, 5 | r34, 15, 9, 4, 4)\r\n"
                + "(r2, 15, 5, 5, 5 | r6, 15, 4, 6, 6)\r\n"
                + "(r20, 9, 15, 6, 6 | r11, 6, 15, 4, 4)\r\n"
                + "(r20, 9, 15, 6, 6 | r16, 10, 15, 5, 5)\r\n"
                + "(r20, 9, 15, 6, 6 | r17, 10, 15, 5, 5)\r\n"
                + "(r20, 9, 15, 6, 6 | r19, 4, 10, 6, 6)\r\n"
                + "(r20, 9, 15, 6, 6 | r21, 10, 15, 6, 6)\r\n"
                + "(r20, 9, 15, 6, 6 | r29, 6, 12, 4, 4)\r\n"
                + "(r20, 9, 15, 6, 6 | r3, 5, 15, 5, 5)\r\n"
                + "(r20, 9, 15, 6, 6 | r38, 9, 15, 4, 4)\r\n"
                + "(r20, 9, 15, 6, 6 | r39, 10, 15, 4, 4)\r\n"
                + "(r20, 9, 15, 6, 6 | r40, 11, 15, 4, 4)\r\n"
                + "(r20, 9, 15, 6, 6 | r41, 12, 15, 4, 4)\r\n"
                + "(r20, 9, 15, 6, 6 | r7, 4, 15, 6, 6)\r\n"
                + "(r21, 10, 15, 6, 6 | r12, 15, 15, 4, 4)\r\n"
                + "(r21, 10, 15, 6, 6 | r16, 10, 15, 5, 5)\r\n"
                + "(r21, 10, 15, 6, 6 | r17, 10, 15, 5, 5)\r\n"
                + "(r21, 10, 15, 6, 6 | r20, 9, 15, 6, 6)\r\n"
                + "(r21, 10, 15, 6, 6 | r25, 15, 10, 6, 6)\r\n"
                + "(r21, 10, 15, 6, 6 | r37, 15, 12, 4, 4)\r\n"
                + "(r21, 10, 15, 6, 6 | r38, 9, 15, 4, 4)\r\n"
                + "(r21, 10, 15, 6, 6 | r39, 10, 15, 4, 4)\r\n"
                + "(r21, 10, 15, 6, 6 | r4, 15, 15, 5, 5)\r\n"
                + "(r21, 10, 15, 6, 6 | r40, 11, 15, 4, 4)\r\n"
                + "(r21, 10, 15, 6, 6 | r41, 12, 15, 4, 4)\r\n"
                + "(r21, 10, 15, 6, 6 | r8, 15, 15, 6, 6)\r\n"
                + "(r22, 9, 4, 6, 6 | r1, 5, 5, 5, 5)\r\n"
                + "(r22, 9, 4, 6, 6 | r14, 10, 5, 5, 5)\r\n"
                + "(r22, 9, 4, 6, 6 | r18, 4, 9, 6, 6)\r\n"
                + "(r22, 9, 4, 6, 6 | r23, 10, 4, 6, 6)\r\n"
                + "(r22, 9, 4, 6, 6 | r26, 6, 9, 4, 4)\r\n"
                + "(r22, 9, 4, 6, 6 | r30, 9, 6, 4, 4)\r\n"
                + "(r22, 9, 4, 6, 6 | r31, 10, 6, 4, 4)\r\n"
                + "(r22, 9, 4, 6, 6 | r32, 11, 6, 4, 4)\r\n"
                + "(r22, 9, 4, 6, 6 | r33, 12, 6, 4, 4)\r\n"
                + "(r22, 9, 4, 6, 6 | r5, 4, 4, 6, 6)\r\n"
                + "(r22, 9, 4, 6, 6 | r9, 6, 6, 4, 4)\r\n"
                + "(r23, 10, 4, 6, 6 | r10, 15, 6, 4, 4)\r\n"
                + "(r23, 10, 4, 6, 6 | r14, 10, 5, 5, 5)\r\n"
                + "(r23, 10, 4, 6, 6 | r2, 15, 5, 5, 5)\r\n"
                + "(r23, 10, 4, 6, 6 | r22, 9, 4, 6, 6)\r\n"
                + "(r23, 10, 4, 6, 6 | r24, 15, 9, 6, 6)\r\n"
                + "(r23, 10, 4, 6, 6 | r30, 9, 6, 4, 4)\r\n"
                + "(r23, 10, 4, 6, 6 | r31, 10, 6, 4, 4)\r\n"
                + "(r23, 10, 4, 6, 6 | r32, 11, 6, 4, 4)\r\n"
                + "(r23, 10, 4, 6, 6 | r33, 12, 6, 4, 4)\r\n"
                + "(r23, 10, 4, 6, 6 | r34, 15, 9, 4, 4)\r\n"
                + "(r23, 10, 4, 6, 6 | r6, 15, 4, 6, 6)\r\n"
                + "(r24, 15, 9, 6, 6 | r10, 15, 6, 4, 4)\r\n"
                + "(r24, 15, 9, 6, 6 | r2, 15, 5, 5, 5)\r\n"
                + "(r24, 15, 9, 6, 6 | r23, 10, 4, 6, 6)\r\n"
                + "(r24, 15, 9, 6, 6 | r25, 15, 10, 6, 6)\r\n"
                + "(r24, 15, 9, 6, 6 | r33, 12, 6, 4, 4)\r\n"
                + "(r24, 15, 9, 6, 6 | r34, 15, 9, 4, 4)\r\n"
                + "(r24, 15, 9, 6, 6 | r35, 15, 10, 4, 4)\r\n"
                + "(r24, 15, 9, 6, 6 | r36, 15, 11, 4, 4)\r\n"
                + "(r24, 15, 9, 6, 6 | r37, 15, 12, 4, 4)\r\n"
                + "(r24, 15, 9, 6, 6 | r6, 15, 4, 6, 6)\r\n"
                + "(r25, 15, 10, 6, 6 | r12, 15, 15, 4, 4)\r\n"
                + "(r25, 15, 10, 6, 6 | r21, 10, 15, 6, 6)\r\n"
                + "(r25, 15, 10, 6, 6 | r24, 15, 9, 6, 6)\r\n"
                + "(r25, 15, 10, 6, 6 | r34, 15, 9, 4, 4)\r\n"
                + "(r25, 15, 10, 6, 6 | r35, 15, 10, 4, 4)\r\n"
                + "(r25, 15, 10, 6, 6 | r36, 15, 11, 4, 4)\r\n"
                + "(r25, 15, 10, 6, 6 | r37, 15, 12, 4, 4)\r\n"
                + "(r25, 15, 10, 6, 6 | r4, 15, 15, 5, 5)\r\n"
                + "(r25, 15, 10, 6, 6 | r41, 12, 15, 4, 4)\r\n"
                + "(r25, 15, 10, 6, 6 | r8, 15, 15, 6, 6)\r\n"
                + "(r26, 6, 9, 4, 4 | r1, 5, 5, 5, 5)\r\n"
                + "(r26, 6, 9, 4, 4 | r13, 5, 10, 5, 5)\r\n"
                + "(r26, 6, 9, 4, 4 | r15, 5, 10, 5, 5)\r\n"
                + "(r26, 6, 9, 4, 4 | r18, 4, 9, 6, 6)\r\n"
                + "(r26, 6, 9, 4, 4 | r19, 4, 10, 6, 6)\r\n"
                + "(r26, 6, 9, 4, 4 | r22, 9, 4, 6, 6)\r\n"
                + "(r26, 6, 9, 4, 4 | r27, 6, 10, 4, 4)\r\n"
                + "(r26, 6, 9, 4, 4 | r28, 6, 11, 4, 4)\r\n"
                + "(r26, 6, 9, 4, 4 | r29, 6, 12, 4, 4)\r\n"
                + "(r26, 6, 9, 4, 4 | r30, 9, 6, 4, 4)\r\n"
                + "(r26, 6, 9, 4, 4 | r5, 4, 4, 6, 6)\r\n"
                + "(r26, 6, 9, 4, 4 | r9, 6, 6, 4, 4)\r\n"
                + "(r27, 6, 10, 4, 4 | r13, 5, 10, 5, 5)\r\n"
                + "(r27, 6, 10, 4, 4 | r15, 5, 10, 5, 5)\r\n"
                + "(r27, 6, 10, 4, 4 | r18, 4, 9, 6, 6)\r\n"
                + "(r27, 6, 10, 4, 4 | r19, 4, 10, 6, 6)\r\n"
                + "(r27, 6, 10, 4, 4 | r26, 6, 9, 4, 4)\r\n"
                + "(r27, 6, 10, 4, 4 | r28, 6, 11, 4, 4)\r\n"
                + "(r27, 6, 10, 4, 4 | r29, 6, 12, 4, 4)\r\n"
                + "(r28, 6, 11, 4, 4 | r13, 5, 10, 5, 5)\r\n"
                + "(r28, 6, 11, 4, 4 | r15, 5, 10, 5, 5)\r\n"
                + "(r28, 6, 11, 4, 4 | r18, 4, 9, 6, 6)\r\n"
                + "(r28, 6, 11, 4, 4 | r19, 4, 10, 6, 6)\r\n"
                + "(r28, 6, 11, 4, 4 | r26, 6, 9, 4, 4)\r\n"
                + "(r28, 6, 11, 4, 4 | r27, 6, 10, 4, 4)\r\n"
                + "(r28, 6, 11, 4, 4 | r29, 6, 12, 4, 4)\r\n"
                + "(r29, 6, 12, 4, 4 | r11, 6, 15, 4, 4)\r\n"
                + "(r29, 6, 12, 4, 4 | r13, 5, 10, 5, 5)\r\n"
                + "(r29, 6, 12, 4, 4 | r15, 5, 10, 5, 5)\r\n"
                + "(r29, 6, 12, 4, 4 | r18, 4, 9, 6, 6)\r\n"
                + "(r29, 6, 12, 4, 4 | r19, 4, 10, 6, 6)\r\n"
                + "(r29, 6, 12, 4, 4 | r20, 9, 15, 6, 6)\r\n"
                + "(r29, 6, 12, 4, 4 | r26, 6, 9, 4, 4)\r\n"
                + "(r29, 6, 12, 4, 4 | r27, 6, 10, 4, 4)\r\n"
                + "(r29, 6, 12, 4, 4 | r28, 6, 11, 4, 4)\r\n"
                + "(r29, 6, 12, 4, 4 | r3, 5, 15, 5, 5)\r\n"
                + "(r29, 6, 12, 4, 4 | r38, 9, 15, 4, 4)\r\n"
                + "(r29, 6, 12, 4, 4 | r7, 4, 15, 6, 6)\r\n"
                + "(r3, 5, 15, 5, 5 | r11, 6, 15, 4, 4)\r\n"
                + "(r3, 5, 15, 5, 5 | r19, 4, 10, 6, 6)\r\n"
                + "(r3, 5, 15, 5, 5 | r20, 9, 15, 6, 6)\r\n"
                + "(r3, 5, 15, 5, 5 | r29, 6, 12, 4, 4)\r\n"
                + "(r3, 5, 15, 5, 5 | r38, 9, 15, 4, 4)\r\n"
                + "(r3, 5, 15, 5, 5 | r7, 4, 15, 6, 6)\r\n"
                + "(r30, 9, 6, 4, 4 | r1, 5, 5, 5, 5)\r\n"
                + "(r30, 9, 6, 4, 4 | r14, 10, 5, 5, 5)\r\n"
                + "(r30, 9, 6, 4, 4 | r18, 4, 9, 6, 6)\r\n"
                + "(r30, 9, 6, 4, 4 | r22, 9, 4, 6, 6)\r\n"
                + "(r30, 9, 6, 4, 4 | r23, 10, 4, 6, 6)\r\n"
                + "(r30, 9, 6, 4, 4 | r26, 6, 9, 4, 4)\r\n"
                + "(r30, 9, 6, 4, 4 | r31, 10, 6, 4, 4)\r\n"
                + "(r30, 9, 6, 4, 4 | r32, 11, 6, 4, 4)\r\n"
                + "(r30, 9, 6, 4, 4 | r33, 12, 6, 4, 4)\r\n"
                + "(r30, 9, 6, 4, 4 | r5, 4, 4, 6, 6)\r\n"
                + "(r30, 9, 6, 4, 4 | r9, 6, 6, 4, 4)\r\n"
                + "(r31, 10, 6, 4, 4 | r14, 10, 5, 5, 5)\r\n"
                + "(r31, 10, 6, 4, 4 | r22, 9, 4, 6, 6)\r\n"
                + "(r31, 10, 6, 4, 4 | r23, 10, 4, 6, 6)\r\n"
                + "(r31, 10, 6, 4, 4 | r30, 9, 6, 4, 4)\r\n"
                + "(r31, 10, 6, 4, 4 | r32, 11, 6, 4, 4)\r\n"
                + "(r31, 10, 6, 4, 4 | r33, 12, 6, 4, 4)\r\n"
                + "(r32, 11, 6, 4, 4 | r14, 10, 5, 5, 5)\r\n"
                + "(r32, 11, 6, 4, 4 | r22, 9, 4, 6, 6)\r\n"
                + "(r32, 11, 6, 4, 4 | r23, 10, 4, 6, 6)\r\n"
                + "(r32, 11, 6, 4, 4 | r30, 9, 6, 4, 4)\r\n"
                + "(r32, 11, 6, 4, 4 | r31, 10, 6, 4, 4)\r\n"
                + "(r32, 11, 6, 4, 4 | r33, 12, 6, 4, 4)\r\n"
                + "(r33, 12, 6, 4, 4 | r10, 15, 6, 4, 4)\r\n"
                + "(r33, 12, 6, 4, 4 | r14, 10, 5, 5, 5)\r\n"
                + "(r33, 12, 6, 4, 4 | r2, 15, 5, 5, 5)\r\n"
                + "(r33, 12, 6, 4, 4 | r22, 9, 4, 6, 6)\r\n"
                + "(r33, 12, 6, 4, 4 | r23, 10, 4, 6, 6)\r\n"
                + "(r33, 12, 6, 4, 4 | r24, 15, 9, 6, 6)\r\n"
                + "(r33, 12, 6, 4, 4 | r30, 9, 6, 4, 4)\r\n"
                + "(r33, 12, 6, 4, 4 | r31, 10, 6, 4, 4)\r\n"
                + "(r33, 12, 6, 4, 4 | r32, 11, 6, 4, 4)\r\n"
                + "(r33, 12, 6, 4, 4 | r34, 15, 9, 4, 4)\r\n"
                + "(r33, 12, 6, 4, 4 | r6, 15, 4, 6, 6)\r\n"
                + "(r34, 15, 9, 4, 4 | r10, 15, 6, 4, 4)\r\n"
                + "(r34, 15, 9, 4, 4 | r2, 15, 5, 5, 5)\r\n"
                + "(r34, 15, 9, 4, 4 | r23, 10, 4, 6, 6)\r\n"
                + "(r34, 15, 9, 4, 4 | r24, 15, 9, 6, 6)\r\n"
                + "(r34, 15, 9, 4, 4 | r25, 15, 10, 6, 6)\r\n"
                + "(r34, 15, 9, 4, 4 | r33, 12, 6, 4, 4)\r\n"
                + "(r34, 15, 9, 4, 4 | r35, 15, 10, 4, 4)\r\n"
                + "(r34, 15, 9, 4, 4 | r36, 15, 11, 4, 4)\r\n"
                + "(r34, 15, 9, 4, 4 | r37, 15, 12, 4, 4)\r\n"
                + "(r34, 15, 9, 4, 4 | r6, 15, 4, 6, 6)\r\n"
                + "(r35, 15, 10, 4, 4 | r24, 15, 9, 6, 6)\r\n"
                + "(r35, 15, 10, 4, 4 | r25, 15, 10, 6, 6)\r\n"
                + "(r35, 15, 10, 4, 4 | r34, 15, 9, 4, 4)\r\n"
                + "(r35, 15, 10, 4, 4 | r36, 15, 11, 4, 4)\r\n"
                + "(r35, 15, 10, 4, 4 | r37, 15, 12, 4, 4)\r\n"
                + "(r36, 15, 11, 4, 4 | r24, 15, 9, 6, 6)\r\n"
                + "(r36, 15, 11, 4, 4 | r25, 15, 10, 6, 6)\r\n"
                + "(r36, 15, 11, 4, 4 | r34, 15, 9, 4, 4)\r\n"
                + "(r36, 15, 11, 4, 4 | r35, 15, 10, 4, 4)\r\n"
                + "(r36, 15, 11, 4, 4 | r37, 15, 12, 4, 4)\r\n"
                + "(r37, 15, 12, 4, 4 | r12, 15, 15, 4, 4)\r\n"
                + "(r37, 15, 12, 4, 4 | r21, 10, 15, 6, 6)\r\n"
                + "(r37, 15, 12, 4, 4 | r24, 15, 9, 6, 6)\r\n"
                + "(r37, 15, 12, 4, 4 | r25, 15, 10, 6, 6)\r\n"
                + "(r37, 15, 12, 4, 4 | r34, 15, 9, 4, 4)\r\n"
                + "(r37, 15, 12, 4, 4 | r35, 15, 10, 4, 4)\r\n"
                + "(r37, 15, 12, 4, 4 | r36, 15, 11, 4, 4)\r\n"
                + "(r37, 15, 12, 4, 4 | r4, 15, 15, 5, 5)\r\n"
                + "(r37, 15, 12, 4, 4 | r41, 12, 15, 4, 4)\r\n"
                + "(r37, 15, 12, 4, 4 | r8, 15, 15, 6, 6)\r\n"
                + "(r38, 9, 15, 4, 4 | r11, 6, 15, 4, 4)\r\n"
                + "(r38, 9, 15, 4, 4 | r16, 10, 15, 5, 5)\r\n"
                + "(r38, 9, 15, 4, 4 | r17, 10, 15, 5, 5)\r\n"
                + "(r38, 9, 15, 4, 4 | r19, 4, 10, 6, 6)\r\n"
                + "(r38, 9, 15, 4, 4 | r20, 9, 15, 6, 6)\r\n"
                + "(r38, 9, 15, 4, 4 | r21, 10, 15, 6, 6)\r\n"
                + "(r38, 9, 15, 4, 4 | r29, 6, 12, 4, 4)\r\n"
                + "(r38, 9, 15, 4, 4 | r3, 5, 15, 5, 5)\r\n"
                + "(r38, 9, 15, 4, 4 | r39, 10, 15, 4, 4)\r\n"
                + "(r38, 9, 15, 4, 4 | r40, 11, 15, 4, 4)\r\n"
                + "(r38, 9, 15, 4, 4 | r41, 12, 15, 4, 4)\r\n"
                + "(r38, 9, 15, 4, 4 | r7, 4, 15, 6, 6)\r\n"
                + "(r39, 10, 15, 4, 4 | r16, 10, 15, 5, 5)\r\n"
                + "(r39, 10, 15, 4, 4 | r17, 10, 15, 5, 5)\r\n"
                + "(r39, 10, 15, 4, 4 | r20, 9, 15, 6, 6)\r\n"
                + "(r39, 10, 15, 4, 4 | r21, 10, 15, 6, 6)\r\n"
                + "(r39, 10, 15, 4, 4 | r38, 9, 15, 4, 4)\r\n"
                + "(r39, 10, 15, 4, 4 | r40, 11, 15, 4, 4)\r\n"
                + "(r39, 10, 15, 4, 4 | r41, 12, 15, 4, 4)\r\n"
                + "(r4, 15, 15, 5, 5 | r12, 15, 15, 4, 4)\r\n"
                + "(r4, 15, 15, 5, 5 | r21, 10, 15, 6, 6)\r\n"
                + "(r4, 15, 15, 5, 5 | r25, 15, 10, 6, 6)\r\n"
                + "(r4, 15, 15, 5, 5 | r37, 15, 12, 4, 4)\r\n"
                + "(r4, 15, 15, 5, 5 | r41, 12, 15, 4, 4)\r\n"
                + "(r4, 15, 15, 5, 5 | r8, 15, 15, 6, 6)\r\n"
                + "(r40, 11, 15, 4, 4 | r16, 10, 15, 5, 5)\r\n"
                + "(r40, 11, 15, 4, 4 | r17, 10, 15, 5, 5)\r\n"
                + "(r40, 11, 15, 4, 4 | r20, 9, 15, 6, 6)\r\n"
                + "(r40, 11, 15, 4, 4 | r21, 10, 15, 6, 6)\r\n"
                + "(r40, 11, 15, 4, 4 | r38, 9, 15, 4, 4)\r\n"
                + "(r40, 11, 15, 4, 4 | r39, 10, 15, 4, 4)\r\n"
                + "(r40, 11, 15, 4, 4 | r41, 12, 15, 4, 4)\r\n"
                + "(r41, 12, 15, 4, 4 | r12, 15, 15, 4, 4)\r\n"
                + "(r41, 12, 15, 4, 4 | r16, 10, 15, 5, 5)\r\n"
                + "(r41, 12, 15, 4, 4 | r17, 10, 15, 5, 5)\r\n"
                + "(r41, 12, 15, 4, 4 | r20, 9, 15, 6, 6)\r\n"
                + "(r41, 12, 15, 4, 4 | r21, 10, 15, 6, 6)\r\n"
                + "(r41, 12, 15, 4, 4 | r25, 15, 10, 6, 6)\r\n"
                + "(r41, 12, 15, 4, 4 | r37, 15, 12, 4, 4)\r\n"
                + "(r41, 12, 15, 4, 4 | r38, 9, 15, 4, 4)\r\n"
                + "(r41, 12, 15, 4, 4 | r39, 10, 15, 4, 4)\r\n"
                + "(r41, 12, 15, 4, 4 | r4, 15, 15, 5, 5)\r\n"
                + "(r41, 12, 15, 4, 4 | r40, 11, 15, 4, 4)\r\n"
                + "(r41, 12, 15, 4, 4 | r8, 15, 15, 6, 6)\r\n"
                + "(r5, 4, 4, 6, 6 | r1, 5, 5, 5, 5)\r\n"
                + "(r5, 4, 4, 6, 6 | r18, 4, 9, 6, 6)\r\n"
                + "(r5, 4, 4, 6, 6 | r22, 9, 4, 6, 6)\r\n"
                + "(r5, 4, 4, 6, 6 | r26, 6, 9, 4, 4)\r\n"
                + "(r5, 4, 4, 6, 6 | r30, 9, 6, 4, 4)\r\n"
                + "(r5, 4, 4, 6, 6 | r9, 6, 6, 4, 4)\r\n"
                + "(r6, 15, 4, 6, 6 | r10, 15, 6, 4, 4)\r\n"
                + "(r6, 15, 4, 6, 6 | r2, 15, 5, 5, 5)\r\n"
                + "(r6, 15, 4, 6, 6 | r23, 10, 4, 6, 6)\r\n"
                + "(r6, 15, 4, 6, 6 | r24, 15, 9, 6, 6)\r\n"
                + "(r6, 15, 4, 6, 6 | r33, 12, 6, 4, 4)\r\n"
                + "(r6, 15, 4, 6, 6 | r34, 15, 9, 4, 4)\r\n"
                + "(r7, 4, 15, 6, 6 | r11, 6, 15, 4, 4)\r\n"
                + "(r7, 4, 15, 6, 6 | r19, 4, 10, 6, 6)\r\n"
                + "(r7, 4, 15, 6, 6 | r20, 9, 15, 6, 6)\r\n"
                + "(r7, 4, 15, 6, 6 | r29, 6, 12, 4, 4)\r\n"
                + "(r7, 4, 15, 6, 6 | r3, 5, 15, 5, 5)\r\n"
                + "(r7, 4, 15, 6, 6 | r38, 9, 15, 4, 4)\r\n"
                + "(r8, 15, 15, 6, 6 | r12, 15, 15, 4, 4)\r\n"
                + "(r8, 15, 15, 6, 6 | r21, 10, 15, 6, 6)\r\n"
                + "(r8, 15, 15, 6, 6 | r25, 15, 10, 6, 6)\r\n"
                + "(r8, 15, 15, 6, 6 | r37, 15, 12, 4, 4)\r\n"
                + "(r8, 15, 15, 6, 6 | r4, 15, 15, 5, 5)\r\n"
                + "(r8, 15, 15, 6, 6 | r41, 12, 15, 4, 4)\r\n"
                + "(r9, 6, 6, 4, 4 | r1, 5, 5, 5, 5)\r\n"
                + "(r9, 6, 6, 4, 4 | r18, 4, 9, 6, 6)\r\n"
                + "(r9, 6, 6, 4, 4 | r22, 9, 4, 6, 6)\r\n"
                + "(r9, 6, 6, 4, 4 | r26, 6, 9, 4, 4)\r\n"
                + "(r9, 6, 6, 4, 4 | r30, 9, 6, 4, 4)\r\n"
                + "(r9, 6, 6, 4, 4 | r5, 4, 4, 6, 6)\n");
        systemOut().clearHistory();
    }


    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    public void testMain6() throws FileNotFoundException {
        String[] str4 = new String[1];
        str4[0] = "testDoc6.txt";
        Rectangle1.main(str4);
        assertEquals(systemOut().getHistory(), "Rectangle not removed: (r1)\r\n"
            + "Rectangle not removed: (r13)\r\n"
            + "Rectangle not removed: (r40)\r\n"
            + "Rectangle not removed: (r41)\r\n"
            + "Rectangle rejected: (t1, -10, 10, 5, 5)\r\n"
            + "Rectangle rejected: (t2, -10, 10, 1225, 5)\r\n"
            + "Rectangle rejected: (t3, -10, 10, 5, 1225)\r\n"
            + "Rectangle rejected: (t4, -10, 10, 1225, 1225)\r\n"
            + "Rectangle rejected: (t5, -10, -10, 5, 5)\r\n"
            + "Rectangle rejected: (t6, -10, -10, 1225, 5)\r\n"
            + "Rectangle rejected: (t7, -10, -10, 5, 1225)\r\n"
            + "Rectangle rejected: (t8, -10, -10, 1225, 1225)\r\n"
            + "Rectangle rejected: (t9, 10, -10, 5, 5)\r\n"
            + "Rectangle rejected: (t10, 10, -10, 1225, 5)\r\n"
            + "Rectangle rejected: (t11, 10, -10, 5, 1225)\r\n"
            + "Rectangle rejected: (t12, 10, -10, 1225, 1225)\r\n"
            + "Rectangle inserted: (t13, 10, 10, 1014, 10)\r\n"
            + "Rectangle inserted: (t14, 10, 10, 10, 1014)\r\n"
            + "Rectangle inserted: (t16, 10, 10, 1014, 1014)\r\n"
            + "Rectangles not found: (t9)\r\n"
            + "Rectangles not found: (t15)\r\n"
            + "Rectangles not found: (t17)\n");
        systemOut().clearHistory();
    }


    // KVPair class
    /**
     * This will test compareTo().
     */
    public void testPairCompareTo() {

        Rectangle rec1 = new Rectangle(3, 3, 5, 5);
        // KVPair<String, Rectangle> newPair1 = new KVPair<String, Rectangle>(
        // "rec1", rec1);
        KVPair<String, Rectangle> newPair2 = new KVPair<String, Rectangle>(
            "rec2", rec1);
        assertEquals(newPair2.compareTo(newPair2), 0);
    }


    /**
     * This will test compareTo().
     */
    public void testKeyCompareTo() {

        Rectangle rec1 = new Rectangle(3, 3, 5, 5);
        // KVPair<String, Rectangle> newPair1 = new KVPair<String, Rectangle>(
        // "rec1", rec1);
        KVPair<String, Rectangle> newPair2 = new KVPair<String, Rectangle>(
            "rec2", rec1);

        assertEquals(newPair2.key().compareTo(newPair2.key()), 0);
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
    public void testToString1() {

        Rectangle rec1 = new Rectangle(3, 3, 5, 5);
        KVPair<String, Rectangle> newPair1 = new KVPair<String, Rectangle>(
            "rec1", rec1);

        assertEquals(newPair1.toString(), "rec1, 3, 3, 5, 5");
    }


    // Rectangle class
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


    // SkipNode class
    /**
     * This will test the getPair() method.
     */
    public void testGetPair() {

        Rectangle newPairRec = new Rectangle(3, 3, 5, 5);
        SkipNode<String, Rectangle> newNode = new SkipNode<String, Rectangle>(
            "newPair", newPairRec, 3);
        assertTrue(newNode.getPair().key().equals("newPair"));
        String str = newNode.getPair().toString();
        assertTrue(str.equals("newPair, 3, 3, 5, 5"));
    }


    /**
     * This will test the getDepth() method.
     */
    public void testGetDepth() {

        Rectangle newPairRec = new Rectangle(3, 3, 5, 5);
        SkipNode<String, Rectangle> newNode = new SkipNode<String, Rectangle>(
            "newPair", newPairRec, 3);
        assertTrue(newNode.getDepth().equals("3"));
    }


    /**
     * This will test element() method.
     */
    public void testElement() {

        Rectangle newPairRec = new Rectangle(3, 3, 5, 5);
        SkipNode<String, Rectangle> newNode = new SkipNode<String, Rectangle>(
            "newPair", newPairRec, 3);
        assertTrue(newNode.element().equals(newPairRec));
    }


    /**
     * This will test key() method.
     */
    public void testKey() {

        Rectangle newPairRec = new Rectangle(3, 3, 5, 5);
        SkipNode<String, Rectangle> newNode = new SkipNode<String, Rectangle>(
            "newPair", newPairRec, 3);
        assertTrue(newNode.key().equals("newPair"));

    }

}
