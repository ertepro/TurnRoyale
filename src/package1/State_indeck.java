package package1;

public class State_indeck {
    // basic values [active/in-deck/battling]
    String getName();
    String getType();
    int getManaCost();

    // the initial values of such [active/in-deck/battling]
    int getGroundDamage();
    int getAirDamage();
    int getGroundDefense();
    int getAirDefense();
    int getAtkSpeed();

    // the getters of the current [active/in-deck/battling]
    int getCurrGroundDamage();
    int getCurrAirDamage();
    int getCurrGroundDefense();
    int getCurrAirDefense();
    int getCurrAtkSpeed();

    // setters [battling]
    void setCurrGroundDamage(int currGroundDamage);
    void setCurrAirDamage(int currAirDamage);
    void setCurrGroundDefense(int currGroundDefense);
    void setCurrAirDefense(int currAirDefense);
    void setCurrAtkSpeed(int currAtkSpeed);

    // strategy
    void specialAbility();
}
