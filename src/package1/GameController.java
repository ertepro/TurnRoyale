package package1;

import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println("there are all the cards:");
        for(Troop t : all_cards){
            TroopActions_StateInterface a = new State_active(); // or State_active, etc.
            t.set_state(a);
            System.out.println("CARD: " + a.getName(t) + " g_atk:" + a.getGroundDamage(t) +
                    " a_atk:" + a.getAirDamage(t) + " g_df:" + a.getGroundDefense(t) + " a_df:" + a.getAirDefense(t) +
                    " atk_spd:" + a.getAtkSpeed(t) + " type:" + a.getType(t) + " mana_cost:" + a.getManaCost(t)
            );
        }

        System.out.println("Player 1, choose your deck");
        System.out.println("pick 7 cards from the available");
        // Player 1 picks 7 cards
        System.out.println("\nPlayer 1, choose your deck by picking 7 cards from the available list.");
        Scanner scan = new Scanner(System.in);
        Deck deck1 = new Deck();
        for (int i = 0; i < 7; i++) {
            boolean validChoice = false;
            while (!validChoice) {
                System.out.println("Enter the card name for card " + (i + 1) + " (e.g., Skeletons, Archers, Giant): ");
                String cardName = scan.nextLine();

                // Check if the card is in the list
                Troop chosenCard = null;
                TroopActions_StateInterface a = null;
                for (Troop t : all_cards) {
                    a = t.get_state();
                    if (a.getName(t).equalsIgnoreCase(cardName)) {
                        chosenCard = t;
                        break;
                    }
                }

                if (chosenCard != null) {
                    deck1.addCard(chosenCard); // Add the selected card to the deck
                    System.out.println("You selected: " + a.getName(chosenCard));
                    validChoice = true; // Valid choice, exit loop
                } else {
                    System.out.println("Invalid card name, please choose a valid card.");
                }
            }
        }

        // Display Player 1's deck

        // Player 2 picks 7 cards
        System.out.println("\nPlayer 2, choose your deck by picking 7 cards from the available list.");
        Deck deck2 = new Deck();
        for (int i = 0; i < 7; i++) {
            boolean validChoice = false;
            while (!validChoice) {
                System.out.println("Enter the card name for card " + (i + 1) + " (e.g., Skeletons, Archers, Giant): ");
                String cardName = scan.nextLine();

                // Check if the card is in the list
                Troop chosenCard = null;
                TroopActions_StateInterface a = null;
                for (Troop t : all_cards) {
                    a = t.get_state();
                    if (a.getName(t).equalsIgnoreCase(cardName)) {
                        chosenCard = t;
                        break;
                    }
                }

                if (chosenCard != null) {
                    deck2.addCard(chosenCard); // Add the selected card to the deck
                    System.out.println("You selected: " + a.getName(chosenCard));
                    validChoice = true; // Valid choice, exit loop
                } else {
                    System.out.println("Invalid card name, please choose a valid card.");
                }
            }
        }

    }
}
