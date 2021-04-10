package ObjectMaster2;

public class Wizard extends Human{
    protected int health = 50;
    protected int intelligence = 8;



    public Wizard(int health,  int intelligence) {
        super(intelligence);


    }

    public Wizard(int health) {
        super(health);
    }

    public void heal(Human h){
        h.health += intelligence;


    }
    public void fireball(Human h){
        h.health -= intelligence * 3;


    }
}
