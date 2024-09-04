/**
This class represents a Spell Caster
@author Daniyal Khan 3765942
*/

public class SpellCaster{
    /**
     * Name of the spell caster
     */
    private final String name;

    /**
     * Level of the spell caster
     */
    private final int level;

    /**
     * Guild membership number of the spell caster
     */
    private final int guildMembershipNumber;

    /**
     * ID varaible for incrementing the guild memberhsip number everytime a new Spell Caster is added
     */
    private static int ID = 6000;

    /**
     * Spell book of the spell caster
     */
    private Spell[] spellBook;

    /**
     * Max number of spells a spell caster can hold in the spell bookjavadoc -author -private -d SpellCaster.java
     */
    private final int NUM_SPELLS = 7;

    /**
     * Constructs an object of type SpellCaster
     * @param name Name of the Spell Caster
     * @param level Level of the Spell Caster
     */
    public SpellCaster(String name, int level) {
        this.name = name;
        this.level = level;
        guildMembershipNumber = ID; // assigning guild number and changing the ID static variable everytime
        ID++;
        spellBook = new Spell[0]; // starting size of Spell Book is zero
    }

    /**
     * Returns name of the spell caster
     * @return name of the spell caster
     */
    public String getName() {
        return name;
    }

    /**
     * Returns level of the spell caster
     * @return level of the spell caster
     */
    public int getLevel() {
        return level;
    }

    /**
     * Returns the guild membership id of the spell caster
     * @return guild membership id of the spell caster
     */
    public int getMembershipNum() {
        return guildMembershipNumber;
    }

    /**
     * Returns the entire spell book of the spell caster
     * @return spell book of the spell caster
     */
    public Spell[] getSpellBook() {
        Spell[] copySpellBook = new Spell[spellBook.length];
        for (int i = 0; i < spellBook.length - 1; i++) {
            copySpellBook[i] = spellBook[i];
        }
        return spellBook;
    }

    /**
     * Adds a spell to the spell book of the spell caster
     * @param spell spell to be added to the spell book
     * @return true if spell gets added succesfully, false otherwise
     */
    public boolean addSpell(Spell spell) {
        boolean added = false;

        if (spell.getLevel() <= level && spellBook.length < NUM_SPELLS) {
            Spell[] newSpellBook = new Spell[spellBook.length+1]; // whenever adding a new spell, create a new array +1 the size of the previous one
            System.arraycopy(spellBook, 0, newSpellBook, 0, spellBook.length); // copy all the elements of the previous to new
            newSpellBook[newSpellBook.length-1] = spell;
            spellBook = newSpellBook;
            added = true;
        }    
        return added;
    }

    /**
     * Casts/removes the spell from the spell book of the spell caster
     * @param spell spell to be casted from the spell book
     * @return true if the spell gets casted successfully, false otherwise
     */
    public boolean castSpell(Spell spell) {
        boolean cast = false;
        for (int i = 0; i < spellBook.length && cast != true; i++) {
            if (spellBook[i].equals(spell)) {
                spellBook[i] = spellBook[spellBook.length-1];
                Spell[] newSpellBook = new Spell[spellBook.length-1]; // when spell gets casted, create a new array -1 the size of the previous one
                System.arraycopy(spellBook, 0, newSpellBook, 0, spellBook.length-1); // copy one less element of the previous array
                spellBook = newSpellBook;
                cast = true;
            }
        }
        return cast;
    }
}

