/** 
 Test driver class to test the Spell, SpellCaster
 and SpellCasterApprentice classes.
*/
public class SpellCasterTestDriver {
  public static void main(String[] args) {
    
    System.out.println("\n*** Test case #1: Create a SpellCaster object & test accessors");
    SpellCaster latona = new SpellCaster("Latona", 12);
    System.out.println("Name:     " + latona.getName()
                   + "\nLevel #:   " + latona.getLevel()
				   + "\nMembership #:   " + latona.getMembershipNum());
    
    Spell[] latonasSpellBook = latona.getSpellBook();
    if (latonasSpellBook.length == 0) {
      System.out.println("\nCorrect result: Latona has zero spells.");
    }
    else {
      System.out.println("\n>> ERROR: Latona has more than zero spells.");
    }
    
    //*********************************************************************************
    
    System.out.println
      ("\n*** Test case #2: Create a SpellCasterApprentice object & test accessors");
    SpellCasterApprentice nettles = new SpellCasterApprentice("Nettles", 4, latona);
    System.out.println("Name:     " + nettles.getName()
                   + "\nLevel #:   " + nettles.getLevel()
				   + "\nMembership #:   " + nettles.getMembershipNum()
                   + "\nSupervisor:    " + nettles.getSupervisor().getName());
    
    Spell[] nettlesSpellBook = nettles.getSpellBook();
    if (nettlesSpellBook.length == 0) {
      System.out.println("\nCorrect result: Nettles has zero spells.");
    }
    else {
      System.out.println("\n>> ERROR: Nettles has more than zero spells.");
    }


    //*********************************************************************************
    
    System.out.println("\n*** Test case #3: Automatically generate a member number");
    SpellCaster testMember = new SpellCaster("Electra", 6);
    if (testMember.getMembershipNum() == 6002) {
      System.out.println("Correct result: 6002 is the correct member number.");
    }
    else {
      System.out.println(">> ERROR: Invalid member number: " + 
                         testMember.getMembershipNum());
    }
    
    //*********************************************************************************
    
    System.out.println
      ("\n*** Test case #4: Create Spell objects & test accessors");
    
    // Create several Spell objects and test the first one
	final int MAXSPELLS = 7;
    Spell[] testSpellBook = new Spell[MAXSPELLS + 1];
    String[] testNames = {"Cone of Cold",
                                    "Disintegrate",
                                    "Fireball",
                                    "Lightning Bolt",
                                    "Magic Missile",
                                    "Shatter",
                                    "Cone of Silence",                                    
                                    "Light"
                                    };
    for (int i=0; i<=MAXSPELLS; i++) {
      testSpellBook[i] = new Spell(testNames[i],
                                        1 + i,     // Level
                                        (i%2) == 0);   // Every 2nd item has components
    } // end for loop
    
    System.out.println("Name: " + testSpellBook[0].getName()
                   + "\nLevel: " + testSpellBook[0].getLevel()
                   + "\nRequires Components:  " + testSpellBook[0].hasComponents());
          
    //*********************************************************************************
     
    System.out.println("\n*** Test case #5: Add one Spell to Spell Caster");
    
    if(latona.addSpell(testSpellBook[0])) {
      System.out.println("Correct result: Latona added a spell successfully.");
      latonasSpellBook = latona.getSpellBook();
      if (latonasSpellBook.length == 1) {
        System.out.println("Correct result: Latona has one spell.");
      }
      else {
        System.out.println(">> ERROR: Latona has other than one spell.");
      }
    }
    else {
      System.out.println(">> ERROR: Latona was unable to add a spell.");
    }

    //*********************************************************************************
    
    System.out.println("\n*** Test case #6: Add multiple Spells to Spell Caster");
    
    boolean successfulAdd = true;
    for(int i=1; i<=2; i++) {
      successfulAdd = successfulAdd && latona.addSpell(testSpellBook[i]);
    }
    if (successfulAdd) {
      System.out.println("Correct result: Latona added two more spells successfully.");
      latonasSpellBook = latona.getSpellBook();
      if (latonasSpellBook.length == 3) {
        System.out.println("Correct result: Latona has three spells.");
      }
      else {
        System.out.println(">> ERROR: Latona has other than three spells.");
      }
    }
    else {
      System.out.println(">> ERROR: Latona was unable to add two more spells.");
    }
    
    //*********************************************************************************
    
    System.out.println("\n*** Test case #7: Intentionally exceed the spell limit");
    
    for(int i=3; i<MAXSPELLS; i++) {
      latona.addSpell(testSpellBook[i]);
    }
    if (!latona.addSpell(testSpellBook[MAXSPELLS])) {
      System.out.println("Correct result: Latona was prevented from adding more than "
                         + MAXSPELLS + " spells.");
    }
    else {
      System.out.println(">> ERROR: Latona was able to add more than "
                         + MAXSPELLS + " spells.");
    }

    //*********************************************************************************
    
    System.out.println
      ("\n*** Test case #8: A spell caster apprentice tries to add a spell with material components");
    
    Spell nettlesSpell = null;
    
    for (int i=0; i<2; i++) {
      if (nettles.addSpell(testSpellBook[i])) {
        nettlesSpell = testSpellBook[i];        // Remember this for Test case #10
        if (testSpellBook[i].hasComponents()) {
          System.out.println(">> ERROR: Nettle was able to add a spell with material components.");
        }
        else {
          System.out.println
            ("Correct result: Nettle was able to add a spell that did not have material components.");
        }
      }
      else {
        if (testSpellBook[i].hasComponents()) {
          System.out.println
            ("Correct result: Nettle was prevented from adding a spell with material components.");
        }
        else {
          System.out.println
            (">> ERROR: Nettle was prevented from adding a spell that did not have material components.");
        }
      }
    }

    //*********************************************************************************
    
    System.out.println
      ("\n*** Test case #9: Casting the only spell in the spell book");
    
    int nettlesBookLength = nettles.getSpellBook().length;

    if (nettles.castSpell(nettlesSpell)) {
      System.out.println("Correct result: Nettles' spell was successfully cast.");
    }
    else {
      System.out.println(">> ERROR: Nettles' spell was not successfully cast.");
    }

    if (nettles.getSpellBook().length == nettlesBookLength - 1) {
      System.out.println("Correct result: Nettles' book length changed appropriately.");
    }
    else {
      System.out.println(">> ERROR: Nettles' book length did not change appropriately.");
    }

	//*********************************************************************************
    
    System.out.println("\n*** Test case #10: A spell caster tries to add a spell that is higher than their level");

    if (nettles.addSpell(testSpellBook[7])) {
      System.out.println(">> ERROR: Added a spell that is higher level than the caster.");
    }
    else {
      System.out.println("Correct result: "
        + "Unsuccessful attempt to add a spell that is higher level than the caster.");
    }


    //*********************************************************************************
    
    System.out.println("\n*** Test case #11: Casting a spell not in their spell book");
    
    if (nettles.castSpell(testSpellBook[5])) {
      System.out.println(">> ERROR: Cast a spell that was not in the spell book.");
    }
    else {
      System.out.println("Correct result: "
        + "Unsuccessful attempt to cast a spell not in their spell book.");
    }

    //*********************************************************************************
    
    System.out.println
      ("\n*** Test case #12: Casting the first spell in their spell book");
    
    int latonasBookLength = latona.getSpellBook().length;

    if (latona.castSpell(testSpellBook[0])) {
      System.out.println("Correct result: Latona's first spell was successfully cast.");
    }
    else {
      System.out.println(">> ERROR: Latona's first spell was not successfully cast.");
    }

    if (latona.getSpellBook().length == latonasBookLength - 1) {
      System.out.println("Correct result: Latona's book length changed appropriately.");
    }
    else {
      System.out.println(">> ERROR: Latona's book length did not change appropriately.");
    }

    System.out.println
      ("\nConfirm spell was cast: Cone of Cold should be absent from the following spell book:");
    latonasSpellBook = latona.getSpellBook();
    for (int i=0; i < latonasSpellBook.length; i++) {
      System.out.println(latonasSpellBook[i].getName());
    }


    //*********************************************************************************
    
    System.out.println("\n*** Test case #13: Casting a spell in the middle of the spell book");
    
    latonasBookLength = latona.getSpellBook().length;

    if (latona.castSpell(testSpellBook[3])) {
      System.out.println("Correct result: Lightning Bolt was successfully cast.");
    }
    else {
      System.out.println(">> ERROR: Lightning Bolt was not successfully cast.");
    }

    if (latona.getSpellBook().length == latonasBookLength - 1) {
      System.out.println("Correct result: Latona's book length changed appropriately.");
    }
    else {
      System.out.println(">> ERROR: Latona's book length did not change appropriately.");
    }

    System.out.println
      ("\nConfirm cast: Lightning Bolt should be absent from the following spell book:");
    latonasSpellBook = latona.getSpellBook();
    for (int i=0; i < latonasSpellBook.length; i++) {
      System.out.println(latonasSpellBook[i].getName());
    }
	
    //*********************************************************************************
    
    System.out.println("\n************* End of Test Cases ***************\n");
    
  } // end main method


} // end SpellCasterTestDriver class