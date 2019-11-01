import javax.print.DocFlavor;

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

    public String getStatusText() {
        return String.format("HP : %d", hp);
    }

    public final String getName(){
        return "I am " + getNameCore() + "^^";
    }

    abstract String getNameCore();

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
