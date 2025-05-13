package package1;

import java.util.ArrayList;
import java.util.List;
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

        //we create the 2 players
        Player plr1 = new Player(deck1);
        TowerUpdate_ObserverPattern obs1 = new TowerUpdate_TowerObserver();
        Tower t1 = new Tower();
        t1.setObserver(obs1);


        Player plr2 = new Player(deck2);
        TowerUpdate_ObserverPattern obs2 = new TowerUpdate_TowerObserver();
        Tower t2 = new Tower();
        t2.setObserver(obs2);

        //we create the point tracker
        PointTracker_SingletonPattern score = PointTracker_SingletonPattern.getInstance();

        while (score.get_game_rule() == 1) {
            // === Player 1 Turn ===
            System.out.println("\nPlayer 1 mana:"+plr1.getMana()+" your turn:");
            plr1.getDeck().shuffle();
            List<Troop> hand1 = plr1.getDeck().getFirstThree();

            displayHand(hand1);
            Troop chosenCard1 = chooseCard(scan, hand1, plr1);

            // === Player 2 Turn ===
            System.out.println("\nPlayer 2 mana:"+plr2.getMana()+" your turn:");
            plr2.getDeck().shuffle();
            List<Troop> hand2 = plr2.getDeck().getFirstThree();

            displayHand(hand2);
            Troop chosenCard2 = chooseCard(scan, hand2, plr2);

            // === Game Logic After Selection ===
            if (chosenCard1 != null && chosenCard2 != null) {

            } else if (chosenCard1 != null) {
                //we just apply all the dmg of the troop
                TroopActions_StateInterface a = new State_battle();
                int dmg = a.getGroundDamage(chosenCard2);
                plr1.get_tower().getAttacked(dmg,score,2);
            } else if (chosenCard2 != null) {
                TroopActions_StateInterface a = new State_battle();
                int dmg = a.getGroundDamage(chosenCard1);
                plr2.get_tower().getAttacked(dmg,score,1);
            } else {
                //the case where the 2 troops fight each other
                TroopActions_StateInterface a = new State_battle();
                TroopActions_StateInterface b = new State_battle();
                Troop r  = runCombat(chosenCard1,chosenCard2);
                if(a.getName(r) == b.getName(chosenCard1)) {
                    a = new State_battle();
                    int dmg = a.getGroundDamage(chosenCard1);
                    plr2.get_tower().getAttacked(dmg,score,1);
                } else if (a.getName(r) == b.getName(chosenCard2)) {
                    a = new State_battle();
                    int dmg = a.getGroundDamage(chosenCard2);
                    plr1.get_tower().getAttacked(dmg,score,2);
                } else {

                }
            }
            plr1.upMana();
            plr2.upMana();
        }

    }

    private void displayHand(List<Troop> hand) {
        for (int i = 0; i < hand.size(); i++) {
            Troop t = hand.get(i);
            TroopActions_StateInterface a = new State_active();
            t.set_state(a);
            System.out.println((i + 1) + ": " + a.getName(t));
        }
    }

    private Troop chooseCard(Scanner scan, List<Troop> hand, Player player) {
        System.out.println("Choose card (0 = skip, 1-3 = card):");
        String answer = scan.nextLine();

        Troop chosen = null;
        switch (answer) {
            case "1":
            case "2":
            case "3":
                int index = Integer.parseInt(answer) - 1;
                if (index < hand.size()) {
                    chosen = hand.get(index);
                }
                break;
            case "0":
                // Skip turn
                break;
            default:
                System.out.println("Invalid input. Skipping turn.");
                break;
        }

        player.setMana(1); // Always gain 1 mana regardless of play
        return chosen;
    }

    public Troop runCombat(Troop t1, Troop t2) {
        TroopActions_StateInterface a = new State_battle();
        TroopActions_StateInterface b = new State_battle();
        t1.set_state(a);
        t2.set_state(b);

        int maxTicks = Math.max(a.getAtkSpeed(t1), b.getAtkSpeed(t2));

        System.out.println("Combat begins: " + a.getName(t1) + " vs " + b.getName(t2));

        for (int tick = 1; tick <= maxTicks; tick++) {
            System.out.println("Tick " + tick);

            // Troop 1 attacks
            if (tick <= a.getAtkSpeed(t1)) {
                if (b.getType(t2).equalsIgnoreCase("Ground")) {
                    int newDef = b.getCurrGroundDefense(t2) - a.getCurrGroundDamage(t1);
                    b.setCurrGroundDefense(t2, Math.max(newDef, 0));
                } else {
                    int newDef = b.getCurrAirDefense(t2) - a.getCurrAirDamage(t1);
                    b.setCurrAirDefense(t2, Math.max(newDef, 0));
                }
            }

            // Troop 2 attacks
            if (tick <= b.getAtkSpeed(t2)) {
                if (a.getType(t1).equalsIgnoreCase("Ground")) {
                    int newDef = a.getCurrGroundDefense(t1) - b.getCurrGroundDamage(t2);
                    a.setCurrGroundDefense(t1, Math.max(newDef, 0));
                } else {
                    int newDef = a.getCurrAirDefense(t1) - b.getCurrAirDamage(t2);
                    a.setCurrAirDefense(t1, Math.max(newDef, 0));
                }
            }

            // Print status
            System.out.println(a.getName(t1) + " - G_DEF: " + a.getCurrGroundDefense(t1) + " A_DEF: " + a.getCurrAirDefense(t1));
            System.out.println(b.getName(t2) + " - G_DEF: " + b.getCurrGroundDefense(t2) + " A_DEF: " + b.getCurrAirDefense(t2));

            // Check for death after each tick
            boolean t1Dead = a.getCurrGroundDefense(t1) <= 0 && a.getCurrAirDefense(t1) <= 0;
            boolean t2Dead = b.getCurrGroundDefense(t2) <= 0 && b.getCurrAirDefense(t2) <= 0;

            if (t1Dead && t2Dead) {
                System.out.println("Both troops destroyed.");
                return null;
            } else if (t1Dead) {
                System.out.println(a.getName(t1) + " destroyed.");
                return t2;
            } else if (t2Dead) {
                System.out.println(b.getName(t2) + " destroyed.");
                return t1;
            }
        }

        // If after all ticks both are still alive
        System.out.println("Combat ends in mutual survival. Both troops disappear.");
        return null;
    }
}


