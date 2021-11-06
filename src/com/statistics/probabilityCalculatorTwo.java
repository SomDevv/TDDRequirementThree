package src.com.statistics;

import java.util.Random;

public class probabilityCalculatorTwo {

    public double coinTossProbability(Character tossOutcome) {
        Character[] possibleOutcome=new Character[2];
        double cnt=0;
        possibleOutcome[0] = 'H';
        possibleOutcome[1] = 'T';
        for (int i = 0; i < possibleOutcome.length; i++) {
            if (possibleOutcome[i] == tossOutcome) {
                cnt++;
            }
        }
        return cnt/possibleOutcome.length;
}
    public double TwoEventOccurring(){
        double EventAOccurring=0.5;
        double EventBOccurring=0.5;

        return EventAOccurring*EventBOccurring;
    }
    public double AnEventOccurring(){
        double ProbabilityAnEventOccurs=0.5;

        return ProbabilityAnEventOccurs;
    }
    public double TwoEventEitherOccurring(){
        double EventAOccurring=0.5;
        double EventBOccurring=0.5;
        double BothEventOccurring=0.25;

        return EventAOccurring+EventBOccurring-BothEventOccurring;
    }

    public static void main(String[] args) {
        Random rand=new Random();
        System.out.println(rand.nextDouble(1));
    }
}
