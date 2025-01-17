package objects;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){     //Default constructor
        length = 0;
        width =0;
    }

    public Rectangle(double length, double width){     //Parameterized Constructor
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
}
