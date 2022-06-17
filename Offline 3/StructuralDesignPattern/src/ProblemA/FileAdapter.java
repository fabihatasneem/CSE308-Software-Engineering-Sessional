package ProblemA;

public class FileAdapter implements SumCalculatorInterface{
    String separator;
    AdvancedCalculator calculator;
    public FileAdapter(String separator) {
        this.separator = separator;
        if(separator.equals("~")){
            calculator = new Sum_TildeSeparator();
        }

    }

    @Override
    public void calculateSum(String input){
        if(separator.equals("~")){
            calculator.calculateSumTildeSeparator(input);
        }
    }
}
