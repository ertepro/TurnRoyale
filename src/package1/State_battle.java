package package1;

public class State_battle implements TroopActions_StateInterface {

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

    // -- in game methods

    @Override
    public int getCurrGroundDamage(Troop t) {
        return t.get_g_atk();
    }

    @Override
    public int getCurrAirDamage(Troop t) {
        return t.get_a_atk();
    }

    @Override
    public int getCurrGroundDefense(Troop t) {
        return t.get_a_df();
    }

    @Override
    public int getCurrAirDefense(Troop t) {
        return t.get_a_df();
    }

    @Override
    public int getCurrAtkSpeed(Troop t) {
        return t.get_a_atk();
    }

    @Override
    public void setCurrGroundDamage(Troop t, int currGroundDamage) {
        t.set_g_atk(currGroundDamage);
    }

    @Override
    public void setCurrAirDamage(Troop t, int currAirDamage) {
        t.set_a_atk(currAirDamage);
    }

    @Override
    public void setCurrGroundDefense(Troop t, int currGroundDefense) {
        t.set_g_df(currGroundDefense);
    }

    @Override
    public void setCurrAirDefense(Troop t, int currAirDefense) {
        t.set_a_df(currAirDefense);
    }

    @Override
    public void setCurrAtkSpeed(Troop t, int currAtkSpeed) {
        t.set_as(currAtkSpeed);
    }


    //strategy pattern methods
    @Override
    public void set_specialAbility(Troop t,TroopSpecialATK_StrategyInterface strategy){
        t.set_strategy(strategy);
    }

    @Override
    public TroopSpecialATK_StrategyInterface get_specialAbility(Troop t){
        return t.get_strategy();
    }

    @Override
    public void use_specialAbility(Troop t){
        t.use_special_atk();
    }
}
