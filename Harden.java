package lab2.mymoves.SlugmaMoves;

import ru.ifmo.se.pokemon.*;

public class Harden extends StatusMove {
    public Harden(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.DEFENSE, +1);
        p.addEffect(e);
    }

    protected String describe(){
        String[] pieces= this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
