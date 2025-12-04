package rvt;

public class Chapter_50 {
    public static void main(String[] args) {
    Box box = new Box( 2.5, 5.0, 6.0 );
    System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );
    System.out.println( "length: " + box.length + " height: " + box. height + "width:  " + box.width )  ;
    }
    static class Box{
    double width, height, length;
    double volume;
    double area;

    public Box(double width,double height,double length ){
        volume = width * height * length;
        area = width * length;
        
    }
    double volume(){
        return volume;
    }
    double area(){
        return area;
    }
    
}
}
