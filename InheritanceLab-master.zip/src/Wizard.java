public class Wizard extends Character{
    Wizard(String name,  int lv, int hp, int mp){
        super(name,lv,hp,mp);
    }
    public void EarthSpear(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + 
        " with Earth Spear (Damage - 50)");
        damagePoints = 25;
        manaCost = 5;
        damageTarget(enemyCharacter, damagePoints,manaCost);
    }
    public void DimensionalEdge(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + 
        " with Dimensional Edge (Damage - 70)");
        damagePoints = 70;
        manaCost = 50;
        damageTarget(enemyCharacter, damagePoints,manaCost);
    }
    public void DragonbloodRegeneration(){
        hpRestored = 100;
        mpRestored = 50;
        System.out.println(characterName + " used Dragonblood Regeneration to restore " + hpRestored + 
        " Health points and "+mpRestored+" Mana points.");
        restore(hpRestored, mpRestored);
    }
    
}
