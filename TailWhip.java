package lab2.mymoves.NidoranMoves;

import ru.ifmo.se.pokemon.*;

public class TailWhip extends SpecialMove {
    public TailWhip(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e= new Effect().stat(Stat.DEFENSE, -1);
    }
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
    }
    protected String describe(){
        String[] pieces= this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
