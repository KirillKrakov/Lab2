package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;
public class Giratina extends Pokemon {
    public Giratina(String name, int level) {
        super(name, level);
        setType(Type.GHOST,Type.DRAGON);
        setStats(150,100,120,100,120,90);
        setMove(new AncientPower(), new DarkPulse(), new ScaryFace(), new DracoMeteor());
    }
}
