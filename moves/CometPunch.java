package moves;
import ru.ifmo.se.pokemon.*;
public class CometPunch extends PhysicalMove{
    public CometPunch() {
        super(Type.NORMAL, 18, 85);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double d) {
        double rand = Math.random();
        if (rand <= 3/8){
            super.applyOppDamage(p, d * 2);
        } else if (rand <= 6/8) {
            super.applyOppDamage(p, d * 3);
        } else if (rand <= 7/8) {
            super.applyOppDamage(p, d * 4);
        } else if (rand <= 8/8) {
            super.applyOppDamage(p, d * 5);
        }
    }
    @Override
    protected String describe() {
        return "применяет атаку Comet Punch";
    }
}


