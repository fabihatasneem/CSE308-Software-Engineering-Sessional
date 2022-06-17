package ProblemA;

public class Sum_SpaceSeparator {
    public Sum_SpaceSeparator() {
    }

    public double calculateSum(String input) {
        double sum = 0;
        String[] splitText = input.split(" ");
        for (String s : splitText) {
            double num = Double.parseDouble(s);
            sum += num;
        }
        return sum;
    }
}
