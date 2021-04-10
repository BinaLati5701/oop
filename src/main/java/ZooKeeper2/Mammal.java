package ZooKeeper2;

public class Mammal {
    protected int energyLevel = 300;

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;

    }

}
