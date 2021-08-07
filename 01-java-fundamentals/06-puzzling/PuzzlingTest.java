public class PuzzlingTest {
    public static void main(String[] args) {
        Puzzling puzzle = new Puzzling();

        puzzle.getTenRolls();
        System.out.println(puzzle.getRandomLetter());
        System.out.println(puzzle.generatePassword());
        System.out.println(puzzle.getNewPasswordSet(3));
        puzzle.shuffleArray(puzzle.getNewPasswordSet(5));
    }
}
