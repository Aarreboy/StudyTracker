package org.example;
import java.time.LocalDateTime;

public class StudySession {
    private String subject;
    private int timeSpent;
    private LocalDateTime date;

    public StudySession(String subject, int timeSpent){
        this.subject = subject;
        this.date = LocalDateTime.now();
        this.timeSpent = timeSpent;
    }

    public StudySession(){
        this.subject = "default";
        this.date = LocalDateTime.now();
        this.timeSpent = 0;
    }

    public int getTimeSpent() {
        return timeSpent;
    }

    public String getSubject() {
        return subject;
    }

    public LocalDateTime getDate(){
        return this.date;
    }
}
