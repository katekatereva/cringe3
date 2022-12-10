package condition;

public enum Position {

    STAND("вскакивает на ноги", "все еще стоит"),
    LIE("ложится", "жестко тильтует и все еще лежит\""),
    SIT("присел", "сидит");
    private String notEq;
    private String eq;
    Position(String notEq , String eq) {
        this.notEq = notEq;
        this.eq = eq;
    }
    public String getString(Position prev) {
        return prev == this ? eq : notEq;
    }
}

