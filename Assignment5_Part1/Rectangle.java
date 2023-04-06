package Assignment5_Part1;

public class Rectangle implements Shape 
{
    float area,perimeter,len,breadth;

    public Rectangle(float i, float j)
    {

        len=i;
        breadth=j;
    }

    @Override
    public float calculateShapeArea() 
    {
        area=(float)(len*breadth);
        return (float)area;
    }

    @Override
    public float calulateShapePerimeter() 
    {
        perimeter=(float)(2*(len+breadth));
        return perimeter;
    }

    public String toString()
    {
        return  "Dimensions of Rectangle "+len+" x "+ breadth + "\n"+
                "Area of Rectangle: "+area+ "\n" +
                "Perimeter of Rectangle: "+perimeter + "\n";
    }
}