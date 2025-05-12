package package1;

import package1.Factory.*;

public class TroopFactory {

    TroopFactory() {}

    public static Troop createTroop(String name) {
        if (name.equalsIgnoreCase("Skeletons")) {
            Skeleton t = new Skeleton();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Archers")) {
            Archers t = new Archers();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Arrows")) {
            Arrows t = new Arrows();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Giant")) {
            Giant t = new Giant();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Mini_pekka")) {
            MiniPekka t = new MiniPekka();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Baby_dragon")) {
            BabyDragon t = new BabyDragon();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Musketeer")) {
            Musketeer t = new Musketeer();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Prince")) {
            Prince t = new Prince();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Balloon")) {
            Balloon t = new Balloon();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Barbarians")) {
            Barbarians t = new Barbarians();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Guards")) {
            Guards t = new Guards();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Giant_skeleton")) {
            GiantSkeleton t = new GiantSkeleton();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Witch")) {
            Witch t = new Witch();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Valkyrie")) {
            Valkyrie t = new Valkyrie();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Wizard")) {
            Wizard t = new Wizard();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Executioner")) {
            Executioner t = new Executioner();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Hunter")) {
            Hunter t = new Hunter();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Royal_ghost")) {
            RoyalGhost t = new RoyalGhost();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Energy_collector")) {
            EnergyCollector t = new EnergyCollector();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Mana_wizard")) {
            ManaWizard t = new ManaWizard();
            t.createTroop();
            return t;
        } else if (name.equalsIgnoreCase("Stun_golem")) {
            StunGolem t = new StunGolem();
            t.createTroop();
            return t;
        } else {
            return null;
        }
    }
}
