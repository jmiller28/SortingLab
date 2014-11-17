package lab4;

import common.Song;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jmiller
 */
public class Demo4 {
        public static void main(String[] args) {
        Song song1 = new Song("Lookin' for Me Somewhere", "BoDeans", "Love & Hope & Sex & Dreams", "3:01");
        Song song2 = new Song("Idaho", "BoDeans", "Go Slow Down", "4:39");
        Song song3 = new Song("Big Tall Pines", "Count This Penny", "Pitchman", "3:39");
        Song song4 = new Song("Drunken Poet's Dream", "Hayes Carll", "Trouble In Mind", "3:28");

        Set<Song> set = new TreeSet<>();
        set.add(song1);
        set.add(song2);
        set.add(song3);
        set.add(song4);

        for (Song song : set) {
            System.out.println(song);
        }
    }
}
