public class Monster implements MonsterActions {
    private String name;
    private int Mhp;
    private int Monstattack;
    private String description;

    public Monster() {
        this.name = "Lou";
        this.Mhp = 100;
        this.Monstattack = 15;
        this.description = "A monster from te depths of hell ment to destroy the world";
    }

    public Monster(String name, int Mhp, int Monstattack, String description) {
        this.name = name;
        this.Mhp = Mhp;
        this.Monstattack = Monstattack;
        this.description = description;
    }

    public void attack(Hero hero) {
        hero.takeDamage(this.getMonstattack());
    }

    public void run() {
        System.out.println("Big foot has had enough of a beating for now and is fleeing!!!!!!!! YOU WON");
        game.end();
    }

    public void takeDamage(int attack) {
        System.out.println("Monster has" + this.getMhp());
        System.out.println("Monster gets hit with " + attack);
        this.setMhp(this.getMhp() - attack);
        System.out.println("Monster now has " + this.getMhp() + "hp");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMhp() {
        return this.Mhp;
    }

    public void setMhp(int mhp) {
        this.Mhp = mhp;
    }

    public int getMonstattack() {
        return this.Monstattack;
    }

    public void setMonstattack(int Monstattack) {
        this.Monstattack = Monstattack;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
