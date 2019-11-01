import java.util.ArrayList;

public class Main {
    static void getDamagedSeveralTimes(Unit unit, int times){
        for (int i = 0; i < times; i++)
        {
            unit.getDamaged(10);
        }

        System.out.println(unit.getStatusText());
    }

    public static void main(String[] args) {
        Unit m = new Marine();
        Unit z = new Zealot();

        ArrayList<Unit> units = new ArrayList<>();
        units.add(m);
        units.add(z);

        for (Unit u:units)
            getDamagedSeveralTimes(u, 1);
    }
}
