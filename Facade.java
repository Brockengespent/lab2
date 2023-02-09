package lab2.mymoves.SlugmaMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
    }
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
    }
    protected String describe(){
        String[] pieces= this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}

