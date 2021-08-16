public class HumanTest {
    public static void main(String[] args) {
        Human aqua = new Human("Aqua");
        Human zara = new Human("Zara");
        
        aqua.displayHealth();
        zara.displayHealth();
        aqua.attack(zara);
        zara.attack(aqua);
    }
}
