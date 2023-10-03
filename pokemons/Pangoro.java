package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;
public class Pangoro extends Pancham {
    public Pangoro(String name, int level){
        super(name, level);
        setType(Type.FIGHTING, Type.DARK);
        setStats(95,124,78,69,71,58);
        setMove(new Leer(), new ShadowClaw(), new CometPunch(), new DragonClaw());
    }
}
