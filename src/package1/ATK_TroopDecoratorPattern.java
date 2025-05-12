package package1;

public class ATK_TroopDecoratorPattern extends TroopDecoratorPattern{
    private final int powerUp;

    public ATK_TroopDecoratorPattern(Troop troop, int powerUp) {
        super(troop);
        this.powerUp = powerUp;
    }

    @Override
    public int get_g_atk() {
        return super.get_g_atk() + (int)(powerUp / 100.0);
    }

    @Override
    public int get_cur_g_atk() {
        return super.get_cur_g_atk() + (int)(powerUp / 100.0);
    }

    @Override
    public int get_a_atk() {
        return super.get_a_atk() + (int)(powerUp / 100.0);
    }

    @Override
    public int get_cur_a_atk() {
        return super.get_cur_a_atk() + (int)(powerUp / 100.0);
    }


}
