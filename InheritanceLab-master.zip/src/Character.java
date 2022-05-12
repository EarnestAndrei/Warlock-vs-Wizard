public class Character {
    public String characterName = "Gandalf";
    public int level, healthPoints, manaPoints, damagePoints, manaCost,hpRestored,mpRestored;
    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(){
        
    }
    Character(String name, int lv, int hp, int mp){
        characterName = name;
        level = lv;
        healthPoints=hp;
        manaPoints=mp;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void Display(){
        System.out.println("\nCharacter Name : "+characterName+"\nLevel: "+level+"\nHealth Points: "
        +healthPoints+"\nMana Points: "+manaPoints);
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int damagePoints,int manaCost){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        manaPoints -= manaCost;
        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */
        if(enemyCharacter.healthPoints<=0){
            System.out.println(enemyCharacter.characterName+" has been defeated.");
        }
    }
    public void restore(int hpRestored, int mpRestored){
        healthPoints += hpRestored;
        manaPoints += mpRestored;
    }
    public void increaseLevel(Character enemyCharacter){
        if(enemyCharacter.healthPoints<=0){
            System.out.println(characterName+" has beaten " + enemyCharacter.characterName + 
            " and has gained 10 levels from the fight.");
            level += 10;
        }
    }

}