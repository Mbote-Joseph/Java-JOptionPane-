package Multipleclasses;

import java.util.Date;

public class Actor {
    public static int length;
    private String name;
    private int yob;
    public int starCount;

    public Actor(String n , int y){
        this.name= n;
        this.yob=y;
    }

    public int getAge(){
        Date d=new Date();
        int year=d.getYear() + 1900;
        int age= year -this.yob;
        return  age;
    }
    public String toString(){
        String str= name + " - "+ yob;
        return str;
    }
}
