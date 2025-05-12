package package1;

public abstract class Troop {

    // meta stats
    protected String name;
    protected String type;
    protected int mana_cost;

    // game stats
    protected int atk_spd;
    protected int a_df;
    protected int g_df;
    protected int a_atk;
    protected int g_atk;

    //current game stats
    protected int cur_atk_spd;
    protected int cur_a_df;
    protected int cur_g_df;
    protected int cur_a_atk;
    protected int cur_g_atk;


    // patterns
    protected TroopActions_StateInterface state;
    protected TroopSpecialATK_StrategyInterface strategy;

    //basic functions [DO NOT USE OUTSIDE STATE PATTERN]

    //meta stats
    public String get_n() {
        return name;
    }
    public void set_n(String n){
        name = n;
    }

    public int get_m(){
        return mana_cost;
    }
    public void set_m(int m){
        mana_cost = m;
    }

    public String get_t(){
        return type;
    }
    public void set_t(String t){
        type = t;
    }

    // game stats
    public int get_as(){
        return atk_spd;
    }
    public void set_as(int atk){
        atk_spd = atk;
    }
    public int get_cur_as(){
        return cur_atk_spd;
    }

    public int get_a_df(){
        return a_df;
    }
    public void set_a_df(int a_df){
        this.a_df = a_df;
    }
    public int get_cur_a_df(){
        return cur_a_df;
    }

    public int get_g_df(){
        return g_df;
    }
    public void set_g_df(int g_df){
        this.g_df = g_df;
    }
    public int get_cur_g_df(){
        return cur_g_df;
    }

    public int get_a_atk(){
        return a_atk;
    }
    public void set_a_atk(int a_atk){
        this.a_atk = a_atk;
    }
    public int get_cur_a_atk(){
        return cur_a_atk;
    }

    public int get_g_atk(){
        return g_atk;
    }
    public void set_g_atk(int g_atk){
        this.g_atk = g_atk;
    }
    public int get_cur_g_atk(){
        return cur_g_atk;
    }

    //state methods
    public void set_state(TroopActions_StateInterface state){
        this.state = state;
    }

    public TroopActions_StateInterface get_state(){
        return state;
    }

    //strategy methods
    public void set_strategy(TroopSpecialATK_StrategyInterface strategy){
        this.strategy = strategy;
    }

    public TroopSpecialATK_StrategyInterface get_strategy(){
        return strategy;
    }

    public void use_special_atk(){
        if(strategy != null){
            strategy.specialATK();
        }
    }
}
