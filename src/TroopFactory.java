import java.util.Objects;

public class TroopFactory {

public static TroopSender
    createTroop(String name){
       if(Objects.equals(name, "Skeleton")){
           return new Skeleto();
       }else{
           return new AirTroop();
       }
   }
}
