package Assignment2;

public class Clock {
    private int hr=0;

    public Clock(){
        hr= 10;
    }
    public int getHour(){
        return hr;
    }

    public static void main(String[] args) {
        Clock a=new Clock();
        

        System.out.println(a.getHour());
    }
    
}
