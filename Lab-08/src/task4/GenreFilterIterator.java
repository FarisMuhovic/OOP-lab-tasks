package task4;

import java.util.*;

public class GenreFilterIterator implements Iterator<Song> {
    private List<Song> playlist = new ArrayList<>();
    private String targetGenre;
    private int currentIndex = 0;
    public GenreFilterIterator(List<Song> playlist, String targetGenre) {
        this.playlist = playlist;
        this.targetGenre = targetGenre;
    }

    @Override
    public boolean hasNext() {
        while ((currentIndex < playlist.size() ) && !playlist.get(currentIndex).getGenre().equals(targetGenre)) {
            currentIndex++;
        }
        return currentIndex < playlist.size();
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Song ob = playlist.get(currentIndex);
        currentIndex++;
        return ob;
    }
}
