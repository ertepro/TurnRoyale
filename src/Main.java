public class Main {
    public static void main(String[] args) {
        Troop Troop1 = new Troop();
        String name= "Skeleton"     ;
     var sender=TroopFactory.createTroop(name);
     sender.send(Troop1);



    }
}