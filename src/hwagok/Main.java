package hwagok;

import blizzard.Marine;
import blizzard.Status;
import blizzard.StatusChangedListener;

public class Main {
    public static void main(String[] args) {
        Marine m = new Marine();

//        m.setOnStatusChangedListener(new StatusChangedListener() {
//            @Override
//            public void changedTo(Status status) {
//                System.out.println("changed to " + status);
//            }
//        });

        m.setOnStatusChangedListener(status -> System.out.println("changed to " + status));

        for (int i = 0; i < 5; i++) {
            m.getDamaged(10);
        }
    }
}
