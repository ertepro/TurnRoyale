package package1;

public class State_indeck implements TroopActions_StateInterface {

    @Override
    public String getName(Troop t){
        return t.get_n();
    }

    String getType(Troop t);
    int getManaCost(Troop t);

    // the initial values of such [active/in-deck/battling]
    int getGroundDamage(Troop t);
    int getAirDamage(Troop t);
    int getGroundDefense(Troop t);
    int getAirDefense(Troop t);
    int getAtkSpeed(Troop t);

    // the getters of the current [active/in-deck/battling]
    int getCurrGroundDamage(Troop t);
    int getCurrAirDamage(Troop t);
    int getCurrGroundDefense(Troop t);
    int getCurrAirDefense(Troop t);
    int getCurrAtkSpeed(Troop t);

    // setters [battling]
    void setCurrGroundDamage(Troop t, int currGroundDamage);
    void setCurrAirDamage(Troop t, int currAirDamage);
    void setCurrGroundDefense(Troop t, int currGroundDefense);
    void setCurrGroundDefense(Troop t, int currGroundDefense);
    void setCurrAirDefense(Troop t, int currAirDefense);
    void setCurrAtkSpeed(Troop t, int currAtkSpeed);
    void setCurrAtkSpeed(Troop t, int currAtkSpeed);

    // strategy
    void specialAbility(Troop t);

}
