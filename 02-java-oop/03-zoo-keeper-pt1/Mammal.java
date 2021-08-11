public class Mammal {
    private int energyLevel = 100;

    public Mammal() {
    }

    public int displayEnergy(){//this returns a number*****
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}
