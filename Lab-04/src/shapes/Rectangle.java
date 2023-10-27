package shapes;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(String c, FillType f, double w, double h) {
        super(c,f);
        this.width = w;
        this.height = h;
    }
    public void displayInfo() {
        System.out.print(this.getColor() + '-' + this.getFillType() + '-' + this.width + '-'+ this.height);
    }
    public double getArea(){
        return this.width * this.height;
    }
}


