package Probability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GameOfChanceTest {

    GameOfChance gameOfChance;
    Random random;
    @BeforeEach
    void init(){
        random = new Random();
        gameOfChance = new GameOfChance();
    }

    @Test
    void testHeadTailProbability(){
        double probabilityHead = gameOfChance.getProbabilityHead();
        double probabilityTail = gameOfChance.getProbabilityTail();

        assertEquals(probabilityHead, probabilityTail,"Probability of head should be  equal to probability of tail");

    }

    @Test
    void testProbabilityTwoEventsOccuringTogether(){
        double probabilityEventOne = random.nextDouble(1);
        double probabilityEventTwo = random.nextDouble(1);

        double probabilityTwoEventsTogetHer = gameOfChance.getProbabilityEventOneEventTwo(probabilityEventOne, probabilityEventTwo);

        double expected = probabilityEventOne*probabilityEventTwo;
        double actual = probabilityTwoEventsTogetHer;
        assertEquals(expected, actual);

    }

    @Test
    void testProbabilityEventNotOccurring(){
        double probabilityEventOccurring = random.nextDouble(1);
        double expected = 1 - probabilityEventOccurring;
        assertEquals(expected, gameOfChance.getProbabilityEventNotOccuring(probabilityEventOccurring));
    }

    @Test
    void probabilityEitherOfTwoEventsOccurring(){

        double eventOneProbability = random.nextDouble(1);
        double eventTwoProbability = random.nextDouble(1);
        double bothOccurringTogether = random.nextDouble(1);

        double expected = eventOneProbability + eventTwoProbability - bothOccurringTogether;
        double actual = gameOfChance.getProbabilityEitherOfTwoEventsOccurring(eventOneProbability,eventTwoProbability,bothOccurringTogether);

        assertEquals(expected, actual);

    }


}