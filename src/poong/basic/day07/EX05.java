//package poong.basic.day07;
//
//import static java.text.DateFormat.MEDIUM;
//
//public class EX05 {
//    public static void main(String[] args) {
//        /*
//            73. 선풍기를 나타내는 Fan 클래스를 아래의 조건에 따라 작성하라
//
//                회전속도 1,2,3 을 나타내는 상수 SLOW, MEDIUM, FAST
//                선풍기의 속도를 나타내는 speed 변수, 초기값은 SLOW
//                동작상태를 표시하는 on 변수, 초기값은 false
//                선풍기 팬 크기를 나타내는 radius 변수, 초기값은 5.0
//                선풍기 색상을 표시하는 color 변수, 초기값은 blue
//                시험값 : 10, yellow, 최고속도, 동작중 / 5, blue, 중간속도, 정지
//
//
//            74. 은행 계좌를 나타내는 Account 클래스를 작성하라
//
//                계좌번호를 위한 aid 변수, 초기값은 0
//                통장잔액을 나타내는 balance 변수, 초기값은 0
//                연간 이자율을 나타내는 interestRate 변수, 초기값은 0
//                통장개설 날짜를 위한 dateCreated 변수
//                시험값 : 1122, 20000, 4.5, 2014-08-15 14:34:29
//
//            76. 대학교 업무 시스템을 위한 다음의 요구사항을 참고하여 다음 클래스들을 작성하시오
//
//                - 학생에는 학번, 이름, 주소, 생년월일 등의 정보가 있다. 학생은 반드시 하나의 전공학과에 속해야 하며, 한 분의 지도교수 밑에서 전공지도를 받는다.
//                - 교내에 개설된 과목에는 과목번호, 과목명, 과목개요 등이 있다. 그리고 각 과목은 여러 개의 섹션으로 나누어 관리한다.
//                - 교수는 교수 이름, 전공분야, 보유기술 등의 정보를 가진다. 특히, 한 명의 교수는 하나 이상의 보유기술을 가질 수 있다. 또한, 교수는 하나 이상의 과목도 강의할 수 있다.
//                - 전공학과는 학과명, 학과사무실의 위치, 학과사무실의 전화번호 등의 정보가 있다. 그리고 각 학과의 교수들 중에서 한 명의 교수에게 학과장을 임명한다
//         */
//
//        //문제73) 팬 시험값 입력
//        Fan fan1 = new Fan(3, true, 10, "yellow");
//        Fan fan2 = new Fan(2, false, 5, "blue");
//
//        //팬 시험값 출력
//        FanService fanServ = new FanService();
//        fanServ.toString(fan1);
//        fanServ.toString(fan2);
//
//        //문제74) 계좌 시험값 입력
//        Account acc1 = new Account(1122,20000, 4.5,""날짜)
//
//    } // ublic static void main
//
//
//
//
//    static class Fan {
//        /*
//            73. 선풍기를 나타내는 Fan 클래스를 아래의 조건에 따라 작성하라
//
//                회전속도 1,2,3 을 나타내는 상수 SLOW, MEDIUM, FAST
//                선풍기의 속도를 나타내는 speed 변수, 초기값은 SLOW
//                동작상태를 표시하는 on 변수, 초기값은 false
//                선풍기 팬 크기를 나타내는 radius 변수, 초기값은 5.0
//                선풍기 색상을 표시하는 color 변수, 초기값은 blue
//                시험값 : 10, yellow, 최고속도, 동작중 / 5, blue, 중간속도, 정지
//
//         */
//
//        //멤버변수
//        int SLOW = 1;
//        int MEDIUM = 2;
//        int FAST = 3;
//        int speed = SLOW;
//        boolean on = false;
//        double radius = 5.0;
//        String color = "blue";
//
//        //생성자
//        //alt insert를 눌러 생성자 선택 후 블럭 선택 후 <확인> 누르면 자동
//        public Fan(int speed, boolean on, double radius, String color) {
////            this.SLOW = SLOW;
////            this.MEDIUM = MEDIUM;
////            this.FAST = FAST;
//            this.speed = speed;
//            this.on = on;
//            this.radius = radius;
//            this.color = color;
//        }//public Fan()
//
//
//    }//static class Fan
//
//    static class FanService {
//
//        public String toString(Fan fan) {
////            return "Fan{" +
////                    "speed=" + fan.speed +
////                    ", on=" + fan.on +
////                    ", radius=" + fan.radius +
////                    ", color='" + fan.color + '\'' +
////                    '}';
//            System.out.println(
//                     "Fan{" +
//                    "speed=" + fan.speed +
//                    ", on=" + fan.on +
//                    ", radius=" + fan.radius +
//                    ", color='" + fan.color + '\'' +
//                    '}');
//            return "Fan{" +
//                    "speed=" + fan.speed +
//                    ", on=" + fan.on +
//                    ", radius=" + fan.radius +
//                    ", color='" + fan.color + '\'' +
//                    '}';
//
//        }//public String toString()
//    } //static class FanService
//
//
//
//
//
//    static class Account {
//        /*
//                    74. 은행 계좌를 나타내는 Account 클래스를 작성하라
//
//                계좌번호를 위한 aid 변수, 초기값은 0
//                통장잔액을 나타내는 balance 변수, 초기값은 0
//                연간 이자율을 나타내는 interestRate 변수, 초기값은 0
//                통장개설 날짜를 위한 dateCreated 변수
//                시험값 : 1122, 20000, 4.5, 2014-08-15 14:34:29
//
//         */
//
//        //멤버 변수
//        double aid = 0;
//        double balance = 0;
//        double interestRate = 0;
//        String dateCreated;
//
//        //생성자
//        public Account(double aid, double balance, double interestRate, String dateCreated) {
//            this.aid = aid;
//            this.balance = balance;
//            this.interestRate = interestRate;
//            this.dateCreated = dateCreated;
//        }//public Account(
//
//    }//static class Account
//
//    static class AccountService {
//        public void printAccount(Account acc){
//            String fmt = "%d %d %d %s";
//            System.out.printf
//                    (fmt, acc.aid, acc.balance, acc.interestRate, acc.dateCreated );
//
//        }//public void printSungJuk(
//    }//static class AccoutService
//
//
//
//
//
//} //public class EX05
//
