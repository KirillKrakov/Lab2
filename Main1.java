import moves.DarkPulse;
import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main1 extends DarkPulse {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Giratina("Евстапий", 1);
        Pokemon p2 = new Pancham("Акакий", 1);
        Pokemon p3 = new Pangoro("Добролюб", 1);
        Pokemon p4 = new Sewaddle("Ратибор", 1);
        Pokemon p5 = new Swadloon("Лучезар", 1);
        Pokemon p6 = new Leavanny("Белослав", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addFoe(p3);
        b.addAlly(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
