package Phone;

public class PhoneTester {
    public static void main(String[] args){
        Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
        Iphone iphoneTen = new Iphone("X", 100, "AT&T", "Zing");

        s9.displayInfo(); //Galaxy S9 from Verizon
        System.out.println(s9.ring()); //Galaxy S9 Ring Ring Ring!
        System.out.println(s9.unlock());//Unlocking via finger print

        iphoneTen.displayInfo();//iPhone X from AT&T
        System.out.println(iphoneTen.ring());//iPhone X says Zing
        System.out.println(iphoneTen.unlock());//Unlocking via facial recognition
    }
}
