package package1;

// --Sams guide to factories in this game
// (1) do not touch anything here - createTroop() will be overriden a ton of times
//      * once per troop type to be exact :)

public interface TroopCreate_FactoryInterface {
    void createTroop();
}
