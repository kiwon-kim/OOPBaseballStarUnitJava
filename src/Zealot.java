public class Zealot {
    private int hp;
    private int shield;

    public void getDamaged(int damage) {
        while (shield > 0) {
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
