package ProblemA;

import java.util.Scanner;

public class Sum_TildeSeparator implements AdvancedCalculator{
    public Sum_TildeSeparator() {
    }

    @Override
    public double calculateSumTildeSeparator(String input) {
        double sum = 0;
        String[] splitText = input.split("~");
        for (String s : splitText) {
            double num = Double.parseDouble(s);
            sum += num;
        }
        return sum;
    }
}
