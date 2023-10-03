package moves;
import ru.ifmo.se.pokemon.*;
public class GrassWhistle extends StatusMove{
    public GrassWhistle(){
        super(Type.GRASS, 0, 55);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        double rand = Math.random();
        int turn = 0;
        if (rand <= 1/3){
            turn = 1;
        } else if (rand <= 2/3) {
            turn = 2;
        } else if (rand <= 3/3){
            turn = 3;
        }
        Effect rest1 = new Effect().turns(turn).condition(Status.SLEEP);
        p.addEffect(rest1);
    }
    @Override
    protected String describe() {
        return "применяет атаку Grass Whistle";
    }
}
