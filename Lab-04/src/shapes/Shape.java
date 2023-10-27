package shapes;

public class Shape {
    private String color;
    private FillType fillType;

    public Shape(String color, FillType fillType) {
        this.color = color;
        this.fillType = fillType;
    }
    public String getColor() {
        return this.color ;
    }
    public FillType getFillType() {
        return this.fillType;
    }
    public void displayInfo() {
        System.out.print(this.color + '-' + this.fillType);
    }
    public double getArea(){
        return 0.0;
    }

}
