package day38_CustomClass.rectangleTask;

public class Rectangle {
    public double length ,width;
    public void setInfo(double length,double width){
        this. length=length;
        this.width=width;
    }
    public  double caculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2*(length+width);
    }
    public void getInfo(){
        System.out.println("length = " + length);
        System.out.println("length = " + length);
        System.out.println("Area = "+caculateArea());
        System.out.println("Perimeter = "+calculatePerimeter());
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + caculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}
