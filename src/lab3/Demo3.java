package lab3;

import common.Song;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author jmiller
 */
public class Demo3 {
    public static void main(String[] args) {
        Song song1 = new Song("Lookin' for Me Somewhere", "BoDeans", "Love & Hope & Sex & Dreams", "3:01");
        Song song2 = new Song("Idaho", "BoDeans", "Go Slow Down", "4:39");
        Song song3 = new Song("Big Tall Pines", "Count This Penny", "Pitchman", "3:39");
        Song song4 = new Song("Drunken Poet's Dream", "Hayes Carll", "Trouble In Mind", "3:28");

        Map<String, Song> map = new TreeMap<>();
        map.put("Lookin' for Me Somewhere", song1);
        map.put("Idaho", song2);
        map.put("Big Tall Pines", song3);
        map.put("Drunken Poet's Dream", song4);

        for (String key : map.keySet()) {
            System.out.println(map.get(key).toString());
        }

        Collection<Song> songs = map.values();
        List<Song> sortedSongs = new ArrayList<>(songs);
        Collections.sort(sortedSongs);
        for(Song song : sortedSongs) {
            System.out.println(song);
        }
    }
}
