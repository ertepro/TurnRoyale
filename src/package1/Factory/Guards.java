package package1.Factory;


public class Guards extends package1.Troop implements package1.TroopCreate_FactoryInterface {
    @Override
    public void createTroop() {
        this.name = "Guards";
        this.type = "Ground";
        this.mana_cost = 3;

        this.atk_spd = 2;
        this.a_df = 0;
        this.a_atk = 0;
        this.g_df = 3;
        this.g_atk = 3;
    }
}
