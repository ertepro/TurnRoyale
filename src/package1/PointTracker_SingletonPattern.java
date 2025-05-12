package package1;

// --Sams guide to the singleton pattern in this game
//      (1) tbh just keep your hands off this code
//          especially the public static function
//      (2) to call this function onto your class use -> PointTracker_SingletonPattern anotherSingleton = Point...,.getInstance();

public class PointTracker_SingletonPattern {
    private int player1_score;
    private int player2_score;
    private int game_rule = 1;

    private static PointTracker_SingletonPattern instance;

    PointTracker_SingletonPattern() {
        player1_score = 0;
        player2_score = 0;
    }

    public static PointTracker_SingletonPattern getInstance() {
        if (instance == null) {
            instance = new PointTracker_SingletonPattern();
        }
        return instance;
    }

    public int getPlayer1_score() {
        return player1_score;
    }
    public void setPlayer1_score(int player1_score) {
        this.player1_score = player1_score;
    }
    public int getPlayer2_score() {
        return player2_score;
    }
    public void setPlayer2_score(int player2_score) {
        this.player2_score = player2_score;
    }

    public int get_game_rule() {
        return game_rule;
    }

    public void set_game_rule(int game_rule) {
        this.game_rule = game_rule;
    }
}
