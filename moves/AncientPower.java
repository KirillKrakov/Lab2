package moves;
import ru.ifmo.se.pokemon.*;
public class AncientPower extends SpecialMove{
    public AncientPower(){
        super(Type.ROCK, 60, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if (Math.random() <= 0.1) {
            if (p.getStat(Stat.ATTACK) < 6) p.setMod(Stat.ATTACK, +1);
            if (p.getStat(Stat.DEFENSE) < 6) p.setMod(Stat.DEFENSE, +1);
            if (p.getStat(Stat.SPECIAL_ATTACK) < 6) p.setMod(Stat.SPECIAL_ATTACK, +1);
            if (p.getStat(Stat.SPECIAL_DEFENSE) < 6) p.setMod(Stat.SPECIAL_DEFENSE, +1);
            if (p.getStat(Stat.SPEED) < 6) p.setMod(Stat.SPEED, +1);
        }
    }
    @Override
    protected String describe(){
        return "применяет атаку Ancient Power";
    }
}
