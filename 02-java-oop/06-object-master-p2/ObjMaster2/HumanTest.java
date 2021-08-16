public class HumanTest {
    public static void main(String[] args) {
        Human aqua = new Human("Aqua");
        Human zara = new Human("Zara");
        
        aqua.displayHealth();
        zara.displayHealth();
        aqua.attack(zara);
        zara.attack(aqua);

        Wizard larry = new Wizard("Larry");
        Wizard gary = new Wizard("Gary");
        Ninja strive = new Ninja("Strive");
        Samurai jack = new Samurai("Jack");
        Samurai bob = new Samurai("Bob");
        larry.displayHealth();
        gary.displayHealth();
        larry.fireball(gary);
        larry.displayHealth();
        gary.displayHealth();
        larry.heal(gary);
        gary.displayHealth();
        strive.displayHealth();
        strive.steal(larry);
        strive.runAway();
        jack.displayHealth();
        jack.deathBlow(gary);
        jack.meditate();
        jack.howMany();
    }
}
