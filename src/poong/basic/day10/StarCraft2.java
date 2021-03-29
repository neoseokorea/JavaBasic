package poong.basic.day10;

public class StarCraft2 {

    public static void main(String[] args) {

        //인터페이스 기반으로 바꿈


        SCV2 s1 = new SCV2();
        System.out.println("건설로봇의 체력" + s1.hp);
        s1.attack2();
        s1.move2();
        s1.specialAbility2();
        System.out.println();

        Marine2 s2 = new Marine2();
        System.out.println("해병대의 체력" + s2.hp);
        s2.attack2();
        s2.move2();
        s2.specialAbility2();
        System.out.println();

        Firebat2 s3 = new Firebat2();
        System.out.println("화염방사병의 체력" + s3.hp);
        s3.attack2();
        s3.move2();
        s3.specialAbility2();
        System.out.println();

    }

}//public class StarCraft {



abstract class Unit2 {
    protected String name;
    protected int hp;
    protected int power;
    protected double mvspd;
    protected int mineral;
    protected int gas;

    public Unit2() {
    }

    public Unit2(String name, int hp, int power, double mvspd, int mineral, int gas) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.mvspd = mvspd;
        this.mineral = mineral;
        this.gas = gas;
    } //public Unit(

//    abstract public void attack2();
//    abstract public void move2();
//    abstract public void specialAbility2();

} //abstract class Unit2



/*
    추상클래스에서 정의했던 추상메서드를
    독립적인 코드들로 분리함 -> 인터페이스
 */

interface Unit2Action {

    void attack2();
    void move2(); // abstract public은 생략 가능
    void specialAbility2();

}//interface Unit2Action



class SCV2 extends Unit2 implements Unit2Action {

    final String fmtattack = "융합절단기를 이용해서 대상에 %d의 피해를 주고 있습니다.\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동 중입니다.\n";
    final String fmtspaty = "대상을 수리하는 중입니다.\n";

    public SCV2() {
        name = "건설로봇";
        hp = 45;
        power = 5;
        mvspd = 2.81;
        mineral = 50;
        gas = 0;
    }

//    public SCV(String name, int hp, int power, double mvspd, int mineral, int gas) {
//        super(name, hp, power, mvspd, mineral, gas);
//    }

    @Override
    public void attack2() {
        /*
            추상메서드를 이용해서 부모클래스에 정의된 attack2메서드를 유닛에 맞게 재정의함.
         */
        System.out.printf(fmtattack, power);
    }

    @Override
    public void move2() {
        System.out.printf(fmtmove, mvspd);

    }

    @Override
    public void specialAbility2() {
        System.out.printf(fmtspaty);

    }
}//class SCV2 extends Unit2 implements Unit2Action

class Marine2 extends Unit2 implements Unit2Action {

    final String fmtattack = "가우스소총를 이용해서 대상에 %d의 피해를 주고 있습니다.\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동 중입니다.\n";
    final String fmtspaty = "전투자극제를 사용해서 이동속도 50%% 증가, 공격속도 33%% 증가합니다.\n";


    public Marine2() {
        name = "해병대";
        hp  = 50;
        power = 30;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;
    }


    @Override
    public void attack2() {
        System.out.printf(fmtattack, power);

    }

    @Override
    public void move2() {
        System.out.printf(fmtmove, mvspd);

    }

    @Override
    public void specialAbility2() {
        System.out.printf(fmtspaty);

    }
}//class Marine2 extends Unit2 implements Unit2Action

class Firebat2 extends Unit2 implements Unit2Action {

    final String fmtattack = "화염방사기를 이용해서 대상에 %d의 피해를 주고 있습니다.\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동 중입니다.\n";
    final String fmtspaty = "전투자극제를 사용해서 이동속도 50%% 증가, 공격속도 33%% 증가합니다.\n";


    public Firebat2() {
        name = "화염방사병";
        hp  = 50;
        power = 8 * 2;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;
    }


    @Override
    public void attack2() {
        System.out.printf(fmtattack, power);

    }

    @Override
    public void move2() {
        System.out.printf(fmtmove, mvspd);

    }

    @Override
    public void specialAbility2() {
        System.out.printf(fmtspaty);

    }
}//class Firebat2 extends Unit2 implements Unit2Action