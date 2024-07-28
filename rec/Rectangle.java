package old.rec;

public class Rectangle {
    double width, height; 

    public Rectangle(){
        //default values
        width=1;
        height=1; 
    }
    public Rectangle (double newWidth, double newHeight){
        width = newWidth;
        height = newHeight; 
    }
    
    public static double getArea(double width, double height){
        double area = width * height ; 
        return area; 
    }
    public static double getPerimeter(double width, double height){
        double peri = 2*(width+height) ; 
        return peri; 
    }
    
    
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40); //call construct Rectangle()
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        
        //rectangle1.width=4;
        //rectangle1.height=40;  
        //rectangle2.width=3.5; 
        //rectangle2.height=35.9;
        
        System.out.println("the width of rectangle1: " + rectangle1.width);
        System.out.println("the height of rectangle1: " + rectangle1.height);
        System.out.println("the width of rectangle2: " + rectangle2.width);
        System.out.println("the height of rectangle2: " + rectangle2.height);
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("get the area for rectangle1: " + getArea(4,40));
        System.out.println("get the perimeter for rectangle1: " + getPerimeter(4,40));
        System.out.println("get the area for rectangle2: " + getArea(3.5,35.9));
        System.out.println("get the perimeter for rectangle2: " + getPerimeter(3.5,35.9));
        
    } 
}

