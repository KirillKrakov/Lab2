package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;
public class Pancham extends Pokemon{
    public Pancham(String name, int level){
        super(name, level);
        setType(Type.FIGHTING);
        setStats(67, 82, 62, 46,48,43);
        setMove(new Leer(), new ShadowClaw(), new CometPunch());
    }
}
