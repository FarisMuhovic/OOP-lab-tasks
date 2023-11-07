public class CD implements ToBeStored{
    private String  artist;
    private String title;
    private int publishing_year;
    private double weight = 0.1;

    public CD(String artist,String title, int py) {
        this.artist = artist;
        this.title = title;
        this.publishing_year = py;
    }
    @Override
    public String toString() {
        return this.artist + " " + this.title + " " + this.publishing_year + " " + this.weight;
    }
    public double weight() {
        return this.weight;
    }
}
