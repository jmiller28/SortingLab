package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class Song implements Comparable<Song> {
    
    private String title;
    private String artist;
    private String alubum;
    private String length;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.title);
        hash = 53 * hash + Objects.hashCode(this.artist);
        hash = 53 * hash + Objects.hashCode(this.alubum);
        hash = 53 * hash + Objects.hashCode(this.length);
        return hash;
    }

    public Song(String title, String artist, String alubum, String length) {
        this.title = title;
        this.artist = artist;
        this.alubum = alubum;
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        if (!Objects.equals(this.alubum, other.alubum)) {
            return false;
        }
        if (!Objects.equals(this.length, other.length)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Song {" + "title = " + title + ", artist = " + artist + ", alubum = " + alubum + ", length = " + length + '}';
    }

    @Override
    public int compareTo(Song o) {

        return new CompareToBuilder()
                .append(this.artist, o.artist)
                .append(this.title, o.title)
                .append(this.alubum, o.alubum)
                .append(this.length, o.length)
                .toComparison();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlubum() {
        return alubum;
    }

    public String getLength() {
        return length;
    }

}
