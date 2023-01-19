import java.util.Random;
import student.TestableRandom;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai


/**
 * This is SkipList class.
 * 
 * @author guangkai
 * @version 1 9/4/2022 11:09 pm
 *
 * @param <K>
 *            as the key
 * @param <E>
 *            as the element
 */
public class SkipList<K extends Comparable<K>, E> {
    // Make this a private data member of the SkipList object
    private Random rnd; // Random number generator

    // Put this in the SkipList constructor
    // TestableRandom allows tests to be consistent instead of random. See
    // setNextBooleans()

    /**
     * Here classify SkipNode as protected.
     */
    protected SkipNode<K, E> head;
    private int level;
    private int size;

    /**
     * This will return the size of skiplist.
     * 
     * @param None
     * @return size as int
     */
    public int getSize() {
        return size;
    }


    /**
     * This will return the depth/level.
     * 
     * @param None
     * @return level as int
     */
    public int getLevel() {
        return level;
    }


    /**
     * Basic structure of SkipList.
     */
    public SkipList() {
        head = new SkipNode<K, E>(null, null, 1);
        level = -1;
        size = 0;
        rnd = new TestableRandom();
    }


    /**
     * Pick a level using a geometric distribution.
     * 
     * @param None
     * @return level as int
     */
    public int randomLevel() {

        int count = 0;
        for (@SuppressWarnings("unused")
            int lev = 0; rnd.nextBoolean(); lev++) {
            count++;
        }
        return count;
    }


    /**
     * Insert a key, element pair into the skip list as
     * where it should be.
     * 
     * @param key
     *            as the key
     * @param elem
     *            as the element
     */
    @SuppressWarnings("unchecked")
    public void insert(K key, E elem) {

        // New node's level
        int newLevel = randomLevel();
        // If new node is deeper
        if (newLevel > level) {
            // adjust the header
            adjustHead(newLevel);
        }
        SkipNode<String, Rectangle>[] update = new SkipNode[level + 1];
        // Start at header node
        SkipNode<K, E> x = head;
        for (int i = level; i >= 0; i--) {
            // Find insert position
            while ((x.getForward()[i] != null) && x.getForward()[i].key()
                .compareTo(key) < 0) {
                x = x.getForward()[i];
            }
            // Track end at level i
            update[i] = (SkipNode<String, Rectangle>)x;
        }
        x = new SkipNode<K, E>(key, elem, newLevel);

        // Splice into list
        for (int i = 0; i <= newLevel; i++) {
            // Who x points to
            x.getForward()[i] = (SkipNode<K, E>)update[i].getForward()[i];
            // Who points to x
            update[i].getForward()[i] = (SkipNode<String, Rectangle>)x;
        }
        // System.out.print(key);
        // Increment dictionary size
        size++;
    }


    /**
     * This is a helper method for adjust head
     * forward every time this method is called
     * in insert() method.
     * 
     * @param newLevel
     *            as int
     */
    private void adjustHead(int newLevel) {
        SkipNode<K, E> temp = head;
        head = new SkipNode<K, E>(null, null, newLevel);
        for (int i = 0; i <= level; i++) {
            head.getForward()[i] = temp.getForward()[i];
        }
        level = newLevel;
    }


    /**
     * Return all the elements in the list with their
     * depth/level.
     * 
     * @return a double stack string contains:
     *         First stack: element;
     *         Second stack: depth/level of element.
     */
    public String[][] dump() {

        String[][] str = new String[size + 1][2];
        // Dummy header node
        SkipNode<K, E> x = head;
        int count = 0;
        if (size != 0) {
            while (x.getForward()[0] != null) {
                x = x.getForward()[0];
                str[count + 1][0] = x.getPair().toString();
                str[count + 1][1] = x.getDepth();
                count++;
            }
        }
        count = 0;
        str[0][0] = "null";
        str[0][1] = head.getDepth();
        return str;
    }
    
    /**
     * Return the (first) matching matching element if one exists,
     * null otherwise.
     * 
     * @param input
     *            as a KVPair
     * @return key and element
     */
    public KVPair<K, E> removeByCoord(KVPair<K, E> input) {
        
        
        // Dummy header node
        SkipNode<K, E> x = head;
        K name = input.key();
        // kipNode<K, E> y = head;
        @SuppressWarnings("unchecked")
        SkipNode<K, E>[] update = new SkipNode[level + 1];

        // For each level...
        for (int i = level; i >= 0; i--) {

            while ((x.getForward()[i] != null) && 
                    (x.getForward()[i].key().compareTo(name)) < 0 &&
                    !((x.getForward()[i].element()).equals(input.value()))) {
                // Go forward
                x = x.getForward()[i];
            }
            update[i] = x;
        }

        // Move to actual record, if it exists
        x = x.getForward()[0];
        for (int i = 0; i < level; i++) {
            if (update[i].getForward()[i] != null) {
                if (update[i].getForward()[i].key().compareTo(x.key()) == 0) {
                    update[i].getForward()[i] = 
                        update[i].getForward()[i].getForward()[i];
                }
            }

        }
        
        size--;
        return input;
    }


