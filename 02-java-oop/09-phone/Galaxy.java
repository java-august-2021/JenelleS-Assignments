public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Do do dooooo doooo do dodo do -Origa Ame";
    }
    @Override
    public String unlock() {
        return "Unlock yourself -Daichi Miura";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier()) ;            
    }
}
