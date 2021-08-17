public class Calculator {
    private double operandOne;
    private String operation;
    private double operandTwo;
    private double result = 0;

    //constructor
    public Calculator() {
    }

    public Calculator(double operandOne, String operation, double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
	}

    //methods
    public double performOperation(){
        if(operation.equals("+")){
            setResult(operandOne + operandTwo);
        } else if(operation.equals("-")){
            setResult(operandOne - operandTwo);
        } else if(operation.equals("*")){
            setResult(operandOne * operandTwo);
        } else if(operation.equals("/")){
            setResult(operandOne / operandTwo);
        }
        return result;
    }

    public void getResults(){
		System.out.println(performOperation());
    }


    //getter and setters
    public double getOperandOne() {
        return operandOne;
    }

    public String getOperation() {
        return operation;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }    
}
