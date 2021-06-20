
public class Time {
    //data members
    private int hour;
    private int minute;
    //set data members to default values
    public Time() {
        this.hour = 1;
        this.minute = 1; 
    }
    //we validate values before setting
    //if invalid then we set data members to default values
    public Time(int hour, int minute) {
        if(hour >= 0 && hour <= 23){
            this.hour = hour;
        }else{
            this.hour = 1;
        }
        if(minute >= 0 && minute <= 59){
            this.minute = minute;
        }else{
            this.minute = 1;
        }
    }
    //setter
    public void setAll(int hour, int minute){
        if(hour >= 0 && hour <= 23){
            this.hour = hour;
        }else{
            this.hour = 1;
        }
        if(minute >= 0 && hour <= 59){
            this.minute = hour;
        }else{
            this.minute = 1;
        }
    }
    //getter methods
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    } 
}

