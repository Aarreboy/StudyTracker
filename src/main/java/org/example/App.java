package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

/**
 * Hello world!
 * Test2
 */
public class App implements ActionListener
{
    private StudyTrackerView view;
    private StudySession session;

    public App(){
        this.session = new StudySession();
        this.view = new StudyTrackerView();
    }
    public static void main( String[] args )
    {
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
