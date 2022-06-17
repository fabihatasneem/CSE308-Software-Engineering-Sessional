package ProblemA;

public class Sum_TildeSeparator implements AdvancedCalculator{
    public Sum_TildeSeparator() {
    }

    @Override
    public void calculateSumTildeSeparator(String input) {
        double sum = 0;
        String[] splitText = input.split("~");
        for (String s : splitText) {
            double num = Double.parseDouble(s);
            sum += num;
        }
        System.out.println("Sum : " + sum);
    }
}
