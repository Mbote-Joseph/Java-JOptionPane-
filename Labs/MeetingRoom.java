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



public class MeetingRoom{

    MeetingRoom(){
        //main class
        final JFrame f=new JFrame();
        f.setPreferredSize(new Dimension(550,350));
        f.setLayout(null);
        JButton addButton=new JButton("ADD");
        f.add(addButton);
        JButton saveButton=new JButton("Save(0 Meeting)");
        f.add(saveButton);
       
        Label topDis = new Label("Topic : ");
        Label locDis = new Label("Location : ");
        Label timDis = new Label("Time : ");
        Label dateDis = new Label("Date : ");
        Label timeCol = new Label(":");
        topDis.setBounds(30, 50, 50,10);
        locDis.setBounds(30, 80, 50,10);
        timDis.setBounds(30, 110, 50,10);
        dateDis.setBounds(30, 140, 50,10);
 
 
        JTextField topText = new JTextField();
        JTextField LocText = new JTextField();
        topText.setBounds(100, 50, 270,20);
        LocText.setBounds(100, 80, 270,20);
 
 
        JComboBox<String> timeHrBox=new JComboBox<String>();
        for(int i=8;i<=20;i++){
            if(i<10)
                timeHrBox.addItem("0"+i);
            else
                timeHrBox.addItem(""+i);  
        }
       
        JComboBox<String> timeMinBox=new JComboBox<String>();
        timeMinBox.addItem("00");
        timeMinBox.addItem("15");
        timeMinBox.addItem("30");
        timeMinBox.addItem("45");
       
        timeHrBox.setBounds(100, 110, 50,20);
        timeMinBox.setBounds(180, 110, 50,20);
       
        timeCol.setBounds(160,110, 5,20);
       
       
        JComboBox<String> dateDayBox=new JComboBox<String>();
        for(int i=1;i<=31;i++){
            if(i<10)
                dateDayBox.addItem("0"+i);
            else
                dateDayBox.addItem(""+i);  
        }
       
        JComboBox<String> dateMonthBox=new JComboBox<String>();
        for(int i=1;i<=12;i++){
            if(i<10)
                dateMonthBox.addItem("0"+i);
            else
                dateMonthBox.addItem(""+i);  
        }
       
        JComboBox<String> dateYearBox=new JComboBox<String>();
        for(int i=2019;i<=2022;i++){
                dateYearBox.addItem(""+i);  
        }
       
        dateDayBox.setBounds(100, 140, 50,20);
        dateMonthBox.setBounds(170, 140, 50,20);
        dateYearBox.setBounds(240, 140,80,20);
        addButton.setBounds(30, 180,80,20);
        saveButton.setBounds(180, 180,200,20);
    //   timeCol.setBounds(160,140, 5,20);
       
        f.add(topDis);
        f.add(locDis);
        f.add(timDis);
        f.add(dateDis);
        f.add(topText);
        f.add(timeCol);
        f.add(LocText);
        f.add(timeHrBox);
        f.add(timeMinBox);
        f.add(dateDayBox);
        f.add(dateMonthBox);
        f.add(dateYearBox);
        f.pack();
        f.setVisible(true);
        ArrayList<MeetinInfo> meetings = new ArrayList<>();
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MeetinInfo meet = new MeetinInfo(topText.getText(), LocText.getText(), timeHrBox.getSelectedItem()+":"+timeMinBox.getSelectedItem(), dateDayBox.getSelectedItem()+"-"+dateMonthBox.getSelectedItem()+"-"+dateYearBox.getSelectedItem());
                meetings.add(meet);
                saveButton.setText("Save("+meetings.size()+" Meetings)");
               
                topText.setText("");
                LocText.setText("");
                timeHrBox.setSelectedIndex(0);
                timeMinBox.setSelectedIndex(0);
                dateDayBox.setSelectedIndex(0);
                dateMonthBox.setSelectedIndex(0);
                dateYearBox.setSelectedIndex(0);
               
               
               
            }
        });
       
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("saveInfo.txt");
                try {
                    PrintWriter writer = new PrintWriter(file);
                    for(MeetinInfo meet : meetings){
                        writer.println(meet);
                    }
                    saveButton.setText("Save(0) Meetings)");
                    writer.close();
                    meetings.clear();
                } catch (FileNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
    }
 
 
    public static void main(String[] args){
        MeetingRoom f = new MeetingRoom();
 
    }
 }