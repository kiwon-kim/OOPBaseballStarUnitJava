public abstract class Unit {
    protected int hp;

    public int getHp() {
        return hp;
    }

    public void getDamaged(int damage){
        while (damage > 0 && hp > 0){
            hp--;
            damage--;
        }
    }
}
