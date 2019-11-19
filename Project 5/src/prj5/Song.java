/**
 * Virginia Tech Honor Code Pledge:
 *
 * As a Hokie, I will conduct myself with honor
 * and integrity at all times.
 * I will not lie, cheat, or steal, nor will I
 * accept the actions of those who do.
 * -- Allison Woods (awoods99)
 * --
 * --
 */
package prj5;

import java.util.Comparator;

/**
 * 
 * 
 * @author
 * @author Luke Hall (lukeh)
 * @author Allison Woods (awoods99)
 * @version 11/15/2019
 */
public class Song implements Comparable<Song> {

    /**
     * f
     */
    private String name;
    /**
     * f
     */
    private String artist;
    /**
     * f
     */
    private int year;
    /**
     * f
     */
    private String genre;


    /**
     * 
     * 
     * @param songName
     * @param songArtist
     * @param songYear
     * @param songGenre
     */
    public Song(
        String songName,
        String songArtist,
        int songYear,
        String songGenre) {
        name = songName;
        artist = songArtist;
        year = songYear;
        genre = songGenre;
    }


    /**
     * 
     * 
     * @return
     */
    public String getName() {
        return this.name;
    }


    /**
     * 
     * 
     * @return
     */
    public String getArtist() {
        return this.artist;
    }


    /**
     * 
     * 
     * @return
     */
    public int getYear() {
        return this.year;
    }


    /**
     * 
     * 
     * @return
     */
    public String getGenre() {
        return this.genre;
    }


    /**
     * 
     * 
     * @return
     */
    public String toString() {
        return (getName() + " by: " + getArtist() + ", released: " + getYear()
            + " in genre " + getGenre());
    }


    /**
     * 
     * 
     * @param obj
     * @return
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (this.getClass() == obj.getClass()) {
            Song song = (Song)obj;
            return (this.getName().equals(song.getName()) && this.getArtist()
                .equals(song.getArtist()) && this.getYear() == song.getYear()
                && this.getGenre().equals(song.getGenre()));
        }
        else {
            return false;
        }
    }
    
    @Override
    /**
     * f
     */
    public int compareTo(Song s)
    {
        return (this.getGenre().compareTo(s.getGenre()));
    }
    
    /**
     * f
     */
    public static Comparator<Song> CompareByTitle = new Comparator<Song>()
    {
        public int compare(Song s, Song s2)
        {
            return (s.getName().compareTo(s2.getName()));
        }
    };
}

