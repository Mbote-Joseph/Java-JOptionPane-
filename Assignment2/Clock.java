package Assignment2;

public class Clock {
    private int hr=0;
    private int min=0;
    private int sec=0;

    public Clock(){
        hr= 10;
        min=30;
        sec=55;
    }
    public Clock(int h, int m, int s){
        hr= h;
        min=m;
        sec=s;
    }
    public int getHour(){
        return hr;
    }

    public static void main(String[] args) {
        Clock a=new Clock();
        

        System.out.println(a.getHour());
    }
    
}
