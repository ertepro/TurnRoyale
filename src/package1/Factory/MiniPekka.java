package package1.Factory;

public class MiniPekka extends package1.Troop implements package1.TroopCreate_FactoryInterface {
    @Override
    public void createTroop() {
        this.name = "Mini P.E.K.K.A";
        this.type = "Ground";
        this.mana_cost = 4;

        this.atk_spd = 1;
        this.a_df = 0;
        this.a_atk = 0;
        this.g_df = 0;
        this.g_atk = 4;
    }
}