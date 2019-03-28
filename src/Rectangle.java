public class Rectangle {

    private double height;
    private double width;

    public double getArea(){
        retunr height * width;
    }

    public double getPerimeter(){
        return (height * 2) + (width * 2);
    }

    public Rectangle(double length, double width){
        this.height = length;
        this.width = width;
    }
}