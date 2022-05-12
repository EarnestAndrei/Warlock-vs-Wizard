public class Warlock extends Character{
    Warlock(String name,  int lv, int hp, int mp){
        super(name,lv,hp,mp);
    }
    public void FallofSevenSins(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + 
        " with Fall of Seven Sins (Damage - 117)\n");
        damagePoints = 117;
        manaCost = 70;
        damageTarget(enemyCharacter, damagePoints,manaCost);
    }
    public void WarpReality(){
        hpRestored = 150;
        mpRestored = 150;
        System.out.println(characterName+" used Warp Reality to restore "+hpRestored+" Health points and "+
        mpRestored+" Mana points.\n");
        restore(hpRestored, mpRestored);
    }
}
