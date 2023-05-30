package Calendar;

import java.util.Scanner;

public class CalendarService {
    public static void main(String[] args) {
        CalendarService calendarService = new CalendarService();
        calendarService.startService();
    }

    public void startService() {
        Scanner input = new Scanner(System.in);
        MyCalendar myCalendar = new MyCalendar();
        System.out.println("서비스를 시작합니다");
        boolean flag = false;
        while (!flag) {
            System.out.println("년도를 입력하세요[4자리] >>> ");
            int year = Integer.parseInt(input.nextLine());
            System.out.println("월을 입력하세요[해당년도의 월 전체출력: 13입력] >>> ");
            int month = Integer.parseInt(input.nextLine());

            if(month == 13) {
                for (int i = 0; i < 12; i++) {
                    myCalendar.a(year, i + 1);
                }
            } else {
                myCalendar.a(year, month);
            }

            System.out.println("\n계속 이용하시겠습니까?[예: yes, 아니오: no] >>> ");
            String cmd = input.nextLine();
            if (cmd.equals("no")) {
                System.out.println("이용해주셔서 감사합니다.");
                flag = true;
            }
        }
        myCalendar = null;
        input.close();
    }
}
