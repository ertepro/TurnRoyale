package package1;

public class Main {
    public static void main(String[] args) {
        TroopFactory factory = new TroopFactory();
        Troop skeleton = factory.createTroop(TroopType.SKELETONS);

        // GameController game = new GameController();

        // Testing of skeletons
        System.out.println("getName():             " + skeleton.getName());
        System.out.println("getType():             " + skeleton.getType());
        System.out.println("getManaCost():         " + skeleton.getManaCost());
        System.out.println("getGroundDamage():     " + skeleton.getGroundDamage());
        System.out.println("getAirDamage():        " + skeleton.getAirDamage());
        System.out.println("getGroundDefense():    " + skeleton.getGroundDefense());
        System.out.println("getAirDefense():       " + skeleton.getAirDefense());

        // current‐stat getters
        System.out.println("getCurrGroundDamage(): " + skeleton.getCurrGroundDamage());
        System.out.println("getCurrAirDamage():    " + skeleton.getCurrAirDamage());
        System.out.println("getCurrGroundDefense():" + skeleton.getCurrGroundDefense());
        System.out.println("getCurrAirDefense():   " + skeleton.getCurrAirDefense());

        //game.runGame();
    }
}