package ZooKeeper;

class Mammal {
    protected int energyLevel = 100;

    public Mammal( int energyLevel){
        this.energyLevel = energyLevel;

    }
    public Integer displayEnergy(){
        System.out.println(energyLevel);
        return energyLevel;

    }


    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}
