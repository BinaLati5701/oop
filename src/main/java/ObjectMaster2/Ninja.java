package ObjectMaster2;

public class Ninja extends Human{
    protected int stealth = 10;

    public Ninja(int stealth) {
        super(stealth);
    }

    public void steal(Human h){
        h.health -= stealth;
        health += stealth;

    }
    public void runAway(Human h){
        h.health -= 10;
        health -= 10;

    }




}
