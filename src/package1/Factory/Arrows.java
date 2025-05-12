package package1.Factory;

public class Arrows extends package1.Troop implements package1.TroopCreate_FactoryInterface {
    @Override
    public void createTroop() {
        this.name = "Arrows";
        this.type = "Air";
        this.mana_cost = 2;

        this.atk_spd = 1;
        this.a_df = 15;
        this.a_atk = 15;
        this.g_df = 0;
        this.g_atk = 2;

        this.cur_a_df = a_df;
        this.cur_a_atk = a_atk;
        this.cur_g_df = g_df;
        this.cur_g_atk = g_atk;
    }
}
