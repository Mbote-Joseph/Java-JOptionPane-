package Labs;

import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class MeetinInfo{
   private String topic;
   private String location;
   private String time;
   private String date;
  
   public MeetinInfo(String topic, String location, String time, String date) {
       super();
       this.topic = topic;
       this.location = location;
       this.time = time;
       this.date = date;
   }

   @Override
   public String toString() {
       return "MeetinInfo [topic=" + topic + ", location=" + location + ", time=" + time + ", date=" + date + "]";
   }
  
}
