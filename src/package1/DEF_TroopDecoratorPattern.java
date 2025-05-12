package package1;

public class DEF_TroopDecoratorPattern extends TroopDecoratorPattern{
    private final int powerUp;

    public DEF_TroopDecoratorPattern(Troop troop, int powerUp) {
        super(troop);
        this.powerUp = powerUp;
    }

    @Override
    public int get_g_df() {
        return super.get_g_df() + (int)(powerUp / 100.0);
    }

    @Override
    public int get_cur_g_df() {
        return super.get_cur_g_df() + (int)(powerUp / 100.0);
    }

    @Override
    public int get_a_df() {
        return super.get_a_df() + (int)(powerUp / 100.0);
    }

    @Override
    public int get_cur_a_df() {
        return super.get_cur_a_atk() + (int)(powerUp / 100.0);
    }


}
