package ProblemA;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        SumCalculator sumCalculator = new SumCalculator();

        File file = new File("src/ProblemA/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        sumCalculator.calculateSum(br.readLine());
    }
}
