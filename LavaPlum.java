package lab2.mymoves.SlugmaMoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class LavaPlum extends SpecialMove {
    public LavaPlum(double pow, double acc){
        super(Type.FIRE, pow, acc);
    }
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if(Program.chance(0.3)){
            Effect.burn(p);

    }

    }
    protected String describe(){
        String[] pieces= this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
