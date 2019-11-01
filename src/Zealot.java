public class Zealot {
    public Zealot() {
        hp = 100;
        shield = 50;
    }

    private int hp;
    private int shield;

    public void getDamaged(int damage) {
        while (shield > 0 && damage > 0) {
            shield--;
            damage--;
        }

        while (damage > 0) {
            hp--;
            damage--;
        }
    }

    public int getHp() {
        return hp;
    }

    public int getShield() {
        return shield;
    }
}
