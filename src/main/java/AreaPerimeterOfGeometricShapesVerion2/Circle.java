package AreaPerimeterOfGeometricShapesVerion2;

public class Circle extends Shape implements Area {

    public  double radius;
    @Override
    public String getModel() {
        return "Circle";
    }
    public Circle(){}
    public Circle(double radius ) {

        if (radius <= 0 ) {
            throw new IllegalArgumentException("Circle radius must be more 0");
        } else {
            this.radius = radius;
        }
    }
    @Override
   public double area() {
     return (Math.PI * radius * radius);
   }



   public double perimeter() {
    return 2 * Math.PI * radius;
   }


}


