package enums;

public class Client {

    static final String SUNDAY = "Sunday";
    static final int SUNDAY_Day = 1;
//    static final String SUNDAY = "Sunday";
//    static final String SUNDAY = "Sunday";
//    static final String SUNDAY = "Sunday";
    public static void main(String[] args) {


        System.out.println(DaysOfTheWeek.MONDAY.getShortName()); // mon
        System.out.println(DaysOfTheWeek.MONDAY.getDay()); // 2
        System.out.println(DaysOfTheWeek.MONDAY); // MONDAY

        System.out.println(DaysOfTheWeek.MONDAY);
        System.out.println(SUNDAY);

        String a = DaysOfTheWeek.MONDAY.toString();
        System.out.println(a);
        System.out.println(DaysOfTheWeek.MONDAY);
        System.out.println(DaysOfTheWeek.MONDAY.name()); // MONDAY
        for(DaysOfTheWeek dayOfTheWeek : DaysOfTheWeek.values()) {
            System.out.println(dayOfTheWeek);
            System.out.println(dayOfTheWeek.getDay());
            System.out.println(dayOfTheWeek.getShortName());
            System.out.println(dayOfTheWeek.ordinal());
        };

        DaysOfTheWeek d = DaysOfTheWeek.valueOf("fghjsdf");
        DaysOfTheWeek d1 = DaysOfTheWeek.SUNDAY;

        System.out.println(d);
        System.out.println(d1);

        abc("MONDAY");
    }

    public static void abc(String dayName) {
        DaysOfTheWeek day = DaysOfTheWeek.valueOf(dayName); // DaysOfTheWeek.MONDAY

        DaysOfTheWeek[] days =  new DaysOfTheWeek[]{DaysOfTheWeek.MONDAY, DaysOfTheWeek.WEDNESDAY};
    }
}
