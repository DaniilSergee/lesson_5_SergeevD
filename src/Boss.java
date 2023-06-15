public class Boss {
    private int health;
    private int damage;
    private String bossDeffence;
    public int getHealth(){
        return this.health;
    }
    public int getDamage(){
        return this.damage;
    }
    public String getBossDeffence(){
        return this.bossDeffence;
    }
    public void setHealth(int newHealth){
        this.health = newHealth;
    }
    public void setDamage(int newDamage){
        this.damage = newDamage;
    }
    public void setBossDeffence(String newBossDeffence){
        this.bossDeffence = newBossDeffence;
    }
}
