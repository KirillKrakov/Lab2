package moves;
import ru.ifmo.se.pokemon.*;
public class DreamEater extends SpecialMove{
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected boolean checkAccuracy(Pokemon p, Pokemon p1) {
        if (p1.getCondition() == Status.SLEEP) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) (p.getStat(Stat.HP) - p.getHP()) / 2);
    }
    @Override
    protected String describe() {
        return "применяет атаку Dream Eater";
    }
}
