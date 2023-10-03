package moves;
import ru.ifmo.se.pokemon.*;
public class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect rest1 = new Effect().turns(2).condition(Status.SLEEP);
        p.setMod(Stat.HP,(int) (p.getStat(Stat.HP) - p.getHP()));
        p.addEffect(rest1);
    }
    @Override
    protected String describe() {
        return "применяет атаку Rest";
    }
}
