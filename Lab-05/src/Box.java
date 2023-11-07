import java.util.ArrayList;
public class Box implements ToBeStored {
    private double totalWeight;
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<CD> cds = new ArrayList<CD>();
    private double boxweight = 0;

    public Box(double maxweightstored){
        this.totalWeight = maxweightstored;
    }

    public double weight() {
        return this.boxweight;
    }
    public void add(Book book) {
        if (book.weight() + this.boxweight < this.totalWeight) {
            books.add(book);
            this.boxweight += book.weight();
        }
    }
    public void add(CD cd) {
        if (cd.weight() + this.boxweight < this.totalWeight) {
            cds.add(cd);
            this.boxweight += cd.weight();
        }
    }
    @Override
    public String toString(){
        return "Number of items: " + (books.size() + cds.size()) + ", Weight of the box: " + this.boxweight;
    }
}
