package poong.basic.day09;

public class StarCraft2 {

    public static void main(String[] args) {

//        SCV s = new SCV("SCV", 45, 5, 2.81, 50, 0);
        /*SCV 유닛을 만들 때마다 초기값을 지정하는 것은 다소 번거로움.
        즉, 동일한 속성을 가지는 가진 유닛을 만들 때마다 매개변수를 통해 객체를 만드는 것은 비효율적.
        이런 경우, 생성자 내에서 초기값을 지정하는 것이 나음.
         */
//        SCV s = new SCV("SCV", 45, 5, 2.81, 50, 0);

        SCV s1 = new SCV();
        System.out.println("건설로봇의 체력" + s1.hp);
        s1.attack();
        s1.move();
        s1.specialAbility();
        System.out.println();

        Marine s2 = new Marine();
        System.out.println("해병대의 체력" + s2.hp);
        s2.attack();
        s2.move();
        s2.specialAbility();
        System.out.println();

        Firebat s3 = new Firebat();
        System.out.println("화염방사병의 체력" + s3.hp);
        s3.attack();
        s3.move();
        s3.specialAbility();
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

    abstract public void attack();

    abstract public void move();

    abstract public void specialAbility();

} //class Unit


class SCV extends Unit2 {

    final String fmtattack = "융합절단기를 이용해서 대상에 %d의 피해를 주고 있습니다.\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동 중입니다.\n";
    final String fmtspaty = "대상을 수리하는 중입니다.\n";

    public SCV() {
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
    public void attack() {
        /*
            추상메서드를 이용해서 부모클래스에 정의된 attack메서드를 유닛에 맞게 재정의함.
         */
        System.out.printf(fmtattack, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);

    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspaty);

    }
}


class Marine extends Unit2 {

    final String fmtattack = "가우스소총를 이용해서 대상에 %d의 피해를 주고 있습니다.\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동 중입니다.\n";
    final String fmtspaty = "전투자극제를 사용해서 이동속도 50%% 증가, 공격속도 33%% 증가합니다.\n";


    public Marine() {
        name = "해병대";
        hp  = 50;
        power = 30;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;
    }


    @Override
    public void attack() {
        System.out.printf(fmtattack, power);

    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);

    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspaty);

    }
}


class Firebat extends Unit2 {

    final String fmtattack = "화염방사기를 이용해서 대상에 %d의 피해를 주고 있습니다.\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동 중입니다.\n";
    final String fmtspaty = "전투자극제를 사용해서 이동속도 50%% 증가, 공격속도 33%% 증가합니다.\n";


    public Firebat() {
        name = "화염방사병";
        hp  = 50;
        power = 8 * 2;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;
    }


    @Override
    public void attack() {
        System.out.printf(fmtattack, power);

    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);

    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspaty);

    }
}