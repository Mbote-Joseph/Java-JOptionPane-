import Lab3.Meeting;

public class MeetingMain {

    public static void main(String[] args) {
        //we create 3 Meeting objects
        Meeting meeting1 = new Meeting(new Date(11, 2, 2019), new Time(13, 30), "room 1011", "College Meeting");
        Meeting meeting2 = new Meeting(new Date(40, 1, 2020), new Time(25, 00), "room 2022", "Project Presentation");
        Meeting meeting3 = new Meeting(new Date(10, 2, 2019), new Time(13, 00), "room 3033", "College Meeting 2");
        //print data member values
        System.out.println(meeting1);
        System.out.println(meeting2);
        System.out.println(meeting3);
        meeting2.setAll(new Date(4, 1, 2020), new Time(23, 00), "room 2022", "Project Presentation");
        //print data member values
        System.out.println(meeting1);
        System.out.println(meeting2);
        System.out.println(meeting3);
        //meeting2's date and time should be invalid. month is set to 40 which is invalid
        //and hour is set to 25 which is also invalid
        //those values are going to be set to 1 when it is validated inside the constructor and setAll methods
        //We update meeting2 to correct dates and hour afterwards
        System.out.println("Number of meetings: " +Meeting.getNumberOfMeetings());
    }
}
