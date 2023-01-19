import java.util.Scanner;
import java.io.*;

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
 * @version 1 9/4/2022 10:59 pm
 */
public class Rectangle1 {

    /**
     * This is the main() method to run the
     * whole program.
     * 
     * @param args
     *            as the lines in file.
     * @throws FileNotFoundException
     *             if no file read
     */
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File(args[0]);

        // Read strings or number in line
        @SuppressWarnings("resource")
        Scanner read = new Scanner(f);
        String line;

        SkipList<String, Rectangle> list = new SkipList<>();
        while (read.hasNextLine()) {
            line = read.nextLine();

            if (line.isBlank()) {
                continue;
            }

            String[] splited = line.trim().split(" +\t*");
            String command = splited[0];
            
            // insert
            if (command.equals("insert")) {
                String name = splited[1];
                int x = Integer.parseInt(splited[2]);
                int y = Integer.parseInt(splited[3]);
                int w = Integer.parseInt(splited[4]);
                int h = Integer.parseInt(splited[5]);

                Rectangle z = new Rectangle(x, y, w, h);

                if (x < 0 ||
                    y < 0 ||
                    w <= 0 ||
                    h <= 0 ||
                    x + w > 1024 ||
                    y + h > 1024) {
                    System.out.println("Rectangle rejected: (" + name + ", " + z
                        .toString() + ")");
                }
                else {
                    list.insert(name, z);
                    System.out.println("Rectangle inserted: (" + name + ", " + z
                        .toString() + ")");
                }
            }
            // dump
            else if (command.equals("dump")) {
                System.out.println("SkipList dump:");
                String[][] out = list.dump();
                int stringLength = out.length;
                for (int i = 0; i < stringLength; i++) {
                    System.out.println("Node has depth " + out[i][1]
                        + ", Value " + " " + "(" + out[i][0] + ")");
                }
                System.out.println("SkipList size is: " + list.getSize());
            }
            // remove by name
            else if (command.equals("remove")) {
                if (splited.length == 2) {
                    String name = splited[1];
                    KVPair<String, Rectangle> thing = list.removeByName(name);
                    if (thing != null) {
                        System.out.println("Rectangle removed: (" + thing
                            .toString() + ")");
                    }
                    else {
                        System.out.println("Rectangle not removed: " + "("
                            + name + ")");
                    }
                }
                // removeByCoord
                else if (splited.length == 5) {
                    int x = Integer.parseInt(splited[1]);
                    int y = Integer.parseInt(splited[2]);
                    int w = Integer.parseInt(splited[3]);
                    int h = Integer.parseInt(splited[4]);
                    SkipNode<String, Rectangle> temp = 
                        list.head.getForward()[0];
                    String nameWeNeed = "";
                    
                    while (temp != null) {
                        if (temp.element().getX() == x && 
                            temp.element().getY() == y && 
                            temp.element().getW() == w && 
                            temp.element().getH() == h) {
                            
                            nameWeNeed = temp.key();
                            break;
                        }
                        else {
                            
                            temp = temp.getForward()[0];
                        }
                    }
                    if (nameWeNeed.equals("")) {
                        
                        System.out.println("Rectangle rejected: (" + x
                            + ", " + y + ", " + w + ", " + h + ")");
                    }
                    else {

                        Rectangle rec = new Rectangle(x, y, w, h);
                        KVPair<String, Rectangle> inputRec =
                            new KVPair<String, Rectangle>(nameWeNeed, rec);

                        KVPair<String, Rectangle> result = 
                            list.removeByCoord(inputRec);

                        System.out.println("Rectangle removed: ("
                            + result.toString() + ")");
                    }
                }
            }
            // regionsearch
            else if (command.equals("regionsearch")) {
                int x = Integer.parseInt(splited[1]);
                int y = Integer.parseInt(splited[2]);
                int w = Integer.parseInt(splited[3]);
                int h = Integer.parseInt(splited[4]);
                Rectangle compared = new Rectangle(x, y, w, h);
                SkipNode<String, Rectangle> temp = list.head.getForward()[0];

                if (w > 0 && h > 0) {
                    System.out.println("Rectangles intersecting region (" + x
                        + ", " + y + ", " + w + ", " + h + "):");
                    while (temp != null) {
                        if (temp.element().isOverlapping(compared)) {
                            System.out.println("(" + temp.getPair().toString()
                                + ")");
                        }
                        temp = temp.getForward()[0];

                    }
                }
                else {
                    System.out.println("Rectangle rejected: (" + x + ", " + y
                        + ", " + w + ", " + h + ")");
                }
            }

            // intersections
            else if (command.equals("intersections")) {
                SkipNode<String, Rectangle> temp = list.head.getForward()[0];
                SkipNode<String, Rectangle> compared = list.head
                    .getForward()[0];
                System.out.println("Intersections pairs:");
                while (compared != null) {
                    while (temp != null) {
                        if (temp.element().isOverlapping(compared.element())
                            && temp.getPair().key() != compared.getPair()
                                .key()) {
                            System.out.println("(" + compared.getPair()
                                .toString() + " | " + temp.getPair().toString()
                                + ")");
                        }
                        temp = temp.getForward()[0];
                    }
                    temp = list.head.getForward()[0];
                    compared = compared.getForward()[0];
                }
            }
            // search
            else if (command.equals("search")) {
                // Search
                String name = splited[1];
                Object[] z = list.search(name);
                if (z == null) {
                    System.out.println("Rectangles not found:" + " " + "("
                        + name + ")");
                }

                else {

                    System.out.println("Rectangles found:");
                    int i = 0;
                    while (i < z.length) {

                        System.out.println("(" + name + ", " 
                            + z[i].toString() + ")");
                        i++;
                    }
                }
            }
            else {
                return;
            }
        }
    }
}
