package lab6;

import common.Song;
import common.SongByLength;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jmiller
 */
public class Demo6 {

    public static void main(String[] args) {
        Song song1 = new Song("Lookin' for Me Somewhere", "BoDeans", "Love & Hope & Sex & Dreams", "3:01");
        Song song2 = new Song("Idaho", "BoDeans", "Go Slow Down", "4:39");
        Song song3 = new Song("Big Tall Pines", "Count This Penny", "Pitchman", "3:39");
        Song song4 = new Song("Drunken Poet's Dream", "Hayes Carll", "Trouble In Mind", "3:28");

        List<Song> list = new ArrayList<>();
        list.add(song1);
        list.add(song2);
        list.add(song3);
        list.add(song4);

        Collections.sort(list, new SongByLength());

        for (Song song : list) {
            System.out.println(song);
        }
    }
}
