public class CalculatorTest {
    public static void main(String[] args) {
        Calculator addition = new Calculator();
        Calculator subtraction = new Calculator();
        Calculator multiplication = new Calculator();
        Calculator division = new Calculator();

        addition.setOperandOne(10.5);
        addition.setOperation("+");
        addition.setOperandTwo(5.2);
        addition.performOperation();
        addition.getResults();

        subtraction.setOperandOne(10.5);
        subtraction.setOperation("-");
        subtraction.setOperandTwo(5.2);
        subtraction.performOperation();
        subtraction.getResults();

        multiplication.setOperandOne(10.5);
        multiplication.setOperation("*");
        multiplication.setOperandTwo(5.2);
        multiplication.performOperation();
        multiplication.getResults();

        division.setOperandOne(10.5);
        division.setOperation("/");
        division.setOperandTwo(5.2);
        division.performOperation();
        division.getResults();
    }    
}
