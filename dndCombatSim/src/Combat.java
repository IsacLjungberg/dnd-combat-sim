import java.util.*;

public class Combat {
    ArrayList<Combatant> combatants;

    /*
     * Combat is initiated, combatants roll initiative and are placed into the
     * ArrayList in order of initiative
     */
    public Combat(){

    }

    public void addCombatant(Combatant combatant){
        combatants.add(combatant);
        combatant.setCombat(this);
        Collections.sort(combatants);
    }

    /*
     * Every combatant takes their turn in order
     */
    public void turn(){

    }

    public ArrayList<Combatant> getCombatants(){
        return combatants;
    }
}
