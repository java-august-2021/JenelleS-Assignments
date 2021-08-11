public class Gorilla extends Mammal {
    public int throwSomething(){
        System.out.println("Gorilla has thrown something!");
        this.setEnergyLevel(this.getEnergyLevel()-5);
        return this.getEnergyLevel();
    }

    public int eatBananas(){
        System.out.println("Gorilla enjoyed the bananas!");
        this.setEnergyLevel(this.getEnergyLevel() + 10);
        return this.getEnergyLevel();
    }

    public int climb(){
        System.out.println("Gorilla climbed the tree!");
        this.setEnergyLevel(this.getEnergyLevel() - 10);
        return this.getEnergyLevel();
    }
}
