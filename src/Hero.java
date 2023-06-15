public class Hero {
    private int health;
    private int damage;
    private String superAbility;
    public Hero(int theHealth, int theDamage, String theSuperAbility){
        health = theHealth;
        damage = theDamage;
        superAbility = theSuperAbility ;
    }
    public Hero(int theHealth, int theDamage){
        health = theHealth;
        damage = theDamage;
    }
    public int getHealth(){
        return this.health;
    }
    public int getDamage(){
        return this.damage;
    }
    public String getSuperAbility(){
        return this.superAbility;
    }
}
