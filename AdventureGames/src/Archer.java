public class Archer extends Hero {
    public Archer() {
        this.setName("Archer");
        this.setAttack(10);
        this.setHp(100);
        this.setWeapon("Bow and Arrow");
        this.setAttribute();
        this.sethMaryAtt(20);
    }

    public void Attack(Monster monster) {
        super.Attack(monster);
        System.out.println("I attack with arrows");
    }
}