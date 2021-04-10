package ObjectMaster2;

public class HumanTest {
    public static void main(String[]args){
        Human human = new Human(100);

        Samurai s1 = new Samurai(200);
        Samurai s2 = new Samurai(200);
        Samurai s3 = new Samurai(200);
        Ninja n1 = new Ninja(50);
        Ninja n2 = new Ninja(50);
        Ninja n3 = new Ninja(50);
        Wizard w1 = new Wizard(50);
        Wizard w2 = new Wizard(50);
        Wizard w3 = new Wizard(50);
        n1.steal(n2);
        s1.deathBlow(n2);
        System.out.println(s2.health);
        s3.meditate();
        System.out.println(s3.health);



        w1.heal(n1);
        System.out.println(w2.health);
        w1.fireball(w3);
        System.out.println(w3.health);


        System.out.println(n2.health);
        n1.runAway(n3);
        System.out.println(n3.health);
        System.out.println(Samurai.howMany());
        System.out.println(s1.health);






    }
}
