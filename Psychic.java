package lab2.mymoves.LaprasMoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class Psychic extends PhysicalMove {
    public Psychic(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);

    }
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Program.chance(0.1)) {
            Effect e = new Effect().turns(-1).stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(e);
        }
    }
    protected String describe(){
        String[] pieces= this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
