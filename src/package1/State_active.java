package package1;

public class State_active implements TroopActions_StateInterface {

    //getters for some basic meta stats
    @Override
    public String getName(Troop t){
        return t.get_n();
    }

    @Override
    public String getType(Troop t){
        return t.get_t();
    }

    @Override
    public int getManaCost(Troop t){
        return t.get_m();
    }

    //getters for some basic battle stats
    @Override
    public int getGroundDamage(Troop t){
        return t.get_g_atk();
    }

    @Override
    public int getAirDamage(Troop t){
        return t.get_a_atk();
    }

    @Override
    public int getGroundDefense(Troop t){
        return t.get_g_df();
    }

    @Override
    public int getAirDefense(Troop t){
        return t.get_a_df();
    }

    @Override
    public int getAtkSpeed(Troop t){
        return t.get_as();
    }

    //methods this state cannot employ

    @Override
    public int getCurrGroundDamage(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getCurrGroundDamage(Troop t)] from [active] state");
    }

    @Override
    public int getCurrAirDamage(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getCurrAirDamage(Troop t)] from [active] state");
    }

    @Override
    public int getCurrGroundDefense(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getCurrGroundDefense(Troop t)] from [active] state");
    }

    @Override
    public int getCurrAirDefense(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getCurrAirDefense(Troop t)] from [active] state");
    }

    @Override
    public int getCurrAtkSpeed(Troop t) {
        throw new UnsupportedOperationException("Error: tried [getCurrAtkSpeed(Troop t)] from [active] state");
    }

    @Override
    public void setCurrGroundDamage(Troop t, int currGroundDamage) {
        throw new UnsupportedOperationException("Error: tried [setCurrGroundDamage(Troop t, int n)] from [active] state");
    }

    @Override
    public void setCurrAirDamage(Troop t, int currAirDamage) {
        throw new UnsupportedOperationException("Error: tried [setCurrAirDamage(Troop t, int n)] from [active] state");
    }

    @Override
    public void setCurrGroundDefense(Troop t, int currGroundDefense) {
        throw new UnsupportedOperationException("Error: tried [setCurrGroundDefense(Troop t, int n)] from [active] state");
    }

    @Override
    public void setCurrAirDefense(Troop t, int currAirDefense) {
        throw new UnsupportedOperationException("Error: tried [setCurrAirDefense(Troop t, int n)] from [active] state");
    }

    @Override
    public void setCurrAtkSpeed(Troop t, int currAtkSpeed) {
        throw new UnsupportedOperationException("Error: tried [setCurrAtkSpeed(Troop t, int n)] from [active] state");
    }

    @Override
    public void specialAbility(Troop t) {
        throw new UnsupportedOperationException("Error: tried [specialAbility(Troop t, int n)] from [active] state");
    }
}
