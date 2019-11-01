import java.util.ArrayList;

public class Main {
    static void getDamagedSeveralTimes(Unit unit, int times){
        for (int i = 0; i < times; i++)
        {
            unit.getDamaged(10);
        }

        System.out.println(unit.getStatusText());
    }

    static void flyAndReturn(Flyable unit, int x, int y){
        unit.fly(x, y);
        unit.fly(1, 2);
    }

    static void cloak(Cloakable unit){
        unit.cloak();
    }

    public static void main(String[] args) {
        Abiter abiter = new Abiter();
        cloak(abiter);
        flyAndReturn(abiter, 1, 2);

        Doorship doorship = new Doorship();
        flyAndReturn(doorship, 100,200);
        Carrier carrier = new Carrier();
        flyAndReturn(carrier, 100,200);

        Marine m1 = new Marine();
        m1.getDamaged(10);
        Marine m2 = new Marine();
        m1.getDamaged(20);
        System.out.println(m1.getHp());
        System.out.println(m2.getHp());
        System.out.println(Marine.getMaxHP());
//        System.out.println(Marine.getCurrentHP());
        m1.getHealed();




        Unit m = new Marine();
        Unit z = new Zealot();

        ArrayList<Unit> units = new ArrayList<>();
        units.add(m);
        units.add(z);

        for (Unit u:units)
            System.out.println(u.getName());

        for (Unit u:units)
            getDamagedSeveralTimes(u, 1);



    }
}
