package ProblemA;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        SumCalculator sumCalculator = new SumCalculator();
        File file = new File("src/ProblemA/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        double result = sumCalculator.calculateSum(br.readLine());
        System.out.println("Sum : " + result);
    }
}
