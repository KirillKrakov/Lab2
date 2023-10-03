package moves;
import ru.ifmo.se.pokemon.*;
public class DragonClaw extends PhysicalMove{
    public DragonClaw(){
        super(Type.DRAGON, 80, 100);
    }
    @Override
    protected String describe() {
        return "применяет атаку Dragon Claw";
    }
}
