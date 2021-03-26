//package poong.basic.day09;
//
////public class Game {
////    public static void main(String[] args) {
////
////        //변수선언
////
////
////    }
////}
////
////class Airplain {
////
////    //필드
////    protected String[] name;
////    protected int[] weapon1;
////    protected int[] weapon2;
////    protected int[] power;
////    protected int[] ;
////    protected int[] maxspeed;
////    protected int[] mineral;
////    protected int[] gas;
////
////    public void attack(String name, String weapon, int attackPower){
////
////    }
////
////}
//
//
//public class Overriding2 {
//    public static void main(String[] args) {
//        /*
//            오버라이딩(메서드 재정의;override)
//
//            객체지향 3대 개념 중 다형성에 해당.
//            상속 관계에 있는 상위클래스의 메서드를 하위클래스에서 같은 이름의 메서드를 다시 작성하는 것을 의미.
//            즉, 상속받은 메서드를 재정의해서 사용하는 것을 의미한다.
//         */
//
//
//    }//main
//
//}//public class Overriding
//
//class Airplane {
//    public String engineStart() { return "엔진 스타트!";}
//    public String brake() { return "속도를 감속합니다.";}
//}
//
//class JetFighter extends Airplane {
//    @Override //ctrl space를 누르면 나타남.
//    public String missileLaunch() {
//        return "미사일을 발사합니다.";
//    }
//}
//
//class transporter extends Airplane {
//    @Override
//    public String cry() {
//        return "수송기를";
//    }
//}
