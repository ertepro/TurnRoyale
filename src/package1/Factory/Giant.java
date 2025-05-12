package package1.Factory;

public class Giant extends package1.Troop implements package1.TroopCreate_FactoryInterface {
    @Override
    public void createTroop() {
        this.name = "Giant";
        this.type = "Ground";
        this.mana_cost = 5;

        this.atk_spd = 1;
        this.a_df = 0;
        this.a_atk = 0;
        this.g_df = 0;
        this.g_atk = 5;

        this.cur_a_df = a_df;
        this.cur_a_atk = a_atk;
        this.cur_g_df = g_df;
        this.cur_g_atk = g_atk;
    }
}
