package package1.Factory;

public class EnergyCollector extends package1.Troop implements package1.TroopCreate_FactoryInterface {
    @Override
    public void createTroop() {
        this.name = "Energy Collector";
        this.type = "Special";
        this.mana_cost = 0;

        this.atk_spd = 0;
        this.a_df = 0;
        this.a_atk = 0;
        this.g_df = 0;
        this.g_atk = 0;
    }
}
