/**
 * This class represents a Spell
@author Daniyal Khan 3765942
*/
public class Spell{
    /**
     * Name of the spell
     */
    private final String name;

    /**
     * Level of the spell
     */
    private final int level;

    /**
     * Material Comp, if the spell has it
     */
    private final boolean materialComps;

    /**
     * Constructs a object of type Spell
     * @param name name of the spell
     * @param level level of the spell
     * @param materialComps if it has a material component
     */
    public Spell(String name, int level, boolean materialComps) {
        this.name = name;
        this.level = level;
        this.materialComps = materialComps;
    }

    /**
     * Returns the name of the spell
     * @return Name of the spell
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the level of the spell
     * @return Level of the spell
     */
    public int getLevel() {
        return level;
    }

    /**
     * Returns if the spell has a material component
     * @return Material component true or false
     */
    public boolean hasComponents() {
        return materialComps;
    }

    /**
     * Returns if two spells are equal
     * @param spellBook Spell to compare with
     * @return Spell equal if true or false
     */
    public boolean equals(Spell spellBook) {
        return spellBook.name == name 
                && spellBook.level == level
                &&  spellBook.materialComps == materialComps;
            
    }
}