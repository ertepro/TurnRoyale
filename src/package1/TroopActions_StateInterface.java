package package1;

// --Sams guide to the state pattern in this game
// (1) to be able to meet all the requirements in the state pattern we will have all the troop functions here
// (2) the States the troops themselves have [active - battling - in-deck]
//      * active -> is in the hand
//      * battling -> currently deployed
//      * in-deck -> is in the deck duh
// (3) below are the functions denominated with tags what is in what


public interface TroopActions_StateInterface {

    // basic values [active/battling]
    String getName(Troop t); // [+ in-deck]
    String getType(Troop t);
    int getManaCost(Troop t);

    // the initial values of such [active/battling]
    int getGroundDamage(Troop t);
    int getAirDamage(Troop t);
    int getGroundDefense(Troop t);
    int getAirDefense(Troop t);
    int getAtkSpeed(Troop t);

    // the getters of the current [battling]
    int getCurrGroundDamage(Troop t);
    int getCurrAirDamage(Troop t);
    int getCurrGroundDefense(Troop t);
    int getCurrAirDefense(Troop t);
    int getCurrAtkSpeed(Troop t);

    // setters [battling]
    void setCurrGroundDamage(Troop t, int currGroundDamage);
    void setCurrAirDamage(Troop t, int currAirDamage);
    void setCurrGroundDefense(Troop t, int currGroundDefense);
    void setCurrAirDefense(Troop t, int currAirDefense);
    void setCurrAtkSpeed(Troop t, int currAtkSpeed);

    // strategy
    void specialAbility(Troop t);

}
