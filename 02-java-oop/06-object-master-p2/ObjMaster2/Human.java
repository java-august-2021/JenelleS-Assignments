public class Human {
    private String name = "";
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;
    
    //constructor
    public Human(){
    }

    //overloaded constructors... none
    public Human(String name){
        this.name = name;
    }

    //methods
    public int displayHealth(){
        System.out.println(this.getName() + " has " + this.getHealth() + " health.");
        return this.getHealth();
    }

    public int attack(Human target){
        target.health -= this.strength;
        System.out.println("You attacked! Their health decreased to "  + target.health);
        return health;
    }


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
