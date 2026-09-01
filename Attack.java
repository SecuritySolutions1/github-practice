public class Attack {
    String name;
    int damage;

    public Attack(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void displayAttack() {
        System.out.println(name + " dealt " + damage + " total damage.");
    }
}