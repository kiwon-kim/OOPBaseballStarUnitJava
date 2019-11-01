public abstract class ProtossUnit extends Unit {
    protected int shield;

    public int getShield() {
        return shield;
    }

    @Override
    public void getDamaged(int damage) {
        while (shield > 0 && damage > 0){
            shield--;
            damage--;
        }

        super.getDamaged(damage);
    }

    @Override
    public String getStatusText() {
        return String.format("HP : %d, Shield : %d", hp, shield);
    }
}
