public class HumanTest {
    public static void main(String[] args) {
        Human aqua = new Human();
        Human zara = new Human();
        
        aqua.displayHealth();
        zara.displayHealth();
        aqua.attack(zara);
        zara.attack(aqua);
    }
}
