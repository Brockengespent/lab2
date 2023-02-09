package lab2.mymoves.LaprasMoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class AncientPower extends PhysicalMove {
    public AncientPower(double pow, double acc){
        super(Type.ROCK, pow, acc);
    }
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
    }
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        if (Program.chance(0.1)){
            Effect e = new Effect().stat(Stat.HP, +1).stat(Stat.ATTACK, +1).stat(Stat.DEFENSE, +1).stat(Stat.SPECIAL_ATTACK, +1).stat(Stat.SPECIAL_DEFENSE, +1).stat(Stat.SPEED, +1);
            p.addEffect(e);
        }
    }
    protected String describe(){
        String[] pieces= this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}