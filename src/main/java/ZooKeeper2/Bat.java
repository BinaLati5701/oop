package ZooKeeper2;

public class Bat extends  Mammal{

    public Bat(int energyLevel) {

        super(energyLevel);
    }


    public void fly(){
        this.energyLevel -= 50;
        System.out.println("Sound a bat taking off and decreased its energy by 50: " + energyLevel);

    }
    public void eatHumans(){
        this.energyLevel += 25;
        System.out.println("So- well, never mind, just increase its energy by 25: " + energyLevel);

    }
    public void attackTown(){
        this.energyLevel -= 100;
        System.out.println("Sound of a town on fire and decreased its energy by 100: " + energyLevel);

    }

}
