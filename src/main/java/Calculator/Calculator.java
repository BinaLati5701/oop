package Calculator;

public class Calculator  implements  java.io.Serializable{
private double operandOne = 0.0;
private String operation = " ";
private double operandTwo = 0.0;
private  double totalResult = 0.0;


    //Constructor
    public Calculator(){

    }
    public Calculator(double operandOne, String operation, double operandTwo){
        this.operandOne = operandOne;
        this.operation = operation;
        this.operandTwo = operandTwo;

    }

    //Getters
    public double getOperandOne() {
        return operandOne;
    }

    public String getOperation() {
        return operation;
    }

    public double getOperandTwo() {
        return operandTwo;

    }public double getTotalResult() {
        return totalResult;
    }




    //Setters
    public void setOperandOne(double one) {
        this.operandOne = one;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void setTotalResult(double totalResult) {
        this.totalResult = totalResult;
    }

    //Methods
    public void performOperation(){
        if(getOperation().equals("+")){
            setTotalResult(getOperandOne() + getOperandTwo());
           getTotalResult();

        }
        else if(getOperation().equals("-")){
            setTotalResult(getOperandOne() - getOperandTwo());
            getTotalResult();

        }
    }

    public void getResults(){
        System.out.println(getTotalResult());
    }




}
