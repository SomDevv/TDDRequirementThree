package src.com.statistics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class probabilityCalculatorTwoTest {
    private probabilityCalculatorTwo toss=new probabilityCalculatorTwo();
    @BeforeEach
    public void beforeEach(){
        toss=new probabilityCalculatorTwo();
    }
    @Test
    public void ProbabilityOfHeadAndTailInACoinToss() {
        double pHeadExpected = 0.5;                                             //arange
        double pTailExpected = 0.5;

        double pTailActual = toss.coinTossProbability('T');                 //act
        double pHEadActual = toss.coinTossProbability('H');

        assertAll(() -> assertEquals(pTailExpected, pTailActual),               //assert
                () -> assertEquals(pHeadExpected, pHEadActual));

    }

    @Test
    public void ProbabilityOfTwoEventsOccurringTogether() {

        double expectedProbability = 0.5*0.5;

        double actualProbability = toss.TwoEventOccurring();

        assertEquals(expectedProbability, actualProbability);
    }

    @Test
    public void ProbabilityOfAnEventOccurring() {

        double expectedProbability = 0.5;


        double actualProbability = toss.AnEventOccurring();

        assertEquals(expectedProbability, actualProbability);
    }

    @Test
    public void ProbabilityOfEitherTwoEventsOccurring() {

        double expectedProbability = 0.5 + 0.5 - 0.25;  //0.75


        double actualProbability=toss.TwoEventEitherOccurring();

        assertEquals(expectedProbability,actualProbability);
    }
}