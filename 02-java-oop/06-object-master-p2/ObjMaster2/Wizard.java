public class Wizard extends Human {
    private int health = 50;
    private int intelligence = 8;

    public Wizard(String name){
        this.setName(name);
        this.setHealth(health);
        this.setIntelligence(intelligence);
    }
    
    public void heal(Human target){
        target.setHealth(target.getHealth() + this.intelligence);
        System.out.println(this.getName() + " healed " + target.getName() + " their health is now " + target.getHealth());
    }

    public void fireball(Human target){
        target.setHealth(target.getHealth() - (this.intelligence * 3));
        System.out.println(this.getName() + " cast fireballs. "+ target.getName() + "'s is now: " + target.getHealth());
    }
}
