public class BasicCombatant extends Combatant{

    public BasicCombatant(String name) {
        super(name);
    }

    public void setInitiative(int initiative){
        this.initiative = initiative;
    }

    @Override
    public int rollInitiative() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rollInitiative'");
    }

    @Override
    public void takeTurn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takeTurn'");
    }
}
