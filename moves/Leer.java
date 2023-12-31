package moves;
import ru.ifmo.se.pokemon.*;
public class Leer extends StatusMove{
    public Leer(){
        super(Type.NORMAL,0,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (p.getStat(Stat.DEFENSE) > -6) p.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "применяет атаку Leer";
    }
}
