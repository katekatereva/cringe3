import person.*;
import condition.*;

public class Pam {
    public static void main(String[] args) {
    Human malish = new Human("Малыш", 10, "небольшой человек", Position.SIT, GeopositionActions.INSIDE, EmotionsActions.NEUTRAL, "давнозавидует");
    Human karlson = new Human("Карлсон", 35, "самый лучший товарищ по играм", Position.STAND, GeopositionActions.OUTSIDE, EmotionsActions.NEUTRAL, "живет на крыше");
    Human gunilla = new Human("Гунилла", 10, "хороший товарищ", Position.SIT, GeopositionActions.CITY, EmotionsActions.NEUTRAL, "быть никем");
    Human krister = new Human("Кристер", 10, "хороший товарищ", Position.SIT, GeopositionActions.CITY, EmotionsActions.NEUTRAL, "хвастается собака");
    NoHuman effa = new NoHuman("Еффа", 0, "небольшой человек", Position.SIT, GeopositionActions.CITY, EmotionsActions.NEUTRAL);
    malish.changePos(Position.STAND);
    malish.changePos(Position.STAND);
    malish.changeEmot(EmotionsActions.DELIGHT);
    malish.changeEmot(EmotionsActions.JOY);
    karlson.changeGeop(GeopositionActions.INSIDE);
    malish.changeEmot(EmotionsActions.NODOUBT);
    System.out.println(karlson.getName() + " " + karlson.getType());
    malish.changeEmot(EmotionsActions.NODOUBT);
    System.out.println(krister.getName() + " " + gunilla.getName() + " " + krister.getType());
    System.out.println(karlson.getName() + " " + karlson.getSpecifity());
    System.out.println(krister.getName() + " " + krister.getSpecifity() + " " + malish.getName() + " " + malish.getSpecifity());

    }
}
