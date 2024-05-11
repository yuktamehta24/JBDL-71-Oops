package encapsulation;

import java.util.Date;

//Class for understanding encapsulation
public class Lecture {

    public Lecture() {
        this.title = "Default";
        this.mentor = "Default";
        this.date = new Date();
        this.status = "Default";
    }


    // Parameterized constructor
    public Lecture(String title, String mentor, Date date, String status) {
        this.title = title;
        this.mentor = mentor;
        this.date = date;
        this.status = status;
    }

    public Lecture(String title) {
        this.title = title;
//        this.mentor = "Default";
//        this.date = new Date();
//        this.status = "Default";
    }


    public Lecture(int duration) {
        this.title = "Default";
        this.mentor = "Default";
        this.date = new Date();
        this.status = "Default";
    }

    public Lecture(String title, String mentor) {
        this.title = title;
        this.mentor = mentor;
//        this.date = new Date();
//        this.status = "Default";
    }

    protected String title;

    private String mentor;

    private Date date;

    private String status;


    public String getTitle() {
        return title;
    }

    //lecture.title = "ASDFVGHNJKIJUHYTGFRDES";
    public void setTitle(String title) {
        //log
        this.date = new Date();
        //validation
        if (title.equals("Java OOPS")) {
            this.title = title;
        } else {
            this.title = "Default";
        }
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
        this.getDate();
    }

    private Date getDate() {
        return date;
    }

    private void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }
}
