public class Marine extends Unit{
    public Marine() {
        hp = 50;
    }

    private static int maxHP = 50;

    public static int getMaxHP() {
        return maxHP;
    }
    
    void getHealed(){
        hp = maxHP;
    }

    @Override
    public String getNameCore() {
        return "Marine";
    }
}
