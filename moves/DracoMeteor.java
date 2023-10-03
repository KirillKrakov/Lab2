package moves;
import ru.ifmo.se.pokemon.*;
public class DracoMeteor extends SpecialMove{
    public DracoMeteor() {
        super(Type.DRAGON, 130,90);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (p.getStat(Stat.SPECIAL_ATTACK) > -5) p.setMod(Stat.SPECIAL_ATTACK, -2);
        if (p.getStat(Stat.SPECIAL_ATTACK) == -5) p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    @Override
    protected String describe() {
        return "применяет атаку Draco Meteor";
    }
}
