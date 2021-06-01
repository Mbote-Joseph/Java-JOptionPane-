/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbote-joseph
 */
import javax.swing.*; //importing JOptionPane
//Main Class

class Main {

    public static void main(String[] args) {

    // prompts the user for nickname of car

        String name=JOptionPane.showInputDialog(null, "Enter the nickname of your Tesla car:");

        // prompts the user for year of car

        int year=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of years of the Tesla car:"));

        // creates new object of type Tesla

        Tesla t=new Tesla(name, year);

        // calls all the methods

        t.displayName();

        t.energy();

        t.year();

        name=JOptionPane.showInputDialog(null, "Enter the nickname of the Lamborghini car:");

        year=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of years of the Lamborghini car:"));

        // creates new object of type Lamborghini

        Lamborghini l=new Lamborghini(name, year);

        l.displayName();

        l.energy();

        l.year();

        

    }

}

//Create an interface with three methods. Of these, you will need to create one that displays the characteristics of the current object in a message dialog box. 

interface Car{

    public void displayName();

    public void energy();

    public int year();

}

// implements the Car interface

class Tesla implements Car{

    private String name;

    private int year;

    Tesla(String name, int year){

        this.name=name;

        this.year=year;

    }

    public void displayName(){

        JOptionPane.showMessageDialog(null, "Tesla name: "+name);

    }

    public void energy(){

        JOptionPane.showMessageDialog(null, "I use Electricity !");

    }

    public int year(){

        year++;

        JOptionPane.showMessageDialog(null, name+" is "+year+" now");

        return year;

    }

    /**

     * @return the year

     */

    public int getYears() {

        return year;

    }

    /**

     * @return the name

     */

    public String getName() {

        return name;

    }

    /**

     * @param year the year to set

     */

    public void setYears(int year) {

        this.year = year;

    }

    /**

     * @param name the name to set

     */

    public void setName(String name) {

        this.name = name;

    }

}




class Lamborghini implements Car{

    private String name;

    private int year;

    Lamborghini(String name, int year){

        this.name=name;

        this.year=year;

    }

    public void displayName(){

        JOptionPane.showMessageDialog(null, "Lamborghini name: "+name);

    }

    public int year(){

        year++;

        JOptionPane.showMessageDialog(null, name+" is "+year+" now");

        return year;

    }

    public void energy(){

        JOptionPane.showMessageDialog(null, "I use fuel energy !");

    }

    /**

     * @return the year

     */

    public int getYears() {

        return year;

    }

    /**

     * @return the name

     */

    public String getName() {

        return name;

    }

    /**

     * @param year the year to set

     */

    public void setYears(int year) {

        this.year = year;

    }

    /**

     * @param name the name to set

     */

    public void setName(String name) {

        this.name = name;

    }

    

}