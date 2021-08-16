public class Samurai extends Human {
    private int health = 200;
    private static int samuraiCount = 0;

    public Samurai(String name){
        this.setName(name);
        this.setHealth(health);
        samuraiCount++;
    }

    public void deathBlow(Human target){
        target.setHealth(target.getHealth() - target.getHealth());
        this.setHealth(this.getHealth() / 2);
        System.out.println(this.getName() + " killed " + target.getName() + " with Deathblow and halved their health. " + this.getName() + "'s health is now " + this.getHealth());
    }

    public void meditate(){
        this.setHealth(this.getHealth() + (this.getHealth()/2));
        System.out.println(this.getName() + "'s meditated and their health is now " + this.getHealth());
    }
    
    public static int howMany(){
        System.out.println(samuraiCount);
        return samuraiCount;
    }

// Samurai: Add a method howMany() that returns the total current number of Samurai.
}