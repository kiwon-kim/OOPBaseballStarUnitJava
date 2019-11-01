public class Doorship extends Unit implements Flyable{
    @Override
    String getNameCore() {
        return "Doorship";
    }

    private boolean speedUpgraded;

    @Override
    public void fly(int x, int y) {
        if (speedUpgraded)
        {
            setX(x * 2);
            setY(y * 2);
        }
        else
        {
            setX(x);
            setY(y);
        }
    }
}
