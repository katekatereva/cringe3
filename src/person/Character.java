package person;

import condition.*;
import person.*;

public abstract class Character{
    private Position pos;
    private GeopositionActions geo;
    final private String name;
    final private String type;
    final private int age;
    private EmotionsActions emo;


     public Character(String name, int age, String type, Position pos, GeopositionActions geo, EmotionsActions emo) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.pos = Position.SIT;
        this.geo = GeopositionActions.OUTSIDE;
        this.emo = EmotionsActions.NEUTRAL;
    }

    final public String getName() {
        return this.name;
    }
    final public int getAge() {
        return this.age;
    }
    final public String getType() {
        return this.type;
    }


    public GeopositionActions getGeo() {
        return geo;
    }

    public void setGeo(GeopositionActions geo) {
        this.geo = geo;
    }

    public Position getPos() {
        return pos;
    }
    public void setPos(Position pos) {
        this.pos = pos;
    }

    public EmotionsActions getEmo() {
        return emo;
    }
    public void setEmotions(EmotionsActions emo){
         this.emo = emo;
    }



    @Override
    public boolean equals(Object obj) {
        return (obj.getClass().equals(this.getClass()) && ((Character) obj).getName().equals(this.getName()));
    }

    @Override
    public String toString() {
        return String.format("Я - %s", this.getName());
    }

    public abstract void changePos(Position pam2);
}