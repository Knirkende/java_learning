public class CalcExercise {
    
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setFirstNumber(double n) {
        this.firstNumber = n;
    }
    public void setSecondNumber(double n) {
        this.secondNumber = n;
    }
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
    public double getDivisionResult() {
        if (secondNumber == 0) return 0;
        return firstNumber / secondNumber;
    }
}
