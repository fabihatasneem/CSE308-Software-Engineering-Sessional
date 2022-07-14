import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradingTest {
    @Test
    void OneEightyInThreeCreditReturnsC(){
        Grading grading = new Grading();
        assertEquals("C", grading.gradeCalculator("180", 3));
    }

}