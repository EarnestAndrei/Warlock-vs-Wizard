public class Wizard extends Character{
    Wizard(String name,  int lv, int hp, int mp){
        super(name,lv,hp,mp);
    }
    public void EarthShatter(Character enemyCharacter){
        System.out.println(super.characterName + "attacks " + enemyCharacter.characterName + " with Earth Shattter (Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void DimensionalEdge(Character enemyCharacter){
        System.out.println(super.characterName + "attacks " + enemyCharacter.characterName + " with Dimensional Edge (Damage - 70)");
        int damagePoints = 70;
        damageTarget(enemyCharacter, damagePoints);
    }
    
}
