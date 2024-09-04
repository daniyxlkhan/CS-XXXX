/**
This class represents a Spell Caster Apprentice
@author Daniyal Khan 3765942
*/
public class SpellCasterApprentice extends SpellCaster {
    /**
     * Supervisor of the apprentice 
     */
    private SpellCaster supervisor;

    /**
     * Contructs an object of type SpellCasterApprentice
     * @param name Name of the apprentice
     * @param level Level of the apprentice
     * @param supervisor Supervisor of the apprentice
     */
    public SpellCasterApprentice(String name, int level, SpellCaster supervisor) {
        super(name, level);
        this.supervisor = supervisor;
    }

    /**
     * Returns the supervisor of the apprentice
     * @return Supervisor of the apprentice
     */
    public SpellCaster getSupervisor() {
        return supervisor;
    }

    /**
     * @param spell Spell to be added
     * @return true if added successfully, otherwise false
     */
    public boolean addSpell(Spell spell) {
        boolean added = false;
        if(spell.hasComponents()) {
            added = false;
        } else {
            added = super.addSpell(spell);
        }
        return added;
    }
}