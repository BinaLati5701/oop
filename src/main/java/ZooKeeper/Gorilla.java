package ZooKeeper;

 public class Gorilla extends Mammal {


     public Gorilla(int energyLevel) {
         super(energyLevel);
     }

     public void throwSomething(){
         this.energyLevel -= 5;
         System.out.println("Gorilla has thrown something " + energyLevel);

    }

    public void eatBananas(){
        this.energyLevel += 10;
        System.out.println("Gorilla is satisfied " + energyLevel);


    }
    public void climb(){
        this.energyLevel -= 10;
        System.out.println("Gorilla has climbed a tree " + energyLevel);


    }


}
