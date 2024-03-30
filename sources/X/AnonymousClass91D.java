package X;

/* renamed from: X.91D  reason: invalid class name */
public enum AnonymousClass91D implements C22899AyB {
    CONNECTED(0),
    MISSED(1),
    FAILED(2),
    REJECTED(3),
    ACCEPTED_ELSEWHERE(4),
    ONGOING(5),
    SILENCED_BY_DND(6),
    SILENCED_UNKNOWN_CALLER(7);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass91D(int i) {
        this.value = i;
    }

    public static AnonymousClass91D A00(int i) {
        switch (i) {
            case 0:
                return CONNECTED;
            case 1:
                return MISSED;
            case 2:
                return FAILED;
            case 3:
                return REJECTED;
            case 4:
                return ACCEPTED_ELSEWHERE;
            case 5:
                return ONGOING;
            case 6:
                return SILENCED_BY_DND;
            case 7:
                return SILENCED_UNKNOWN_CALLER;
            default:
                return null;
        }
    }

    public final int BEY() {
        return this.value;
    }
}
