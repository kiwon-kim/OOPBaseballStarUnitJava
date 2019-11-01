package blizzard;

public class Marine{
    public Marine() {
        hp = 50;
        status = Status.Good;
    }

    protected int hp;

    public int getHp() {
        return hp;
    }

    public void getDamaged(int damage){
        while (damage > 0 && hp > 0){
            hp--;
            damage--;

            if (hp < 10)
            {
                status = Status.Danger;
                if (onStatusChangedListener != null)
                    onStatusChangedListener.changedTo(status);
            }
        }
    }

    private Status status;

    private StatusChangedListener onStatusChangedListener;

    public void setOnStatusChangedListener(StatusChangedListener onStatusChangedListener) {
        this.onStatusChangedListener = onStatusChangedListener;
    }
}
