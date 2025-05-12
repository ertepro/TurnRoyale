package package1;

public abstract class TroopDecoratorPattern extends Troop {
    protected final Troop decoratedTroop;

    public TroopDecoratorPattern(Troop troop) {
        this.decoratedTroop = troop;
        this.name = troop.get_n();
        this.type = troop.get_t();
        this.mana_cost = troop.get_m();
        this.atk_spd = troop.get_as();
        this.a_df = troop.get_a_df();
        this.g_df = troop.get_g_df();
        this.a_atk = troop.get_a_atk();
        this.g_atk = troop.get_g_atk();

        // Currents
        this.cur_atk_spd = troop.get_cur_as();
        this.cur_a_df = troop.get_cur_a_df();
        this.cur_g_df = troop.get_cur_g_df();
        this.cur_a_atk = troop.get_cur_a_atk();
        this.cur_g_atk = troop.get_cur_g_atk();
    }
}