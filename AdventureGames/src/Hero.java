
import java.util.Scanner;

public class Hero implements Actions {
    private String name;
    private int hp;
    private int attack;
    private String[] attributes;
    private int num;
    private String attribute;
    private String weapon;
    private int hpHeal;
    private int hMaryAtt;
Scanner in = new Scanner(System.in);


    public Hero() {

        this.attributes = new String[]{"air", "fire", "water", "earth"};
        this.name = "Hero";
        this.hp = 100;
        this.attack = 10;
        this.weapon = "Stick";
    }

    public Hero(String name, int hp, int attack, String weapon, int hpHeal, int hMaryAtt) {

        this.attributes = new String[]{"air", "fire", "water", "earth"};
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.weapon = weapon;
        this.hpHeal = hpHeal;
        this.hMaryAtt = hMaryAtt;
        this.attribute = this.attributes[this.pickAttribute()];
        System.out.println(name + "\n" + this.attribute + this.num);
    }

    public int pickAttribute() {
        System.out.println("Pick a attribute \n 0 for air \n 1 for fire \n 2 for water \n 3 for earth ");
        this.num = this.in.nextInt();
        return this.num;
    }

    public void Attack(Monster monster) {

        monster.takeDamage(this.attack);
    }

    public void hailMary(Monster monster) {

        monster.takeDamage(this.gethMaryAtt());
    }

    public void heal() {
        System.out.println(this.getHp());
        int hp = this.getHp();
        this.setHp(hp + 20);
        System.out.println(this.getHp());
        System.out.println("Archer heals himself for 20 hp and now has " + this.getHp() + "hp");
    }

    public void takeDamage(int MonstDamage) {
        System.out.println(this.getHp());
        this.setHp(this.getHp() - MonstDamage);
        System.out.println("Monster attacks dealing " + MonstDamage + " leaving the hero with " + this.getHp());
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }

    public void setAttack(int attack) {

        this.attack = attack;
    }

    public void setWeapon(String weapon) {

        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAttack() {
        return this.attack;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setAttribute() {
        this.attribute = this.attributes[this.pickAttribute()];
    }

    public String getAttribute() {
        return this.attribute;
    }

    public int gethMaryAtt() {
        return this.hMaryAtt;
    }

    public void sethMaryAtt(int hMaryAtt) {
        this.hMaryAtt = hMaryAtt;
    }
}
