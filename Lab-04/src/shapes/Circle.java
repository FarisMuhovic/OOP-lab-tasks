package shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, FillType fillType, double radius) {
        super(color,fillType);
        this.radius = radius;
    }
    public void displayInfo() {
        System.out.print(this.getColor() + '-' + this.getFillType() +' ' + this.radius);
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
    public double calculateCircumference(double PI, double r) {
        return PI * 2 * this.radius;
    }
    public double calculateCircumference( double r) {
        return Math.PI * 2 * this.radius;
    }

}
