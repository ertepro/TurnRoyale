package package1.Factory;

public class Skeleton extends package1.Troop implements package1.TroopCreate_FactoryInterface {
    @Override
    public void createTroop(){
        this.name = "Skeleton";
        this.type = "Ground";
        this.mana_cost = 2;

        this.atk_spd = 2;
        this.a_df = 0;
        this.a_atk = 0;
        this.g_df = 2;
        this.g_atk = 12;
    }
}
