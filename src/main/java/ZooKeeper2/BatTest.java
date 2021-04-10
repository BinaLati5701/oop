package ZooKeeper2;

public class BatTest {
    public static void main(String[]args){

        Bat a = new Bat(300);
        Bat b = new Bat(300);
        Bat c = new Bat(300);

        a.attackTown();
        a.eatHumans();
        a.fly();

        b.attackTown();
        b.eatHumans();
        b.fly();

        c.attackTown();


    }
}
