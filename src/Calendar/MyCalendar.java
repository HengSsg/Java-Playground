package Calendar;

import java.util.Calendar;

public class MyCalendar {
    public void prn(int year, int month) {

        Calendar cal = Calendar.getInstance();

        System.out.printf("\t\t%d년 %d월\n", year, month);
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        cal.set(year, month - 1, 1);

        int start = cal.get(Calendar.DAY_OF_WEEK);

        for (int i = 1; i < start; i++) {
            System.out.printf("\t");
        }

        for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
            System.out.printf("%d\t", i);
            if(start % 7 == 0) {
                System.out.println();
            }
            start++;
        }
    }


    public void a(int year, int month) {

        Calendar calendar = Calendar.getInstance();

        System.out.printf("%d년 %d월\n", year, month);
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        calendar.set(year, month, 1);

        int start = calendar.get(Calendar.DAY_OF_WEEK);

        for (int i = 1; i < start; i++) {
            System.out.printf("\t");
        }

        for (int i = 1; i < calendar.getActualMaximum(Calendar.DATE); i++) {
            System.out.printf("%d\t", i);
            if(start % 7 == 0) {
                System.out.println();
            }
            start++;
        }
    }
}



