package lab2.mymoves.NidoranMoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(double pow, double acc){
        super(Type.ICE, pow, acc);
    }
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if(Program.chance(0.1)){
            Effect.freeze(p);
        }
    }
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
    }
    protected String describe(){
        String[] pieces= this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
