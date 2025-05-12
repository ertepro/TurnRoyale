package package1;

import java.util.Observer;

public class TowerUpdate_TowerObserver implements TowerUpdate_ObserverPattern {
    @Override
    public int update(int hp){
        //code that will happen if the towers suffer dmg
        if(hp<=0){
            //case where the tower is no more
            return 0;
        }
        return 1;
    }
}
