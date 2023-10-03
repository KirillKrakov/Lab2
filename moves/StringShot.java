package moves;
import ru.ifmo.se.pokemon.*;
public class StringShot extends StatusMove{
    public StringShot() {
        super(Type.BUG, 0, 95);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (p.getStat(Stat.SPEED) > -5) p.setMod(Stat.SPEED, -2);
        if (p.getStat(Stat.SPEED) == -5) p.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "применяет атаку String Shot";
    }
}
