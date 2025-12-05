package rvt;

public class Chapter_50 {
    public static void main(String[] args) {
    Box box = new Box( 2.5, 5.0, 6.0 );
    System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );
    System.out.println( "topArea: "  + box.topArea() );

    Box oldbox = new Box(box);
    System.out.println( "Area: "  + oldbox.area() + " volume: " + oldbox. volume() );
    System.out.println( "topArea: "  + oldbox.topArea() );
    
    System.out.println("Smaller Box width: " + box.smallerBox(oldbox).width + "\nSmaller Box height: " + box.smallerBox(oldbox).height + "\nSmaller Box length: " +  box.smallerBox(oldbox).length);
    Box insideBox = new Box(2.0, 4.0 , 5.0);
    Box outsideBox = new Box(3.0, 5.0, 6.0);
    System.out.print("Box 1 nests in Box 2?: ");
    System.out.println(insideBox.nests(outsideBox));
}
    static class Box{
    double width, height, length;
    double volume;
    double area;
    private double faceArea, topArea, sideArea;
    
    public Box(double width,double height,double length ){
        
        faceArea = faceArea();
        topArea = topArea();
        sideArea = sideArea();

        volume = width * height * length;
        area = width * length;

        this.width = width;
        this.height = height;
        this.length = length;
    }
    double volume(){
        return volume;
    }
    double faceArea(){
        return width * height;
    }
    double topArea(){
        return width * length;
    }
    double sideArea(){
        return height * length;
    }
    double area()
{
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;              
}
    public Box( Box oldBox){
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;

        volume = width * height * length;
        
        faceArea = faceArea();
        topArea = topArea();
        sideArea = sideArea();

    }
    
    public Box biggerBox( Box oldBox ){
        return new Box( 1.25*oldBox.width, 1.25*oldBox.height, 1.25*oldBox.length);
}

    public Box smallerBox( Box oldBox ){
        return new Box( 0.75*oldBox.width, 0.75*oldBox.height, 0.75*oldBox.length);
}
    public boolean nests( Box outsideBox ){
        if (this.width <= outsideBox.width && this.height <= outsideBox.height && this.length <= outsideBox.length){
            return true;
        } else{
            return false;
        }
    }





}
}
