package Assignment5_Part1;

public class Circle implements Shape
 {
    float area,perimeter,rad;

    public Circle(float i){
        rad=i;
    }

    @Override
    public float calculateShapeArea() {
        area=(float)(Math.PI*Math.pow(rad,2));
        return (float)area;
    }

    @Override
    public float calulateShapePerimeter() {
        perimeter=(float)(2+Math.PI*rad);
        return perimeter;
    }

    public String toString()
    {
        return  "Radius of circle: "+rad+ "units" + "\n"+ 
                "Area of Circle: "+area+ "\n"+ 
                "Circumference of Circle: "+perimeter + "\n";

    }
}
