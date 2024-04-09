public abstract class Combatant implements Comparable<Combatant>{

    Combat combat;

    Integer initiative;
    String name;

    public Combatant(String name){
        this.name = name;
    }

    public abstract int rollInitiative();

    public abstract void takeTurn();

    @Override
    public int compareTo(Combatant c2){
        if(initiative == c2.getInitiative()){
            return 0;
        }

        if(initiative < c2.getInitiative()){
            return -1;
        }

        return 1;
    }

    public Integer getInitiative(){
        return initiative;
    }

    public String getName(){
        return name;
    }

    public void setCombat(Combat combat){
        this.combat = combat;
    }

    public void setInitiative(int initiative){
        this.initiative = initiative;
    }
}
