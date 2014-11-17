package common;

import java.util.Comparator;

/**
 *
 * @author jmiller
 */
public class SongByLength implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        return o1.getLength().compareTo(o2.getLength());
    }
    
}
