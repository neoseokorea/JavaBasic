package poong.basic.day09;

public class StarCraftInterfaceVersion1 {



}//public class StarCraftInterfaceVersion1

abstract class StarCraft3 {

}//abstract class StarCraft3

interface StarCraftAction {
    abstract public void attack();
    abstract public void move();
    abstract public void specialAbility();

}//interface StarCraftAction

class StarAttack extends StarCraft3 implements StarCraftAction {

    @Override
    public void attack() {

    }

    @Override
    public void move() {

    }

    @Override
    public void specialAbility() {

    }
}