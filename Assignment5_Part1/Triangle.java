package Assignment5_Part1;

public class Triangle implements Shape
 {
    float area,perimeter,side1,side2,side3;

    public Triangle(float i, float j)
    {

        side1=i;
        side2=j;
        side3=(float)(Math.hypot(side1,side2));
    }

    @Override
    public float calculateShapeArea() 
    {
        area=(float)(0.5*side1*side2);
        return (float)area;
    }

    @Override
    public float calulateShapePerimeter() 
    {
        perimeter=(float)(side1+side2+side3);
        return perimeter;
    }

    public String toString()
    {
        return  "Dimensions of Triangle: "+side1+" x "+side2+" x "+side3+ "\n" +   
                "Area of Triangle: "+area+ "\n"+
                "Perimeter of Triangle: "+perimeter;
    }
}
