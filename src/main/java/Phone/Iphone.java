package Phone;

public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String ringer = "iPhone " + getVersionNumber() + " says " + getRingTone();
        return ringer;
    }
    @Override
    public String unlock() {
        return "Unlocking via facial recognition";

    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone " + getVersionNumber() + " from " + getCarrier());
    }
}





