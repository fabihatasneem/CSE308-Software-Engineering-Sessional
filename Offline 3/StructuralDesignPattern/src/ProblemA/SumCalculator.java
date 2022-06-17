package ProblemA;

public class SumCalculator implements SumCalculatorInterface {

    public SumCalculator() {
    }

    @Override
    public double calculateSum(String input) {
        try{
            if(input.contains(" ")){
                Sum_SpaceSeparator calculator = new Sum_SpaceSeparator();
                return calculator.calculateSum(input);
            }
            else if(input.contains("~")){
                FileAdapter fileAdapter = new FileAdapter("~");
                return fileAdapter.calculateSum(input);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
