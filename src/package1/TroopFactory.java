package package1;

import package1.Factory.*;

public class TroopFactory {
    public static Troop createTroop(String name) {
        if (name.equalsIgnoreCase("Skeletons")) {
            return new Skeleton();
        } else if (name.equalsIgnoreCase("Archers")) {
            return new Archers();
        } else if (name.equalsIgnoreCase("Arrows")) {
            return new Arrows();
        } else if (name.equalsIgnoreCase("Giant")) {
            return new Giant();
        } else if (name.equalsIgnoreCase("Mini_pekka")) {
            return new MiniPekka();
        } else if (name.equalsIgnoreCase("Baby_dragon")) {
            return new BabyDragon();
        } else if (name.equalsIgnoreCase("Musketeer")) {
            return new Musketeer();
        } else if (name.equalsIgnoreCase("Prince")) {
            return new Prince();
        } else if (name.equalsIgnoreCase("Balloon")) {
            return new Balloon();
        } else if (name.equalsIgnoreCase("Barbarians")) {
            return new Barbarians();
        } else if (name.equalsIgnoreCase("Guards")) {
            return new Guards();
        } else if (name.equalsIgnoreCase("Giant_skeleton")) {
            return new GiantSkeleton();
        } else if (name.equalsIgnoreCase("Witch")) {
            return new Witch();
        } else if (name.equalsIgnoreCase("Valkyrie")) {
            return new Valkyrie();
        } else if (name.equalsIgnoreCase("Wizard")) {
            return new Wizard();
        } else if (name.equalsIgnoreCase("Executioner")) {
            return new Executioner();
        } else if (name.equalsIgnoreCase("Hunter")) {
            return new Hunter();
        } else if (name.equalsIgnoreCase("Royal_ghost")) {
            return new RoyalGhost();
        } else if (name.equalsIgnoreCase("Energy_collector")) {
            return new EnergyCollector();
        } else if (name.equalsIgnoreCase("Mana_wizard")) {
            return new ManaWizard();
        } else if (name.equalsIgnoreCase("Stun_golem")) {
            return new StunGolem();
        } else {
            return null;  // doesn't match anything
        }
    }
}
