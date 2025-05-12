package package1;

import java.util.ArrayList;

public class GameController {

    public void run()
    {
        //we create our factory
        TroopFactory TroopFactory = new TroopFactory();
        ArrayList<Troop> all_cards = new ArrayList<>();

        all_cards.add(package1.TroopFactory.createTroop("Skeletons"));
        all_cards.add(package1.TroopFactory.createTroop("Archers"));
        all_cards.add(package1.TroopFactory.createTroop("Arrows"));
        all_cards.add(package1.TroopFactory.createTroop("Giant"));
        all_cards.add(package1.TroopFactory.createTroop("Mini_pekka"));
        all_cards.add(package1.TroopFactory.createTroop("Baby_dragon"));
        all_cards.add(package1.TroopFactory.createTroop("Musketeer"));
        all_cards.add(package1.TroopFactory.createTroop("Prince"));
        all_cards.add(package1.TroopFactory.createTroop("Balloon"));
        all_cards.add(package1.TroopFactory.createTroop("Barbarians"));
        all_cards.add(package1.TroopFactory.createTroop("Guards"));
        all_cards.add(package1.TroopFactory.createTroop("Giant_skeleton"));
        all_cards.add(package1.TroopFactory.createTroop("Witch"));
        all_cards.add(package1.TroopFactory.createTroop("Valkyrie"));
        all_cards.add(package1.TroopFactory.createTroop("Wizard"));
        all_cards.add(package1.TroopFactory.createTroop("Executioner"));
        all_cards.add(package1.TroopFactory.createTroop("Hunter"));
        all_cards.add(package1.TroopFactory.createTroop("Royal_ghost"));
        all_cards.add(package1.TroopFactory.createTroop("Energy_collector"));
        all_cards.add(package1.TroopFactory.createTroop("Mana_wizard"));
        all_cards.add(package1.TroopFactory.createTroop("Stun_golem"));

        //here we begin all the game
        System.out.println("Player 1, choose your deck");
        System.out.println("pick 7 cards from: ");
        for(Troop t : all_cards){
            TroopActions_StateInterface a = new State_active(); // or State_active, etc.
            t.set_state(a);
            System.out.println("CARD: " + a.getName(t) + " g_atk:" + a.getGroundDamage(t) +
                    " a_atk:" + a.getAirDamage(t) + " g_df:" + a.getGroundDefense(t) + " a_df:" + a.getAirDefense(t) +
                    " atk_spd:" + a.getAtkSpeed(t) + " type:" + a.getType(t) + " mana_cost:" + a.getManaCost(t)
            );
        }

        System.out.println("Player 2, choose your deck");
    }
    // START
    // add score
    // create players
    // add observer?
    // add factory
    // define turns


    // MAIN LOOP

    // menu for selecting each player's deck

    // -Mana manager-
    // Add mana to the players based on reg
    // Pay the mana after deploying the card

    // -Turns-
    // Switch turn
    // Show menu
    // Peek a card
    // Call play Card or not if it has no mana (skip turn)

    // -Battle sys-
    // resolve combat (TroopA,TroopB)

    // Observers to the towers
    // Update score




    // end turn


}
