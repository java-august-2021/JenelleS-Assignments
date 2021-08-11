public class Human {
    private int strength;
    private int stealth;
    private int intelligence;
    private int health;
    
    //constructor
    public Human() {
        this.health = 100;
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
    }

    //overloaded constructors

    public Human(int strength, int stealth, int intelligence) {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
    }

    //methods
    public int displayHealth(){
        System.out.println(this.health);
        return this.health;
    }

    public int attack(Human target){
        target.setHealth(target.getHealth() - this.strength);
        System.out.println("You attacked! Their health decreased to "  + target.health);
        return target.health;
    }


    //getters and setters
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
