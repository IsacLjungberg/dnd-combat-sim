import java.util.Random;

public class DiceSet {

    private int[] dice;
    private int modifier;
    private Random rand;

    /*
     * generates a diceset with a set of dice and a modifier to be added to those dice
     */
    public DiceSet(int[] dice, int modifier){
        this.dice = dice;
        this.modifier = modifier;
        rand = new Random();
    }

    /*
     * @returns one random roll of this dice set
     */
    public int roll(){
        int out = 0;

        for(int n = 0; n < dice.length; n++){
            out += rand.nextInt(dice[n]) + 1;
        }

        out += modifier;

        return out;
    }

    /*
     * @returns the minimum roll of this dice set
     */
    private int minRoll(){
        return dice.length + modifier;
    }

    /*
     * @returns the maximum roll of this dice set
     */
    private int maxRoll(){
        int out = 0;
        for(int n = 0; n < dice.length; n++){
            out += dice[n];
        }
        out += modifier;
        return out;
    }

    /*
     * @returns the largest dice in the dice list
     */
    public int largestDice(){
        Integer out = 0;
        for(int n = 0; n < dice.length; n++){
            if(out < dice[n]){
                out = dice[n];
            }
        }
        return out;
    }

    /*
     * @returns this dice set as a string representation
     */
    public String toString(){
        int[] diceCount = new int[largestDice()+1];

        for(int n = 0; n < dice.length; n++){
            diceCount[dice[n]] += 1;
        }

        String out = "";
        
        for(int n = 0; n < diceCount.length; n++){
            if(diceCount[n] != 0){
                out += diceCount[n] + "d" + String.valueOf(n) + " + ";
            }
        }

        out += String.valueOf(modifier);
        return out;
    }

}
