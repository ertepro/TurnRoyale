package package1;

public class Tower {
    private int Health = 100;

    public Tower (){}

    public int getHealth() {
        return Health;
    }

    public void getAttacked (int dmg) {
        if(Health - dmg <= 0){
            Health = 0;
        }
        Health -= dmg;
    }
}
