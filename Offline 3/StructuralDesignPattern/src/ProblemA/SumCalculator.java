package ProblemA;

public class SumCalculator implements SumCalculatorInterface {

    public SumCalculator() {
    }

    @Override
    public void calculateSum(String input) {
        try{
            if(input.contains(" ")){
                Sum_SpaceSeparator calculator = new Sum_SpaceSeparator();
                calculator.calculateSum(input);
            }
            else if(input.contains("~")){
                FileAdapter fileAdapter = new FileAdapter("~");
                fileAdapter.calculateSum(input);
            }
            else{
                System.out.println("Input format violated.");
            }
        }catch(Exception e) {
            System.out.println("Input format violated.");
        }
    }
}
