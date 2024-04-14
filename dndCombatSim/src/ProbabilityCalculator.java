import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class ProbabilityCalculator {
    private int numberOfDice;
    private int diceMax;

    public ProbabilityCalculator(){

    }

    /*
     * calculates the chance a given entity with a bonus b1 has to beat another entity with a bonus b2, given a certain probability
     * profile
     */
    public void chanceToBeat(double[] profile, int b1, int b2){
        double b1Chance = 0;
        double b2Chance = 0;
        for(int n = 0; n < profile.length; n++){
            if(n + b1 < n + b2){
                b1Chance += profile[n];
            } else {
                b2Chance += profile[n];
            }
        }

        System.out.println(b1Chance*100 + "/" + b2Chance*100);
    }

    /*
     * generates the probability profile of a set of dice with a certain maximum for each individual die, in the form of an int array
     */
    public double[] calculateProbabilityProfile(int numberOfDice, int diceMax, int tries){
        int[] numbers = new int[numberOfDice*diceMax+1];
        for(int n = 0; n < tries; n++){
            numbers[rollOnce(numberOfDice, diceMax)] += 1;
        }

        double[] out = new double[numberOfDice*diceMax+1];

        for(int n = 0; n < numbers.length; n++){
            out[n] = (double) numbers[n] / tries;
        }

        return out;
    }

    public void printProbabilityProfile(double[] profile){
        DecimalFormat df = new DecimalFormat("#.##");
        for(int n = 0; n < profile.length; n++){
            System.out.println(n + ": " + df.format(profile[n] * 100));
        }
    }

    public int rollOnce(int numberOfDice, int diceMax){
        Random rand = new Random();
        int result = 0;
        for(int n = 0; n < numberOfDice; n++){
            result += rand.nextInt(diceMax) + 1;
        }
        return result;
    }
}
