package Assignment2;

public class Vehicle {
    private String name="";
    private int wheels=0;
    private String color="";


    public Vehicle(){
        name="Bus";
        wheels=6;
        color="white";
    }
    public Vehicle(String n, int w, String c){
        name=n;
        wheels=w;
        color=c;
    }
    public int getWheels(){
        return wheels;
    }
    public void setWheels(int w){
        wheels=w;
    }
    public String toString(){
        String str= "The "+name+" vehicle has a color of "+color+ " and has "+ wheels +" wheels.";
        return str;
    }
    public static void main(String[] args){
        Vehicle lambo= new Vehicle("Lamborghini", 4, "Red");
        lambo.toString();
        System.out.println(lambo.toString());
    }
    
}
