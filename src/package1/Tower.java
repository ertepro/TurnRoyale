package package1;

public class Tower {
    private int Health = 100;

    public Tower (){}

    public int getHealth() {
        return Health;
    }

    public void getAttacked (int dmg) {
        Health -= dmg;
    }
}
