enum WeekDay{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {

        System.out.println(WeekDay.FRIDAY);

        for(WeekDay day: WeekDay.values()){
            System.out.println(day);
        }

        System.out.println(WeekDay.values().length);
    }
}
