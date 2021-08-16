public class Ninja extends Human{
    private int stealth = 10;

    public Ninja(String name){
        this.setName(name);
        this.setStealth(stealth);
    }

    public void steal(Human target){
        if (target.getHealth() > 10){
            target.setHealth(target.getHealth() - this.stealth);
            this.setHealth(this.getHealth() + this.stealth);
            System.out.println(this.getName() + " stole from " + target.getName() + " their health is now " + target.getHealth() + " and " + this.getName() + "'s health is now " + this.getHealth());
        } else {
            System.out.println(target.getName() + " has too little health and saw through your stealth.");
        }
    }

    public void runAway(){
        this.setHealth(this.getHealth() - 10);
        System.out.println(this.getName() + " ran away and lost health. Their health is now " + this.getHealth());
    }
}
