package package1;

public class Tower {
    private int Health = 100;
    TowerUpdate_ObserverPattern observer;

    public Tower (){}

    public int getHealth() {
        return Health;
    }

    public void getAttacked (int dmg,PointTracker_SingletonPattern a,int who) {
        Health -= dmg;
        if(who == 1){
            a.setPlayer1_score(Health);
        } else {
            a.setPlayer2_score(Health);
        }

        if(observer.update(Health) == 0){
            a.set_game_rule(0);
        }
    }

    public void setObserver (TowerUpdate_ObserverPattern observer) {
        this.observer = observer;
    }
}
