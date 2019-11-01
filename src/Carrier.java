public class Carrier extends ProtossUnit implements Flyable{
    @Override
    String getNameCore() {
        return "Carrier";
    }

    @Override
    public void fly(int x, int y) {
        setX(x);
        setY(y);
    }
}
