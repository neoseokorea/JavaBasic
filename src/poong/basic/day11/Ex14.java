package poong.basic.day11;

public class Ex14 {
    public static void main(String[] args) {
        /*
            다음 조건을 만족하는 프로그램을 작성하여라 (TimeTime)

            하루는 86400초이다. 입력값이 1234567890일 경우 며칠인지 계산하여라
            한 시간은 3600초이다. 입력값이 98765일 경우 몇 시간인지 계산하여라
            일 분은 60초이다. 입력값이 12345일 경우 몇 분인지 계산하여라.
         */

        int totalSecondsADay = 86400;
        int totalSecondsAnHour = 3600;
        int totalSecondsAMinute = 60;
        int[] goalSeconds = {1234567890, 98765, 12345};
        int goalDays;
        int goalHours;
        int goalMinutes;

//        //배열에 들어있는 숫자들을 확인한다.
//        for (int i=0;i<goalSeconds.length; ++i) {
//            System.out.println(goalSeconds[i]);
//        }

        for (int i=0;i<goalSeconds.length; ++i) {
            if (goalSeconds[i] >= totalSecondsADay) {
                goalDays = goalSeconds[i] /  totalSecondsADay;
                goalHours = goalSeconds[i] /  totalSecondsAnHour;
                System.out.println(
                        goalSeconds[i] + " 초는 "+
                                goalDays + "일이며 총 " +
                                goalHours+ "시간입니다.");
            } else {
                //나머지 계산
                goalMinutes = goalSeconds[i] / totalSecondsAMinute;
                System.out.println(
                        goalSeconds[i] + " 초는 총"+
                                goalMinutes+" 분입니다.");
            }
        }


    }//main
}
