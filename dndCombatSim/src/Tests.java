import org.junit.Test;

import java.util.ArrayList;

public class Tests {
    public Tests(){

    }

    @Test
    public void compareTest(){
        Combatant c1 = new BasicCombatant("John");
        c1.setInitiative(10);
        Combatant c2 = new BasicCombatant("Dave");
        c2.setInitiative(12);

        Combat combat = new Combat();

        combat.addCombatant(c1);
        combat.addCombatant(c2);

        ArrayList<Combatant> list = combat.getCombatants();

        System.out.println(list.get(0).getName() + ", " + list.get(1).getName());
    }

}
