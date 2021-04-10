package ZooKeeper;

public class GorillaTest {
    public static void main(String[]args){
        Gorilla zoo = new Gorilla(100);
        zoo.displayEnergy();

        Gorilla a = new Gorilla(100);
        Gorilla b = new Gorilla(100);
        Gorilla c = new Gorilla(100);

        a.throwSomething();
        a.eatBananas();
        c.climb();

        b.throwSomething();
        b.eatBananas();

        c.throwSomething();







    }

}
