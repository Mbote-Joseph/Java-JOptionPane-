public class Date {
    //data members
    private int day;
    private int month;
    private int year;
    //no param constructor
    //we set data members to default values
    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1;
    }
    //with param constructor
    //we validate each values to be set
    //if not valid then we set to default value of 1
    public Date(int day, int month, int year) {
        if(day >= 1 && day <= 31){
            this.day = day;
        }else{
            this.day = 1;
        }
        if(month >= 1 && month <= 12){
            this.month = month;
        }else{
            this.month = 1;
        }
        if(year >= 1){
            this.year = year;
        }else{
            this.year = 1;
        }
    }
    //our setter method
    private void setAll(int day, int month, int year){
        if(day >= 1 && day <= 31){
            this.day = day;
        }else{
            this.day = 1;
        }
        if(month >= 1 && month <= 12){
            this.month = month;
        }else{
            this.month = 1;
        }
        if(year >= 1){
            this.year = year;
        }else{
            this.year = 1;
        }
    }
    //getter methods
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
}
