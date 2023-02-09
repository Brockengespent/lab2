package lab2.mymoves.LaprasMoves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(e);
    }
    protected String describe(){
        String[] pieces= this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}