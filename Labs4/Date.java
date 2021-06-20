public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1;
    }
   
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


public class Time {
    private int hour;
    private int minute;

    public Time() {
        this.hour = 1;
        this.minute = 1; 
    }
   
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
   
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    } 
}



public class Meeting {
    private Date mDate;
    private Time mTime;
    private String mPlace;
    private String mTopic;
    private static int numberOfMeetings;
   
    public Meeting() {
        numberOfMeetings++;
    }
    public Meeting(Date mDate, Time mTime, String mPlace, String mTopic) {
        this.mDate = mDate;
        this.mTime = mTime;
        this.mPlace = mPlace;
        this.mTopic = mTopic;
        numberOfMeetings++;
    }
    
    public void setAll(Date mDate, Time mTime, String mPlace, String mTopic){
        this.mDate = mDate;
        this.mTime = mTime;
        this.mPlace = mPlace;
        this.mTopic = mTopic;
    }
   
    public String getmPlace() {
        return mPlace;
    }
    public String getmTopic() {
        return mTopic;
    }
    public static int getNumberOfMeetings() {
        return numberOfMeetings;
    }
    @Override
    public String toString() {
       String str = "Meeting topic: " +this.mTopic+ "\n";
       str += "Meeting place: " +this.mPlace+ "\n";
       str += "Meeting date: " +String.format("%d/%d/%04d", mDate.getMonth(), mDate.getDay(), mDate.getYear())+ "\n";
       str += "Meeting time: " +String.format("%02d:%02d", mTime.getHour(), mTime.getMinute())+ "\n";
       return str;
    }
}


public class MeetingTest{

    public static void main(String[] args) {
       
        Meeting meeting1 = new Meeting(new Date(11, 2, 2019), new Time(13, 30), "room 1011", "College Meeting");
        Meeting meeting2 = new Meeting(new Date(40, 1, 2020), new Time(25, 00), "room 2022", "Project Presentation");
        Meeting meeting3 = new Meeting(new Date(10, 2, 2019), new Time(13, 00), "room 3033", "College Meeting 2");
  
        System.out.println(meeting1);
        System.out.println(meeting2);
        System.out.println(meeting3);
        meeting2.setAll(new Date(4, 1, 2020), new Time(23, 00), "room 2022", "Project Presentation");

        System.out.println(meeting1);
        System.out.println(meeting2);
        System.out.println(meeting3);
        
        System.out.println("Number of meetings: " +Meeting.getNumberOfMeetings());
    }
}
// Step-by-step explanation
// run:
// Meeting topic: College Meeting
// Meeting place: room 1011
// Meeting date: 2/11/2019
// Meeting time: 13:30

// Meeting topic: Project Presentation
// Meeting place: room 2022
// Meeting date: 1/1/2020
// Meeting time: 01:00

// Meeting topic: College Meeting 2
// Meeting place: room 3033
// Meeting date: 2/10/2019
// Meeting time: 13:00

// Meeting topic: College Meeting
// Meeting place: room 1011
// Meeting date: 2/11/2019
// Meeting time: 13:30

// Meeting topic: Project Presentation
// Meeting place: room 2022
// Meeting date: 1/4/2020
// Meeting time: 23:00

// Meeting topic: College Meeting 2
// Meeting place: room 3033
// Meeting date: 2/10/2019
// Meeting time: 13:00

// Number of meetings: 3
// BUILD SUCCESSFUL (total time: 0 seconds)
// Comments (1)

