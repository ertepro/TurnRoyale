package package1;

import java.util.Observer;

public class TowerUpdate_TowerObserver implements TowerUpdate_ObserverPattern {
    @Override
    public void update(int hp){
        //code that will happen if the towers suffer dmg
        System.out.println("ouch");
    }
}
