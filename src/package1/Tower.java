package package1;

public class Tower {
    private int Health = 100;
    TowerUpdate_ObserverPattern observer;

    public Tower (){}

    public int getHealth() {
        return Health;
    }

    public void getAttacked (int dmg) {
        Health -= dmg;
        observer.update(Health);
    }

    public void setObserver (TowerUpdate_ObserverPattern observer) {
        this.observer = observer;
    }
}
