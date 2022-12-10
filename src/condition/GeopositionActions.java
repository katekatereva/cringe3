package condition;

public enum GeopositionActions {
    STREET("очутился на улице", "все еще ходит по улице"),
    CITY("прибыл в город", "продолжает чиллить в городе"),
    OUTSIDE("пафосно вышел", "а че как выйти из выхода?"),
    INSIDE("врывается внутрь", "жестко остается на месте");
    private String notEq;
    private String eq;
    GeopositionActions(String notEq , String eq) {
        this.notEq = notEq;
        this.eq = eq;
    }
    public String getString(GeopositionActions prev) {
        return prev == this ? eq : notEq;
    }
}

