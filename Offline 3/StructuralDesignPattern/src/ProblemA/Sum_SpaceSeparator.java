package ProblemA;

public class Sum_SpaceSeparator {
    public Sum_SpaceSeparator() {
    }

    public void calculateSum(String input) {
        double sum = 0;
        String[] splitText = input.split(" ");
        for (String s : splitText) {
            double num = Double.parseDouble(s);
            sum += num;
        }
        System.out.println("Sum : " + sum);
    }
}
