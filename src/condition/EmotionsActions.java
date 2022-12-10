package condition;

public enum EmotionsActions {
    DELIGHT("приходит в восторг","остается в восторг"),
    JOY("начинает радоваться","радуется"),
    DOUBT("начинает сомневаться","сомневается"),
    NODOUBT("не сомневается","убедился"),
    NEUTRAL("успокаивается","остается спокойным"),
    ENVY("начинает завидовать","завидует");
    private String notEq;
    private String eq;
    EmotionsActions(String notEq , String eq) {
        this.notEq = notEq;
        this.eq = eq;
    }
    public String getString(EmotionsActions prev) {
        return prev == this ? eq : notEq;
    }
}
