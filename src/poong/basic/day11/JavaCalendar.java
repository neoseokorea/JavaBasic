package poong.basic.day11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class JavaCalendar {
    public static void main(String[] args) {

        /*
            자바로 시간, 날짜 다루기

            JDK1에서 제공한 Date 클래스를 이용해서 날짜,
            시간에 대한 처리를 할 수 있지만
            몇 가지 오류가 존재하는 이유로
            JDK1.1에 아온 Calendar 클래스를 이용해서
            날짜, 시간에 대한 처리를 수행하는 것을 권장함.

            하지만 날짜 처리 시 윤초을 고려하지 않거나(정확도 낮음)
            월을 표시할 때 1부터 표시하지 않고 0부터 표시하는 문제 존재.
            따라서 더 나은 성능의 <Joda-Time>이라는 라이브러리가
            JDK8에서 추가됨.

         */

        Date d = new Date();
        System.out.println(d.toString());       //같은 결과

        String fmt = "%d년 %d월 %d일 %d시 %d분 %d초 \n";
        System.out.printf(fmt, d.getYear()+1900, d.getMonth()+1, d.getDate(), d.getHours(), d.getMinutes(), d.getSeconds());


        Calendar c = Calendar.getInstance(); //싱글톤으로 작성된 코드
        System.out.println(c.getTime());

        System.out.printf(fmt,
                c.get(Calendar.YEAR),
                c.get(Calendar.MONTH),
                c.get(Calendar.DATE),
                c.get(Calendar.HOUR),
                c.get(Calendar.MINUTE),
                c.get(Calendar.SECOND)
        );

        System.out.println(
                "오늘은 " + c.get(Calendar.DAY_OF_WEEK) + " 요일입니다");

        System.out.println("오늘은 2021년 중 " +
                c.get(Calendar.DAY_OF_YEAR)+ " 번 째 날입니다.");

        //오늘 기준 5일 후 날짜는? (add 메서드 이용)
        c = Calendar.getInstance(); //싱글톤으로 작성된 코드
        c.add(Calendar.DATE, 5);
        System.out.println(c.getTime());

        //오늘 기준 100일 후 날짜는? (add 메서드 이용)
        c = Calendar.getInstance(); //싱글톤으로 작성된 코드
        c.add(Calendar.DATE, 100);
        System.out.println(c.getTime());

        //오늘 기준 15일 전 날짜는? (add 메서드 이용)
        c = Calendar.getInstance(); //싱글톤으로 작성된 코드
        c.add(Calendar.DATE, -15);
        System.out.println(c.getTime());

        //오늘 기준 출산일은? (add 메서드 이용)
        c = Calendar.getInstance(); //싱글톤으로 작성된 코드
        c.add(Calendar.MONTH, 10);
        System.out.println(c.getTime());

        /*
            SimpleDateFormat
            날짜 출력을 원하는 형태대로 다양하게 출력
         */
        System.out.println("심플데이트 포맷 : ");
        fmt = "yyyy-MM-dd hh:dd:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        System.out.println(sdf.format(d));

        c = Calendar.getInstance(); //싱글톤으로 작성된 코드
        System.out.println(sdf.format(c.getTime()));



        /*
            JDK8에서 추가된 jodatime 사용하기
            java.time 패키지에서
            날짜를 표현할 때는 LocalDate
            시간를 표현할 때는 LocalTime
            둘다를 표현할 때는 LocalDateTime
         */
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();

        System.out.println(time);
        System.out.println(date);







    }//main
}