    /**
     * Return the (first) matching matching element if one exists,
     * null otherwise.
     * 
     * @param key
     *            as the input
     * @return key and element
     */
    @SuppressWarnings("unchecked")
    public KVPair<K, E> removeByName(K key) {

        // Dummy header node
        SkipNode<K, E> x = head;
        // kipNode<K, E> y = head;
        SkipNode<K, E>[] update = new SkipNode[level + 1];

        // For each level...
        for (int i = level; i >= 0; i--) {

            while ((x.getForward()[i] != null) && 
                    (x.getForward()[i].key().compareTo(key)) < 0) {
                // Go forward
                x = x.getForward()[i];
            }
            update[i] = x;
        }

        // Move to actual record, if it exists
        x = x.getForward()[0];
        if (x == null || 
            x.key().compareTo(key) != 0)
            return null; // rectangle not found
        for (int i = 0; i < level; i++) {
            if (update[i].getForward()[i] != null) {
                if (update[i].getForward()[i].key().compareTo(x.key()) == 0) {
                    update[i].getForward()[i] = 
                        update[i].getForward()[i].getForward()[i];
                }
            }

        }
        
        size--;
        return x.getPair();

        // int count = x.getforward().length;
// for (int j = 0; j < size; j++) {
// for (int i = 0; i < y.getforward().length; i++) {
//
// if (y.getforward()[i] == null) {
// break;
// }
// if ((y.getforward()[i].key().compareTo(key)) == 0 && (Integer
// .parseInt(y.getDepth()) <= Integer.parseInt(x
// .getDepth()))) {
// y.getforward()[i] = x.getforward()[i];
// count--;
// }
// }
// if (count == 0) {
//
// break;
// }
// y = y.getforward()[0];
//
// if (y == null) {
// break;
// }
// /**
// * for (int j = 0; j < update.length; j++) {
// * //[j].getforward()[j] == x
// * if (j < Integer.valueOf(x.getDepth())) {
// * // Who points to x
// * update[j].getforward()[j]
// * = (SkipNode<String, Rectangle>)x.getforward()[j];
// * }
// * if (j == 0) {
// * update[j].getforward()[j] = null;
// * }
// * else {
// * update[j].getforward()[j] =
// * update[j].getforward()[j].getforward()[j];
// * }
// **/
// }
    }


    /**
     * Return the number of the node's key matched.
     * 
     * @param key
     *            as the input
     * @return i
     *              as a number
     */
    public int iterate(K key) {
        
        int i = 0;
        SkipNode<K, E> x = head;
        
        while (x.getForward()[0] != null) {

            if (x.getForward()[0].key().compareTo(key) != 0) {

                x = x.getForward()[0];
            }
            else {
                x = x.getForward()[0];
                i++;
            }
        }
        return i;
    }
    
    
    /**
     * Return the all matching matching element if its name matches,
     * null otherwise.
     * 
     * @param key
     *            as the input
     * @return output
     *                  as a object.
     */
    public Object[] search(K key) {

        // Dummy header node
        
        SkipNode<K, E> x = head;
        
        //int flag = 1;
        // For each level...
        int count = iterate(key);
        if (count == 0) {
            return null;
        }
        Object[] output = new Object[(count)];
        int i = 0;
        //x = x.getForward()[0];
        
        while (x.getForward()[0] != null) {

            if (x.getForward()[0].key().compareTo(key) != 0) {

                x = x.getForward()[0];
            }
            else {
                
                if (i < count) {
                    
                    x = x.getForward()[0];
                    output[i] = x.getPair().value();
                    
                    i++;
                }
            }
        }
        
        return output;
        
        /**
        @SuppressWarnings("unchecked")
        E[] output = (E[]) new Object[(count)];
        String[] output = new String[count];
        
        if (output.getforward()[0] == null) {
            return null;
        }
        output = holding;
        return output;

            
             * // Go one last step
             * x = x.getforward()[i];
             * 
             * for (int i = level; i >= 0; i--)
             * // Go forward
             * while ((x.getforward()[i] != null) && x.getforward()[i].key()
             * .compareTo(key) < 0) {
             * 
             * // Go one last step
             * x = x.getforward()[i];
             * }
             * // Move to actual record, if it exists
             * x = x.getforward()[0];
             * if ((x != null) && (x.key().compareTo(key)) == 0)
             * return x.getPair();
             * }
             * // else
             * // return null;
             **/

        /**
        x = head;
        if (count == 0)
            return null;
        int i = 0;
        
        KVPair<K, E>[] hold = new KVPair[count];
        while (x.getforward()[0] != null) {
            
            if (x.getforward()[0].key().compareTo(key) == 0 &&
                i < count) {
                
                hold[i] = x.getPair();
                i++;
            }

            x = x.getforward()[0];
        }
        
        return hold;
        **/
    }
}
