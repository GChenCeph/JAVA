// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is Rectangle class.
 * 
 * @author guangkai
 * @version 1 9/4/2022 11:01 pm
 */
public class Rectangle {

    private int x;
    private int y;
    private int w;
    private int h;

    /**
     * This will hold the value of input.
     * 
     * @param a
     *            as int
     * @param b
     *            as int
     * @param c
     *            as int
     * @param d
     *            as int
     */
    public Rectangle(int a, int b, int c, int d) {
        x = a;
        y = b;
        w = c;
        h = d;
    }


    /**
     * This will return x of the rectangle.
     * 
     * @return x as int.
     */
    public int getX() {
        return x;
    }


    /**
     * This will return y of the rectangle.
     * 
     * @return y as int.
     */
    public int getY() {
        return y;
    }


    /**
     * This will return w of the rectangle.
     * 
     * @return w as int.
     */
    public int getW() {
        return w;
    }


    /**
     * This will return h of the rectangle.
     * 
     * @return h as int.
     */
    public int getH() {
        return h;
    }


    /**
     * This will determine if 2 rectangle intersects.
     * 
     * @param other
     *            as another Rectangle.
     * @return true if 2 rectangle intersected;
     *         false if not.
     */
    public boolean isOverlapping(Rectangle other) {

        return (this.x < (other.x + other.w) && (this.x + this.w) > other.x
            && (this.y < (other.y + other.h)) && (this.y + this.h) > other.y);
    }


    /**
     * This will determine if 2 rectangle intersects.
     * 
     * @param o as another Rectangle.
     * @return true if 2 rectangle intersected;
     *         false if not.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle other = (Rectangle) o;

        return this.x == other.x && this.y == other.y && this.h == other.h
            && this.w == other.w;
    }


    /**
     * This will return a string for the numbers.
     * 
     * @return str contains x, y, w, and h.
     */
    public String toString() {
        return x + ", " + y + ", " + w + ", " + h;
    }
}
