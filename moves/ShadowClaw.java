package moves;
import ru.ifmo.se.pokemon.*;
public class ShadowClaw extends PhysicalMove{
    public ShadowClaw() {
        super(Type.GHOST, 70, 100);
    }
    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def){
        if (1/8 > Math.random()) {
            System.out.println("Критический удар!");
            return 2.0;
        } else {
            return 1.0;
        }
    }
    @Override
    protected String describe() {
        return "применяет атаку Shadow Claw";
    }
}
