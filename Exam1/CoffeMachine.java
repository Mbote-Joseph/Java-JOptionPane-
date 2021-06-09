package Exam1;

public class CoffeMachine {
    private double waterAmount;
    private double powderAmount;

    if(waterAmount == 10.5 && powderAmount == 0.15){
        String size= "Small";
    }else if(waterAmount == 21 && powderAmount ==0.3){
        String size= "Small";
    }

    public CoffeMachine(double w, double p){
        waterAmount=w;
        powderAmount=p;
    }
    public CoffeMachine(CoffeMachine otherCoffeMachine){
        waterAmount= otherCoffeMachine.waterAmount;
        powderAmount=otherCoffeMachine.powderAmount;
    }
    public String toString(){
        String str= "Coffee Machine : Water =" +waterAmount+" Coffee Powder = "+ powderAmount;
        return str; 
    }
    public void setWater(double water){
        if(water<=0.30){
            this.waterAmount=water;
        }else{
            System.out.println("The amount of water is too much ");
        }
        
    }
    public double getWater(){
        return waterAmount;
    }
    
    public String makeCoffee(double water, double powder){
        waterAmount= water;
        powderAmount=powder;

        if(waterAmount >=10.5){
            System.out.println("Enjoy your Coffee");
        }else{
            System.out.println("Cannot make coffee");
        }
      
    }

    public static void main(String[] args){
        CoffeMachine c1= new CoffeMachine(1,420);
        CoffeMachine c2= new CoffeMachine(c1);

        c1.waterAmount= c1.waterAmount +0.8;

        System.out.println(c1.toString());
    }
}
