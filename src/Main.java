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

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Hero"+ i + " Information: ");
            System.out.println("health: " + createHeroes()[i].getHealth());
            System.out.println("damage: " + createHeroes()[i].getDamage());
            System.out.println("superAbility: " + createHeroes()[i].getSuperAbility());
        }
    }
    public static Hero[] createHeroes(){
        Hero firefighter = new Hero(200, 300);
        Hero jungleman = new Hero(350, 120);
        Hero hunterDundee = new Hero(400,200, "Big Snare");
        Hero[] oldSchoolTeam = new Hero[3];
        oldSchoolTeam[0] = firefighter;
        oldSchoolTeam[1] = jungleman;
        oldSchoolTeam[2] = hunterDundee;
        return oldSchoolTeam;
    }
}