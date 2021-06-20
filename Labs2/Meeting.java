public class Meeting {
    //data members 
    private Date mDate; 
    private Time mTime;
    private String mPlace;
    private String mTopic;
    private static int numberOfMeetings;
    //no param constructor
    //numberOfMeetings increment in the constructor
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
    //setters
    public void setAll(Date mDate, Time mTime, String mPlace, String mTopic){
        this.mDate = mDate;
        this.mTime = mTime;
        this.mPlace = mPlace;
        this.mTopic = mTopic;
    }
    //getters
    public String getmPlace() {
        return mPlace;
    }
    public String getmTopic() {
        return mTopic;
    }
    public static int getNumberOfMeetings() {
        return numberOfMeetings;
    }
    //toString method. return formatted values of data members
    @Override
    public String toString() {
       String str = "Meeting topic: " +this.mTopic+ "\n";
       str += "Meeting place: " +this.mPlace+ "\n";
       str += "Meeting date: " +String.format("%d/%d/%04d", mDate.getMonth(), mDate.getDay(), mDate.getYear())+ "\n";
       str += "Meeting time: " +String.format("%02d:%02d", mTime.getHour(), mTime.getMinute())+ "\n";
       return str;
    }
}
