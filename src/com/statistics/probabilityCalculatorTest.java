package src.com.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class probabilityCalculatorTest {
   /* ➔ As a statistician, I want to be able to know that the probability of a heads in a coin toss is
    equal to the probability of a tails in a coin toss.
    ➔ As a statistician, I want to be able to know the probability of two events occurring together.
    ➔ As a statistician, I want to be able to know the probability of an event not occurring.
    ➔ As a statistician, I want to be able to know the probability of either two events occurring.*/
    Random random;
    probabilityCalculator probability;
    @BeforeEach
    void init(){
    random = new Random();
    probability = new probabilityCalculator();
    }
    @Test
     void CheckingProbabilityOfHeadsEqualToTail(){
        double pHeadActual=probability.getProbabilityHead();
        double pTailActual=probability.getProbabilityTail();
        assertEquals(pHeadActual,pTailActual);
    }

    @Test
    void ProbabilityOfTwoEventsOccurringTogether(){
        double probabilityOfFirstEvent=random.nextDouble(1);
        double probabilityOfSecondEventOccurring= random.nextDouble(1);
        double probabilityOfTwoEventsOccurring=probability.TwoEventsOccuring(probabilityOfFirstEvent,probabilityOfSecondEventOccurring);

        assertEquals(probabilityOfFirstEvent*probabilityOfSecondEventOccurring,probabilityOfTwoEventsOccurring);
    }
    @Test
    void TestProbabilityEventNotOccurring(){

        double probabilityEventOccurring=random.nextDouble(1);

        assertEquals(1-probabilityEventOccurring,probability.getProbabilityEventNotOccurring(probabilityEventOccurring));
    }

    @Test
    void ProbabilityEitherOfTwoEventsOccurring(){

        double EventOneProbability = random.nextDouble(1);
        double EventTwoProbability = random.nextDouble(1);
        double BothEventsOccurring = random.nextDouble(1);

        assertEquals(EventOneProbability+EventTwoProbability-BothEventsOccurring,probability.getProbabilityEitherEventOccurring(EventOneProbability,EventTwoProbability,BothEventsOccurring));

    }
}