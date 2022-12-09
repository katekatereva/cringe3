package person;

import condition.EmotionsActions;
import condition.GeopositionActions;
import condition.Position;

public class NoHuman extends Character{
    public NoHuman(String name, int age, String type, Position pos, GeopositionActions geo, EmotionsActions emo){
        super(name, age, type, pos, geo, emo);

    }

    @Override
    public void changePos(Position pam2) {

    }


    public void justChill() {
        String personName = this.getName();
        System.out.println(personName + " просто чиллит, потому что может себе позволить");
    }
}
