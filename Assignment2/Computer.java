package Assignment2;

import java.util.Scanner;

public class Computer {
	private String personName;
    private double cost;
    private double cpuSpeed;
    private int age;
    private int memorySize;

    public Computer() {
        personName = "";
        cost = 0;
        cpuSpeed = 0;
        age = 0;
        memorySize = 0;
    }

    public void setAll(String name, double cost, double speed, int age, int memory) {
        this.personName = name;
        this.cost = cost;
        this.cpuSpeed = speed;
        this.age = age;
        this.memorySize = memory;

    }


    public String toString() {

        return "Person Name: "+personName+", Cost: $"  + cost + ", Cpu Speed: "+cpuSpeed+"GHz, Age: "+age
                +" days, RAM: "+memorySize+"MB";
    }

    public int ageInYears(){

        return age;
    }

    public double sell(){

        if(age>2*365){
            return cost*0.5;
        }else{
            return cost*0.75;
        } 

    }

    public void print(){

        System.out.println(toString()+"\nSelling Price: $"+String.format("%.2f",sell()));
    }


	    public static void main(String[] args) {


	        Computer ali = new Computer();

	        Computer noDetails = new Computer();

	        Computer sumaya = new Computer();

	        ali.setAll("Ali", 4020.50, 2.4, 13, 128);

	        sumaya.setAll("Sumaya", 10000.25, 4.6, 890, 1000);


	        ali.print();

	        noDetails.print();

	        sumaya.print();


	        Scanner input = new Scanner(System.in);

	        System.out.println("Set Values for Computer two :");

	        System.out.print("Enter owner name: "); 
            String name = input.nextLine();

	        System.out.print("Enter cost: $"); 
            double cost = input.nextDouble();

	        System.out.print("Enter cpu speed: "); 
            double speed = input.nextDouble();

	        System.out.print("Enter age (in days): "); 
            int days = input.nextInt();

	        System.out.print("Enter RAM size (MB): "); 
            int memory = input.nextInt();


	        noDetails.setAll(name,cost,speed,days,memory);

	        noDetails.print();


	        System.out.println("Sumaya = " + sumaya);


	    }

	}

