public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "You can ring my celllllllllll";
    }
    @Override
    public String unlock() {
        return "I've got the keys to your door! Wink!";
    }
    @Override
    public void displayInfo() {
        System.out.println("IPhone " + getVersionNumber() + " from " + getCarrier()) ;            
    }

}
