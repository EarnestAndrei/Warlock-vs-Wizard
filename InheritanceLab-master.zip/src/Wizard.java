public class Wizard extends Character{
    Wizard(String name,  int lv, int hp, int mp){
        super(name,lv,hp,mp);
    }
    public void EarthShatter(Character enemyCharacter){
        System.out.println(super.characterName + "attacks " + enemyCharacter.characterName + " with Earth Shattter (Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
    };
    
}
