package Probability;


import java.util.Random;

public class GameOfChance {

    public double getProbabilityHead() {
        return 0.5;
    }
    public double getProbabilityTail() {
        return 0.5;
    }

    public double getProbabilityEventOneEventTwo(double eventOneProbability,
                                                 double eventTwoProbability) {
        return eventOneProbability*eventTwoProbability;

    }

    public double getProbabilityEventNotOccuring(double probabilityEventOccurring) {
        return  1 - probabilityEventOccurring;
    }

    public double getProbabilityEitherOfTwoEventsOccurring(double eventOneProbability, double eventTwoProbability, double bothOccurringTogether) {
        return eventOneProbability + eventTwoProbability - bothOccurringTogether;
    }
    //final changes done
}
