package moves;
import ru.ifmo.se.pokemon.*;
public class ScaryFace extends StatusMove{
    public ScaryFace() {
        super(Type.NORMAL, 0,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (p.getStat(Stat.SPEED) > -5) p.setMod(Stat.SPEED, -2);
        if (p.getStat(Stat.SPEED) == -5) p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {
        return "применяет атаку Scary Face";
    }
}
