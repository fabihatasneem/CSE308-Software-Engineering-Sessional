import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradingTest {

    //Test cases for 3 credit

    @Test
    void NegativeNumberInThreeCreditReturnsInvalid(){
        Grading grading = new Grading();
        assertEquals("Invalid Input", grading.gradeCalculator("-179", 3));
    }
    @Test
    void OneHundredSeventyNineInThreeCreditReturnsF(){
        Grading grading = new Grading();
        assertEquals("F", grading.gradeCalculator("179", 3));
    }
    @Test
    void OneHundredSeventyNinePointFiveInThreeCreditReturnsC(){
        Grading grading = new Grading();
        assertEquals("C", grading.gradeCalculator("179.5", 3));
    }
    @Test
    void OneHundredEightyInThreeCreditReturnsC(){
        Grading grading = new Grading();
        assertEquals("C", grading.gradeCalculator("180", 3));
    }
    @Test
    void TwoHundredNineInThreeCreditReturnsC(){
        Grading grading = new Grading();
        assertEquals("C", grading.gradeCalculator("209", 3));
    }
    @Test
    void TwoHundredNinePointSevenInThreeCreditReturnsB(){
        Grading grading = new Grading();
        assertEquals("B", grading.gradeCalculator("209.7", 3));
    }
    @Test
    void TwoHundredTenInThreeCreditReturnsC(){
        Grading grading = new Grading();
        assertEquals("B", grading.gradeCalculator("210", 3));
    }
    @Test
    void TwoHundredThirtyNineInThreeCreditReturnsB(){
        Grading grading = new Grading();
        assertEquals("B", grading.gradeCalculator("239", 3));
    }
    @Test
    void TwoHundredThirtyNinePointThreeInThreeCreditReturnsA(){
        Grading grading = new Grading();
        assertEquals("A", grading.gradeCalculator("239.3", 3));
    }
    @Test
    void TwoHundredFortyInThreeCreditReturnsA(){
        Grading grading = new Grading();
        assertEquals("A", grading.gradeCalculator("240", 3));
    }
    @Test
    void FourHundredInThreeCreditReturnsA(){
        Grading grading = new Grading();
        assertEquals("A", grading.gradeCalculator("400", 3));
    }
    @Test
    void LargerThanFourHundredInThreeCreditReturnsInvalid(){
        Grading grading = new Grading();
        assertEquals("Invalid Input", grading.gradeCalculator("401", 3));
    }


    //Test cases for 4 credit

    @Test
    void NegativeNumberInFourCreditReturnsInvalid(){
        Grading grading = new Grading();
        assertEquals("Invalid Input", grading.gradeCalculator("-9", 4));
    }
    @Test
    void TwoHundredThirtyNineInFourCreditReturnsF(){
        Grading grading = new Grading();
        assertEquals("F", grading.gradeCalculator("239", 4));
    }
    @Test
    void TwoHundredThirtyNineNinePointTwoInFourCreditReturnsC(){
        Grading grading = new Grading();
        assertEquals("C", grading.gradeCalculator("239.2", 4));
    }
    @Test
    void TwoHundredFortyInFourCreditReturnsC(){
        Grading grading = new Grading();
        assertEquals("C", grading.gradeCalculator("240", 4));
    }
    @Test
    void TwoHundredSeventyNineInFourCreditReturnsC(){
        Grading grading = new Grading();
        assertEquals("C", grading.gradeCalculator("279", 4));
    }
    @Test
    void TwoHundredSeventyNinePointEightInFourCreditReturnsB(){
        Grading grading = new Grading();
        assertEquals("B", grading.gradeCalculator("279.8", 4));
    }
    @Test
    void TwoHundredEightyInFourCreditReturnsC(){
        Grading grading = new Grading();
        assertEquals("B", grading.gradeCalculator("280", 4));
    }
    @Test
    void ThreeHundredNineteenInFourCreditReturnsB(){
        Grading grading = new Grading();
        assertEquals("B", grading.gradeCalculator("319", 4));
    }
    @Test
    void ThreeHundredNineteenPointFourInFourCreditReturnsA(){
        Grading grading = new Grading();
        assertEquals("A", grading.gradeCalculator("319.4", 4));
    }
    @Test
    void ThreeHundredTwentyInFourCreditReturnsA(){
        Grading grading = new Grading();
        assertEquals("A", grading.gradeCalculator("320", 4));
    }
    @Test
    void FourHundredInFourCreditReturnsA(){
        Grading grading = new Grading();
        assertEquals("A", grading.gradeCalculator("400", 4));
    }
    @Test
    void LargerThanFourHundredInFourCreditReturnsInvalid(){
        Grading grading = new Grading();
        assertEquals("Invalid Input", grading.gradeCalculator("401", 4));
    }


    //non-number input
    @Test
    void NonNumberInputReturnsInvalid(){
        Grading grading = new Grading();
        assertEquals("Invalid Input", grading.gradeCalculator("Fabiha", 4));
    }
}