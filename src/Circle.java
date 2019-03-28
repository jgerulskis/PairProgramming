class Circle{
    double radius;
    public Circle(double r){
        this.radius = r;
    }
    double getPerimeter(){
        return 2 * this.radius * 3.14;
    }
    double getArea(){
        return 3.14 * (this.radius * this.radius);
    }
}