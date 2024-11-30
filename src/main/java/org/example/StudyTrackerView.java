package org.example;

import javax.swing.*;

public class StudyTrackerView {

    private JFrame frame;

    public StudyTrackerView(){
        this.frame = new JFrame("Study Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);


        frame.setVisible(true);
    }
}
