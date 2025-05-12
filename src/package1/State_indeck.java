package package1;

public class State_indeck implements TroopActions_StateInterface {

    //getters for some basic meta stats
    @Override
    public String getName(Troop t){
        return t.get_n();
    }

    @Override
    public String getType(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getType(Troop t)] from [in-deck] state");
    }

    @Override
    public int getManaCost(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getManaCost(Troop t)] from [in-deck] state");
    }

    // Getter for some basic battle stats
    @Override
    public int getGroundDamage(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getGroundDamage(Troop t)] from [in-deck] state");
    }

    @Override
    public int getAirDamage(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getAirDamage(Troop t)] from [in-deck] state");
    }

    @Override
    public int getGroundDefense(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getGroundDefense(Troop t)] from [in-deck] state");
    }

    @Override
    public int getAirDefense(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getAirDefense(Troop t)] from [in-deck] state");
    }

    @Override
    public int getAtkSpeed(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getAtkSpeed(Troop t)] from [in-deck] state");
    }

    //methods this state cannot employ

    @Override
    public int getCurrGroundDamage(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getCurrGroundDamage(Troop t)] from [in-deck] state");
    }

    @Override
    public int getCurrAirDamage(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getCurrAirDamage(Troop t)] from [in-deck] state");
    }

    @Override
    public int getCurrGroundDefense(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getCurrGroundDefense(Troop t)] from [in-deck] state");
    }

    @Override
    public int getCurrAirDefense(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getCurrAirDefense(Troop t)] from [in-deck] state");
    }

    @Override
    public int getCurrAtkSpeed(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getCurrAtkSpeed(Troop t)] from [in-deck] state");
    }

    @Override
    public void setCurrGroundDamage(Troop t, int currGroundDamage) {
        throw new UnsupportedOperationException("Error: tried [setCurrGroundDamage(Troop t, int n)] from [in-deck] state");
    }

    @Override
    public void setCurrAirDamage(Troop t, int currAirDamage) {
        throw new UnsupportedOperationException("Error: tried [setCurrAirDamage(Troop t, int n)] from [in-deck] state");
    }

    @Override
    public void setCurrGroundDefense(Troop t, int currGroundDefense) {
        throw new UnsupportedOperationException("Error: tried [setCurrGroundDefense(Troop t, int n)] from [in-deck] state");
    }

    @Override
    public void setCurrAirDefense(Troop t, int currAirDefense) {
        throw new UnsupportedOperationException("Error: tried [setCurrAirDefense(Troop t, int n)] from [in-deck] state");
    }

    @Override
    public void setCurrAtkSpeed(Troop t, int currAtkSpeed) {
        throw new UnsupportedOperationException("Error: tried [setCurrAtkSpeed(Troop t, int n)] from [in-deck] state");
    }

    @Override
    public void set_specialAbility(Troop t,TroopSpecialATK_StrategyInterface strategy){
        throw new UnsupportedOperationException("Error: tried [set_specialAbility(Troop t, Strategy] from [in-deck] state");
    }

    @Override
    public TroopSpecialATK_StrategyInterface get_specialAbility(Troop t){
        throw new UnsupportedOperationException("Error: tried [get_specialAbility(Troop t)] from [in-deck] state");
    }

    @Override
    public void use_specialAbility(Troop t){
        throw new UnsupportedOperationException("Error: tried [use_specialAbility(Troop t)] from [in-deck] state");
    }
}
