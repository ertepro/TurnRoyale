package package1;

// --Sams guide to the state pattern in this game
// (1) to be able to meet all the requirements in the state pattern we will have all the troop functions here
// (2) the States the troops themselves have [active - battling - in-deck]
//      * active -> is in the hand
//      * battling -> currently deployed
//      * in-deck -> is in the deck duh
// (3) below are the functions denominated with tags what is in what


public interface TroopActions_StateInterface {

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
