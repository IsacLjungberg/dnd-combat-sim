import java.text.DecimalFormat;
import java.util.Random;

public class DiceUser {
    private Random rand;

    public DiceUser(){
        rand = new Random();
    }

    /*
     * @returns a string containing the odds of e1 winning on the left and e2 on the right. Tie chance is counted in but also kept as a
     * separate statistic in parentheses
     */
    public String chanceToBeat(DiceSet e1, DiceSet e2, int tries){
        double e1Chance = 0;
        double tieChance = 0;
        double e2Chance = 0;

        for(int n = 0; n < tries; n++){
            int e1Result = e1.roll();
            int e2Result = e2.roll();

            if(e1Result > e2Result){
                e1Chance++;
                continue;
            }

            if(e1Result == e2Result){
                tieChance++;
                continue;
            }

            if(e1Result < e2Result){
                e2Chance++;
                continue;
            }
        }

        DecimalFormat df = new DecimalFormat("#.#");
        return (
            String.valueOf(df.format((e1Chance + (tieChance/2))/tries*100)) + " / " +
            String.valueOf(df.format((e2Chance + (tieChance/2))/tries*100)) + " (" + 
            String.valueOf(df.format(tieChance/tries*100)) + ")"
        );

    }
}
