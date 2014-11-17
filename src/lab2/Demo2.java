package lab2;

import common.Song;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author jmiller
 */
public class Demo2 {
    public static void main(String[] args) {
        Song song1 = new Song("Lookin' for Me Somewhere", "BoDeans", "Love & Hope & Sex & Dreams", "3:01");
        Song song2 = new Song("Idaho", "BoDeans", "Go Slow Down", "4:39");
        Song song3 = new Song("Big Tall Pines", "Count This Penny", "Pitchman", "3:39");
        Song song4 = new Song("Drunken Poet's Dream", "Hayes Carll", "Trouble In Mind", "3:28");

        Map<String, Song> map = new HashMap<>();
        map.put("Lookin' for Me Somewhere", song1);
        map.put("Idaho", song2);
        map.put("Big Tall Pines", song3);
        map.put("Drunken Poet's Dream", song4);

        for (String key : map.keySet()) {
            System.out.println(map.get(key).toString());
        }

        Map<String, Song> map2 = new LinkedHashMap<>();
        map2.put("Lookin' for Me Somewhere", song1);
        map2.put("Idaho", song2);
        map2.put("Big Tall Pines", song3);
        map2.put("Drunken Poet's Dream", song4);

        for (String key : map2.keySet()) {
            System.out.println(map2.get(key).toString());
        }
    }
}
