package enums;

public enum DaysOfTheWeek {

    WEDNESDAY("wed", 4), //0
    SUNDAY("sun", 1), //1
    MONDAY("mon", 2), //2
    TUESDAY("tue", 3); //3

    private String shortName;

    private int day;

//    SUNDAY,
//    MONDAY,
//    TUESDAY;

//    DaysOfTheWeek() {
//
//    }

    DaysOfTheWeek(String abc, int a) {
        shortName = abc;
        day = a;
    }

    public String getShortName() {
        return shortName;
    }

    public int getDay() {
        return day;
    }

}
