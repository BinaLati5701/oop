package ObjectMaster2;


public class Samurai extends Human{
    protected  int health = 200;
    public  static int numberSamurai = 0;

    public Samurai(int health) {

        super(health);
        numberSamurai += 1;
    }

    public void deathBlow(Human h){
        h.setHealth(h.getHealth() - h.getHealth());
        this.health = this.health;


    }
    public void meditate(){
        this.setHealth(this.getHealth() + this.getHealth()/2);

    }
    public  static Integer howMany(){
        return numberSamurai;

    }

}

