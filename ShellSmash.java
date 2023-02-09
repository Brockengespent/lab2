package lab2.mymoves.SlugmaMoves;

import ru.ifmo.se.pokemon.*;

public class ShellSmash extends StatusMove {
    public ShellSmash(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
    }
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.DEFENSE, -1).stat(Stat.SPECIAL_DEFENSE, -1).stat(Stat.ATTACK, +2).stat(Stat.SPECIAL_ATTACK, 2).stat(Stat.SPEED, +2);
        p.addEffect(e);
    }
    protected String describe(){
        String[] pieces= this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
