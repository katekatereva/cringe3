package person;

import condition.*;

public class Human extends Character implements ChangedEmotions, ChangedGeoposition, ChangePosition{
    final private String specifity;

    public Human(String name, int age, String type, Position pos, GeopositionActions geo, EmotionsActions emo, String specifity){
        super(name, age, type, pos, geo, emo);
        this.specifity = specifity;

    }
    public String getSpecifity() {
        return this.specifity;
    }

    @Override
    public void changeEmot(EmotionsActions state) {
        EmotionsActions prevEmo = this.getEmo();
        this.setEmotions(state);
        String personName = this.getName();
        Convert<EmotionsActions> con = x -> x.getString(prevEmo);
        System.out.println(personName + " " + con.write(state));
    }


    @Override
    public void changePos(Position pam2) {
        Position prevPos = this.getPos();
        this.setPos(pam2);
        String personName = this.getName();
        Convert<Position> con = x -> x.getString(prevPos);
        System.out.println(personName + " " + con.write(pam2));
    }


    @Override
    public void changeGeop(GeopositionActions pam) {
        GeopositionActions prevGeo = this.getGeo();
        this.setGeo(pam);
        String personName = this.getName();
        Convert<GeopositionActions> con = x -> x.getString(prevGeo);
        System.out.println(personName + " " + con.write(pam));
    }
}
