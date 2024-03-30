package X;

/* renamed from: X.91C  reason: invalid class name */
public enum AnonymousClass91C implements C22899AyB {
    UNKNOWN(0),
    EMPTY(1),
    TEXT(2),
    DOCUMENT(3),
    IMAGE(4),
    VIDEO(5),
    LOCATION(6);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass91C(int i) {
        this.value = i;
    }

    public static AnonymousClass91C A00(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return EMPTY;
            case 2:
                return TEXT;
            case 3:
                return DOCUMENT;
            case 4:
                return IMAGE;
            case 5:
                return VIDEO;
            case 6:
                return LOCATION;
            default:
                return null;
        }
    }

    public final int BEY() {
        return this.value;
    }
}
