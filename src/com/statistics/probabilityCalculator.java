package src.com.statistics;

public class probabilityCalculator {

    public double getProbabilityHead() {
        return 0.5;
    }

    public double getProbabilityTail() {
        return 0.5;
    }

    public double TwoEventsOccuring(double probabilityOfFirstEvent, double probabilityOfSecondEventOccurring) {
        return probabilityOfFirstEvent*probabilityOfSecondEventOccurring;
    }

    public double getProbabilityEventNotOccurring(double probabilityEventOccurring) {
        return 1-probabilityEventOccurring;
    }

    public double getProbabilityEitherEventOccurring(double eventOneProbability, double eventTwoProbability, double bothEventsOccurring) {
        return eventOneProbability+eventTwoProbability-bothEventsOccurring;
    }
}
