package Calculator;

public class CalculatorTest {
    public static void main(String[] args){
        Calculator c = new Calculator(10.5, "+", + 5.2);
        c.performOperation();
        c.getResults();

        Calculator c1 = new Calculator(10.5, "-", + 5.2);
        c1.performOperation();
        c1.getResults();
    }
}
