package Assignment2;


public class Point {

    public double x;
    public double y;

    public Point(){
        x=y=0;
    }
    public Point(double a, double b){
        x=a;
        y=b;
    }
    public Point(Point other) {
        x=other.x;
        y=other.y;
    }
    public void makeCopy(Point otherPoint){
        x=otherPoint.x;
        y=otherPoint.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double a){
        x=a;
    }
    public void setY(double b){
        y=b;
    } 
    public String toString(){
        return "The X value is :"+x+" and the y value is :"+y;
    }

    public static void main(String[] args) {
        Point one= new Point(4,6);
        Point two=new Point();
        two = one;
        System.out.println("For Point Two");
        System.out.println(two.getX());
        System.out.println(two.getY());

        Point three= new Point(one);

        System.out.println("\n");
        System.out.println("For Point Three");
        System.out.println(three.getX());
        System.out.println(three.getY());


        System.out.println(one.toString());



        
    }
    
}
