public class Bat extends Mammal {
    private int energyLevel;

    public int displayEnergy(){//this returns a number*****
        this.setEnergyLevel(300);
        System.out.println(this.getEnergyLevel());
        return this.energyLevel;
    }

    public int fly(){
        this.setEnergyLevel(this.getEnergyLevel()-50);
        if(this.getEnergyLevel() < 0){
            System.out.println("Bat knocked out!");
            sleep();
        } else {
            System.out.println("Whoosh, whoosh");
        }
        return this.getEnergyLevel();
    }

    public int eatHumans() {
        this.setEnergyLevel(this.getEnergyLevel() + 25);
        if(this.getEnergyLevel() < 0){
            System.out.println("Bat knocked out!");
            sleep();
        } else {
            System.out.println("So- well, nevermind.");
        }
        return this.getEnergyLevel();
    }

    public int attackTown() {
        this.setEnergyLevel(this.getEnergyLevel()-100);
        if(this.getEnergyLevel() < 0){
            System.out.println("Bat knocked out!");
            sleep();
        } else {
            System.out.println("Crackle, Boom!");
        }
        return this.getEnergyLevel();
    }

    public int sleep(){
        this.setEnergyLevel(this.getEnergyLevel() + 25);
        System.out.println("Sleeping recovered 25 energy!");
        return this.getEnergyLevel();
    }
}
