public class Main {
    public static void main(String[] args) {
        Boss krocozila = new Boss();
        krocozila.setHealth(800);
        krocozila.setDamage(140);
        krocozila.setBossDeffence("water-resistant");
        System.out.println("Boss Information: ");
        System.out.println("health: " + krocozila.getHealth());
        System.out.println("damage: " + krocozila.getDamage());
        System.out.println("superAbility: " + krocozila.getBossDeffence());
        System.out.println("----------");
        Hero[] oldSchoolTeam = createHeroes();
        for (int i = 0; i < oldSchoolTeam.length; i++) {
            System.out.println("Hero №"+ i + " Information: ");
            System.out.println("health: " + oldSchoolTeam[i].getHealth());
            System.out.println("damage: " + oldSchoolTeam[i].getDamage());
            if (oldSchoolTeam[i].getSuperAbility() == null){
                System.out.println("superAbility: not_ability");
            }else{
                System.out.println("superAbility: " + oldSchoolTeam[i].getSuperAbility());
            }
        }
    }
    public static Hero[] createHeroes(){
        Hero firefighter = new Hero(200, 300);
        Hero jungleman = new Hero(350, 120);
        Hero hunterDundee = new Hero(400,200, "Big Snare");
        Hero[] Team = new Hero[3];
        Team[0] = firefighter;
        Team[1] = jungleman;
        Team[2] = hunterDundee;
        return Team;
    }
}