import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradingTest {
    private static Grading grading;

    @BeforeAll
    static void initialization(){
        grading = new Grading();
    }

    //Test cases for 3 credit

    @Test
    void NegativeNumberInThreeCreditReturnsInvalid(){
        assertEquals("Invalid Input", grading.gradeCalculator("-0.5", 3));
    }
    @Test
    void ZeroInThreeCreditReturnsF(){
        assertEquals("F", grading.gradeCalculator("0", 3));
    }
    @Test
    void OneHundredInThreeCreditReturnsF(){
        assertEquals("F", grading.gradeCalculator("100", 3));
    }
    @Test
    void OneHundredSeventyNineInThreeCreditReturnsF(){
        assertEquals("F", grading.gradeCalculator("179", 3));
    }
    @Test
    void OneHundredSeventyNinePointFiveInThreeCreditReturnsC(){
        assertEquals("C", grading.gradeCalculator("179.5", 3));
    }
    @Test
    void OneHundredEightyInThreeCreditReturnsC(){
        assertEquals("C", grading.gradeCalculator("180", 3));
    }
    @Test
    void TwoHundredInThreeCreditReturnsC(){
        assertEquals("C", grading.gradeCalculator("200", 3));
    }
    @Test
    void TwoHundredNineInThreeCreditReturnsC(){
        assertEquals("C", grading.gradeCalculator("209", 3));
    }
    @Test
    void TwoHundredNinePointSevenInThreeCreditReturnsB(){
        assertEquals("B", grading.gradeCalculator("209.7", 3));
    }
    @Test
    void TwoHundredTenInThreeCreditReturnsC(){
        assertEquals("B", grading.gradeCalculator("210", 3));
    }
    @Test
    void TwoHundredTwentyInThreeCreditReturnsB(){
        assertEquals("B", grading.gradeCalculator("220", 3));
    }
    @Test
    void TwoHundredThirtyNineInThreeCreditReturnsB(){
        assertEquals("B", grading.gradeCalculator("239", 3));
    }
    @Test
    void TwoHundredThirtyNinePointThreeInThreeCreditReturnsA(){
        assertEquals("A", grading.gradeCalculator("239.3", 3));
    }
    @Test
    void TwoHundredFortyInThreeCreditReturnsA(){
        assertEquals("A", grading.gradeCalculator("240", 3));
    }
    @Test
    void ThreeHundredInThreeCreditReturnsA(){
        assertEquals("A", grading.gradeCalculator("300", 3));
    }
    @Test
    void FourHundredInThreeCreditReturnsA(){
        assertEquals("A", grading.gradeCalculator("400", 3));
    }
    @Test
    void LargerThanFourHundredInThreeCreditReturnsInvalid(){
        assertEquals("Invalid Input", grading.gradeCalculator("401", 3));
    }


    //Test cases for 4 credit

    @Test
    void NegativeNumberInFourCreditReturnsInvalid(){
        assertEquals("Invalid Input", grading.gradeCalculator("-9", 4));
    }
    @Test
    void ZeroInFourCreditReturnsF(){
        assertEquals("F", grading.gradeCalculator("0", 4));
    }
    @Test
    void OneHundredInFourCreditReturnsF(){
        assertEquals("F", grading.gradeCalculator("100", 4));
    }
    @Test
    void TwoHundredThirtyNineInFourCreditReturnsF(){
        assertEquals("F", grading.gradeCalculator("239", 4));
    }
    @Test
    void TwoHundredThirtyNineNinePointTwoInFourCreditReturnsC(){
        assertEquals("C", grading.gradeCalculator("239.2", 4));
    }
    @Test
    void TwoHundredFortyInFourCreditReturnsC(){
        assertEquals("C", grading.gradeCalculator("240", 4));
    }
    @Test
    void TwoHundredSixtyInFourCreditReturnsC(){
        assertEquals("C", grading.gradeCalculator("260", 4));
    }
    @Test
    void TwoHundredSeventyNineInFourCreditReturnsC(){
        assertEquals("C", grading.gradeCalculator("279", 4));
    }
    @Test
    void TwoHundredSeventyNinePointEightInFourCreditReturnsB(){
        assertEquals("B", grading.gradeCalculator("279.8", 4));
    }
    @Test
    void TwoHundredEightyInFourCreditReturnsC(){
        assertEquals("B", grading.gradeCalculator("280", 4));
    }
    @Test
    void ThreeHundredInFourCreditReturnsC(){
        assertEquals("B", grading.gradeCalculator("300", 4));
    }
    @Test
    void ThreeHundredNineteenInFourCreditReturnsB(){
        assertEquals("B", grading.gradeCalculator("319", 4));
    }
    @Test
    void ThreeHundredNineteenPointFourInFourCreditReturnsA(){
        assertEquals("A", grading.gradeCalculator("319.4", 4));
    }
    @Test
    void ThreeHundredTwentyInFourCreditReturnsA(){
        assertEquals("A", grading.gradeCalculator("320", 4));
    }
    @Test
    void ThreeHundredFortyInFourCreditReturnsA(){
        assertEquals("A", grading.gradeCalculator("340", 4));
    }
    @Test
    void FourHundredInFourCreditReturnsA(){
        assertEquals("A", grading.gradeCalculator("400", 4));
    }
    @Test
    void LargerThanFourHundredInFourCreditReturnsInvalid(){
        assertEquals("Invalid Input", grading.gradeCalculator("400.1", 4));
    }


    //Others
    @Test
    void NonNumberInputReturnsInvalid(){
        assertEquals("Invalid Input", grading.gradeCalculator("Fabiha", 4));
    }
    @Test
    void InvalidCreditInputReturnsInvalid(){
        assertEquals("Invalid Credit", grading.gradeCalculator("248", 2));
    }
}