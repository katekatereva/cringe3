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
        if (state == EmotionsActions.DELIGHT) {
            System.out.println(personName +
                    (prevEmo != EmotionsActions.DELIGHT ? " приходит в восторг" : " остается в восторге"));
        } else if (state == EmotionsActions.JOY) {
            System.out.println(personName +
                    (prevEmo != EmotionsActions.JOY ? " начинает радоваться" : " радуется"));
        } else if (state == EmotionsActions.DOUBT) {
            System.out.println(personName +
                    (prevEmo != EmotionsActions.DOUBT ? " начинает сомневаться" : " сомневается"));
        }else if (state == EmotionsActions.NODOUBT) {
            System.out.println(personName +
                    (prevEmo != EmotionsActions.NODOUBT ? " не сомневается" : " убедился"));
        } else if (state == EmotionsActions.NEUTRAL) {
            System.out.println(personName +
                    (prevEmo != EmotionsActions.NEUTRAL ? " успокаивается" : " остается спокойным"));
        } else if (state == EmotionsActions.ENVY) {
            System.out.println(personName +
                    (prevEmo != EmotionsActions.ENVY ? " начинает завидовать" : " завидует"));
        }
    }


    @Override
    public void changePos(Position pam2) {
        Position prevPos = this.getPos();
        this.setPos(pam2);
        String personName = this.getName();
        if (pam2 == Position.STAND) {
            System.out.println(personName +
                    (prevPos != Position.STAND ? " вскакивает на ноги" : " все еще стоит"));
        } else if (pam2 == Position.LIE) {
            System.out.println(personName +
                    (prevPos != Position.LIE ? " ложится" : " жестко тильтует и все еще лежит"));
        } else if (pam2 == Position.SIT) {
            System.out.println(personName +
                    (prevPos != Position.SIT ? " присел" : " сидит"));
        }
    }


    @Override
    public void changeGeop(GeopositionActions pam) {
        GeopositionActions prevGeo = this.getGeo();
        this.setGeo(pam);
        String personName = this.getName();
        if (pam == GeopositionActions.STREET) {
            System.out.println(personName +
                    (prevGeo != GeopositionActions.STREET ? " очутился на улице" : " все еще ходит по улице"));
        } else if (pam == GeopositionActions.CITY) {
            System.out.println(personName +
                    (prevGeo != GeopositionActions.CITY ? " прибыл в город" : " продолжает чиллить в городе"));
        } else if (pam == GeopositionActions.OUTSIDE) {
            System.out.println(personName +
                    (prevGeo != GeopositionActions.OUTSIDE ? " пафосно вышел" : " а че как выйти из выхода?"));
        } else if (pam == GeopositionActions.INSIDE) {
            System.out.println(personName +
                    (prevGeo != GeopositionActions.INSIDE ? " врывается внутрь" : " жестко остается на месте"));
        }
    }
}
